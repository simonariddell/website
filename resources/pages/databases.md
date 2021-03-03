MapReduce and Distributed Filesystems

MapReduce takes one or more inputs and produces one or more outputs.
MapReduce normally doe snot modify inputs.

Other distributed filesystems besides HDFS exist, such as Amazon s3. It seems these serve the same purpose.

These are based on a shared-nothing principle. Shared disk storage is implemented by a centralized storage application.

HDFS (or presumably laternatives) consists of daemon processes running on each machine, which expose a network service that allow other nodes to access files storedo n that machine. 

Map Reduce is a framework to write code to process large datasets in a distributed filesystem.

The pattern works as follows:
Read a set of input files, and break it into records. 
Call the mapper function to extract a key and value from each input record.
sort all the key-value pairs by key.
call reducer function to iterate over sorted k:v pairs.

Mapper: Called once for every iput record. Job is to extract key and value from input record.
Reducer: 
Reducer: Takes kv pairs by the mapper, collects values belonging to the same key, and calls reducer with an iterator over the values.

LSM_Trees*

MapReduce workflows tend to be chained together.

# Pyspark notes
PySpark might read data from HDFS, NoSQL databases, or a relational
database management system (RDBMS). After data analysis, we can also save the results
into HDFS or databases.


https://spark.apache.org/

>Write applications quickly in Java, Scala, Python, R, and SQL.
>Spark offers over 80 high-level operators that make it easy to build parallel apps. And you can use it interactively from the Scala, Python, R, and SQL shells.
> Spark runs on Hadoop, Apache Mesos, Kubernetes, standalone, or in the cloud. It can access diverse data sources.
> Does Spark require modified versions of Scala or Python?

No. Spark requires no changes to Scala or compiler plugins. The Python API uses the standard CPython implementation, and can call into existing C libraries for Python such as NumPy.

https://spark.apache.org/examples.html

> The pyspark.sql module contains syntax that users of Pandas and SQL will find familiar. The pyspark.ml module can be used to implement many popular machine learning models.

> When I define an operation — new_df = df.filter(df.user_action == 'ClickAddToCart') — Spark adds the operation to my DAG but doesn’t execute. Once I ask for a result — new_df.collect() — Spark executes my filter and any other operations I specify.


>  A typical Spark workflow is to read data from an S3 bucket or another source, perform some transformations, and write the processed data back to another S3 bucket.

>Amazon EMR (Elastic Map Reduce) is a big data platform that synchronizes multiple nodes into a scaleable cluster that can process large amounts of data. As mentioned above, we submit our jobs to the master node of our cluster, which figures out the optimal way to run it. The master node then doles out tasks to the worker nodes accordingly.

The /*.parquet syntax in input_path tells Spark to read all .parquet files in the s3://amazon-reviews-pds/parquet/product_category=Books/ bucket directory.

https://towardsdatascience.com/production-data-processing-with-apache-spark-96a58dfd3fe7
>Once I know my code works, I may want to put the process in play as a scheduled job. I’ll put the code in a script so I can put it on a schedule with Cron or Apache Airflow.



>The example is simple, but this is a common workflow for Spark.
1 Read the data from a source (S3 in this example).
2 Process the data or execute a model workflow with Spark ML.
3 Write the results somewhere accessible to our systems (another S3 bucket in this example).


https://s3.amazonaws.com/assets.datacamp.com/blog_assets/PySpark_SQL_Cheat_Sheet_Python.pdf


https://spark.apache.org/docs/2.1.0/sql-programming-guide.html
https://github.com/apache/spark/blob/master/python/pyspark/rdd.py

The entry point into all functionality in Spark SQL is the SQLContext class, or one of its descendants. To create a basic SQLContext, all you need is a SparkContext.

https://github.com/apache/spark/blob/master/python/pyspark/sql/dataframe.py

> Spark SQL is a component on top of Spark Core that introduced a data abstraction called DataFrames


> import org.apache.spark.sql.SparkSession

val url = "jdbc:mysql://yourIP:yourPort/test?user=yourUsername;password=yourPassword" // URL for your database server.
val spark = SparkSession.builder().getOrCreate() // Create a Spark session object

val df = spark
  .read
  .format("jdbc")
  .option("url", url)
  .option("dbtable", "people")
  .load()

df.printSchema() // Looks the schema of this DataFrame.
val countsByAge = df.groupBy("age").count() // Counts people by age

//or alternatively via SQL:
//df.createOrReplaceTempView("people")
//val countsByAge = spark.sql("SELECT age, count(*) FROM people GROUP BY age")
>

A spark session can run SQL over a dataframe.
the dataframe itself has access to its own helper functions


https://stackoverflow.com/questions/45430816/writing-sql-vs-using-dataframe-apis-in-spark-sql

In your Spark SQL string queries, you won't know a syntax error until runtime (which could be costly), whereas in DataFrames syntax errors can be caught at compile time.

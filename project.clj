(defproject web-site "0.1.0-SNAPSHOT"
  :description "source code"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [stasis "1.0.0"]
                 [ring "1.2.1"]
                 [hiccup "1.0.5"]
                 [me.raynes/cegdown "0.1.1"]
                 [enlive "1.1.5"]]
  :ring {:handler web-site.web/app}
  :profiles {:dev {:plugins [[lein-ring "0.8.10"]]}})

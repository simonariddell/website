
# Links
https://web.stanford.edu/~hastie/StatLearnSparsity_files/SLS_corrected_1.4.16.pdf

information theory;
https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-441-information-theory-spring-2016/lecture-notes/

tibshinari bootstrap
https://projecteuclid.org/download/pdf_1/euclid.ss/1177013815

# Bootstrap
https://projecteuclid.org/download/pdf_1/euclid.ss/1177013815

# Lasso 
http://statweb.stanford.edu/~tibs/lasso/lasso.pdf


Notes:
Lasso minimizes residual sum of squares subject to the sum of the absolute value of the coefficients being less than a constant.

Reasons to be unhappy with OLS:
1. low bias but large variance. By shrinking coefficinets we sacrifice a little bias to reduce variance.
2. Interpretatino.

lasso: least absolute shrinkage and selection operator.

The lasso definition:
(x^i, y_i), i=1,2,...,N
where xi=(x1,...x)T

assume xij are standardized s.t.
the sum of xij/N is equal to zero,
and the sum of xij^2 is equal to 1.

The parameter t>0 controls the amount of shrinkage
applied to estimates.
Note that the absolute sum of the coefficients
must be less than or equal to t.

For example
let B be the full least squares estimate, and let
to be the absolute sum of that least squares estimate.
Based on this values of t less than this will cause shrinkage towards zero. Or if t/2, that's equivalent to finding the best subset of size p/2.


In 2.2 they discuss the orthonormal design case, this is when CTX=I the identity matrix.
I think this is done to simplify the explanation, since we don't have to deal with any correlated regressors? This is not obvious to me wh y they do this.

I suppose it allows them to show a special case that avoids additional complexity.

Geometry of the lasso:
The lasso sets some coefficients to zero
whereas ridg, with a constraint of B^2<t, does not.

The geometry is where we get the famous picture example where there is the square constraint for lasso and circle for ridge. The elliptical contours .

It's hard to get standard error estimates without bootstrapping. But you can get approximate standard errors by approximating the solution with a ridge regression. 

There are three ways to estimate the lasso parameter. Essentially cross-validation, as well as an analytic measure of risk.

5. Lasso as Bayes Estimate.
The lasso constraint is equivalent to the addition of a penalty term to the residual sum of squares.
penalty term = Lambda sum|bj|

as a result, we can derive the lasso estimate as the bayes posterior mode under independent double-exponential priors for the Bjs

f(Bj) = 1/2tau*exp(-|Bj|/tau)
with tau = 1/lambda


6. Algorithms for finding lasso solutions.
with t>0 we can express the equation as a leas squares problem with 2^p inequality constraints.

8. Application to generalized regression models.
The lasso can e applied to other generalized regression models.

8.1 They extend it to logistic regression

# Casella & Berger

3.4:

Exponential families are a pretty neat refactoring of the previous set of parametric distributions.
It turns out we can write them all in a standard format, which contains the common
components of each distribution. The useful part of working through the math is to build
an intuition for *why* exactly the exponential family exists. Most people 'know' in a shallow
sense lots of distributions belong here, but this fleshes it out a little more.

There is also the continued and added benefit of just developing deeper statistical maturity
by being forced to do excersises that require you to manipulate and mess with the standard
set of distributions. That way when you see them later it's not 'weird'. My experience so far
is that since there aren't that many used exponential distributions, being good at manipulating them
doesn't require a bottomless well of pure mathematical insight. You learn the tricks and strategies
for reasoning about their structure, and unless you're doing or reading deeper theoretical research,
that's probably enough.

The next step focuses more on natural parameters, which are pretty neat. By simply rewriting
the family as: {n=(n1,...nk): integral(-inf,inf)h(x)exp(sum i-1 to k)ni*ti(x)) dx<inf}
we notice that we retrieve the 'natural parameters', which are distinct from the
standard parameters we reason about. 

So for a normal distribution, for example, we would get two different parameters, n1=1/sigma^2, 
n2=mu/sigma^2, which make some math easier, but are less interpretable.

Again, this is a little weird, although perhaps less weird if you think about it more from an
mathematical perspective: There is some intrinsic set of parameters that govern this distribution.
We know the length of the set is two, but the symbolic formulation can be modified so long
as it's constrained by the fundamental properties.

In some cases, however, the length of the set of parameters does not have to equal the standard
number of parameters for the distribution. In these cases we call them curved exponential families.
This would be, for example, the case where sigma^2=mu^2 in a normal distribution.

(side note: This entire section has so many parallels to functional programming.
Exponential families can be thought of as a refactoring of all distributions
into functions that are commonly composed by a higher-order function. Curved exponential
families remind me of partials, where a single parameter is restricted)

3.25, 3.26, 3.28 (a, c, d) 3.29, (a, c, d)
3.31


4.13:
This is an interesting problem. I've run into it in a few sources, and it reflects an important property.
We want to show that for a joint distribution (Y,X) that the E(Y|X) is the minimizing function.
This is sort of the first introduction to a regression, formally.
Specifically, E(Y-E(Y|X))^2 for E(Y|X) that is the minimizing function for quadratic loss.
The proof does some manipulation to expand out the equation, showing that g(x)=E(Y|X)
Now, even in a multi-dimensional case, for quadratic loss E(Y-E(Y|x1...xn)) will still be the minimum.

In some sense, effectively this seems to mean that all prediction is just taking the conditional distribution.
Of course, writing that up it feels obvious! But this is just the formal intuition that if you know the joint distribution,
you know the solution. But that doesn't imply you can predict everything perfectly, because the joint distribution
will still have uncertainty in a conditional expectation function. That is, there may still be some
irreducible loss when you minimize the regression. 

We can even simplify this a little further.
Consider the risk function $$/theta$$

Let x be a random variable with

# Differentiating under an integral

So, it turns out in statistics being able to differentiate under an integral is a useful thing to do.
Who knew. 

Basically what this mean is that we do this:

$$\frac{d}{d\theta} \int_{a}^{b} f(x,\theta) \, dx = \int_{a}^{b} \frac{\partial}{\partial{\theta}}f(x, \theta)dx$$

This makes sense, because in this case t is a parameter, and x is the variable of integration,
so it's not a parameter. As a result the integral in the first half of the equation, reduces to
a function of t. As a result we can exchange the order, and take the integral of the partial derivative
of t.

https://kconrad.math.uconn.edu/blurbs/analysis/diffunderint.pdf


This is useful in solving MGFs. In C&B example 2.4.5 we can easily take the derivative
of the MGF of an exponential by differentiating under the integral. 

# Conditional Variance 
https://quant.stackexchange.com/questions/8251/how-to-calculate-the-conditional-variance-of-a-time-series

# Hoeffding's inequality

Hoeffding's inequality allows us to create confidence intervals for a binomial
parameter p. In practice, this can be useful for evaluating the performance of a classifier.
The link below goes into more detail, but essentially each X_i can be regarded
as a Bernoulli with unknown mean p. We then have some observed error rate, but this is our
sample error rate, not our true error rate. We can use Hoeffding's inequality
to determine the sample distribution of our error classification, which is useful
for extrapolating to out-of-sample accuracy. I would imagine this is particularly useful
in a case where you want to determine some reasonable bounds for your classifier but, for some reason,
can't empirically derive it with cross-validation. Or perhaps in addition to cross-validation.
Or, maybe even more interestingly, get the theoretical bounds, then see if they align with your empirical CV
bounds, then see if those two 'disagree,' for some interesting definition of disagree.


http://faculty.washington.edu/yenchic/18W_425/Lec15_conc.pdf


# Information Theory

https://www.inference.org.uk/itprnn/book.pdf

# Open question:
There is an insanely rich theoretical basis for GLMs. And learning this actually seems
valuable for understanding the field in general, and building statistical maturity. With that said,
why do we only have theory for linear models? I mean, I get that they were more common and computationally tractable at first,
but I'm curious if there is another reason. Is it too difficult to make general statements or build a theory up for
ML and general nonlinear functions? I could guess that 'nonlinear' vs 'linear' is sort of like "literally everything" vs. "A tiny subset of things"
which would be a good case. 

Or what about the fact that the last layer of a deep net is linear? NNs learn features that are nonlinear functions of the information
in the input. But the final layer is a linear combination. So a NN is a nonlinear function of X
but it's a linear function of the final learned feature space. Is that meaningful? I guess the question as to whether NN are interpretable
is *really* a question as to whether or not learned features are interpretable. 

If we imagine a case where the learned features do have an interpretation, then could we do statistical inference on them?
I guess we could, right? I mean, why not? Although in reality it's difficult to imagine how this would happen,
since if there exists a transformed feature set X' that is 100x more interpretable than X'', but 0.001% less optimal w.r.t the loss function.
it would get chosen.

# Deep Learning
DL book
https://www.deeplearningbook.org/
Chatper 6:

Very generic feature mappings are usually based only on the principle of localsmoothness and do not encode enough prior information to solve advancedproblems.
-- This is how they 'learn' features in Nonparametric Econometrics. In those cases, it largely seems,
that the model uncertainty arises from being unable or unwilling to specify a parametric structure for your pdf.
In that sense what would we call that? Parametric or distributional uncertainty? 
It seems the idea there is that there does exist some parametric structure, but we just don't know what it is,
so we need to approximate it.

Alternatively, the DL approach seems to be saying there is information in the features, but there exists
some unknown set of transformations that can be applied on those features, which will help reveal to the model
the correct weighting scheme to take.

I guess in the nonparametric econometrics take, you get to retain a lot of deep statistical and econometric theory,
by trying to keep things largely the same, but relaxing parametric assumptions. Ultimately the goal there is still
to do some sort of inference on a known structure, where some estimation strategies of that structure
are unknown.


# Frisch-Waugh-Lovell
I still need to formally work through the proof, but essentially
what we do here is figure out a way to partial an explantory variable out of both the
dependent variable, as well as all the other explanatory variables.
1. http://mlovell.web.wesleyan.edu/Publications/SPFWLTheorem.pdf
2. https://web.stanford.edu/~hastie/Papers/ESLII.pdf#page=71
3. John Starchuski's book. (https://johnstachurski.net/pdfs/emet_samples/ch11.pdf)

Note: It'd be interesting to combine this with DNNs. Since the last layer of a DNN is linear,
if you were to partition X into to sets of information u, v in X, and gave v to the DNN to learn a feature representation, V
you could then partial out V from u and y, and get a estimate of u, conditioned on *all* information embedded in v,
right?

# Bivariate Distributions and Correlation

C&B 4.5.10

https://deepblue.lib.umich.edu/bitstream/handle/2027.42/147087/rssc01350.pdf?sequence=1&isAllowed=y
https://stats.stackexchange.com/questions/3730/pearsons-or-spearmans-correlation-with-non-normal-data

Correlation will measure the linear relationship between two continuous variables. While in C&B it's presented
as arising from a bivariate normal, this is not a required assumption to use a correlation. Rather, it's required if we
want to claim the correlation is an exhaustive measure of their association. 



Greedy Function Approximation.
https://projecteuclid.org/euclid.aos/1013203451


* Function estimation 
Obtain an estimate or approximation of 

For a regression tree, the parameters are splitting variables, split locations,
and terminal nodes means of individual trees.

# 2
For non-parametric methods, we can use numerical approximation in function space.
This, essentially, is defined as a set of functions, each of which is incremental over the past,
that are themselves functions of the data. Each incremental function is based off of a 'step' or a 'boost'
defined by an optimization method (in this case steepest descent).

This sort of makes sense, as we are 'learning' a function, according to some rules, and need some sort of
super-structure to decide why an incremental and new function is better than the last.

Actually, when we think about it this way it becomes obvious why trees are such a nice function. They are dead simple,
and focus on iterative splits, which may be optimal in some sense. In the end, you're left with a tree structure based
look-up table. Well, a conditional look-up table, that lets you 'look up' the expected value for your parameter. Where
the parameter is the vector of data associated with a row. 

Although for this case, it doesn't generalize, unless we are using infinite data, as it requires the exact parameter vector
x. Apparently.

#3
For finite data, to generalize, we need to use nearby training data points. This works by imposing smoothness.

One way to do this is to use *parameters*. 

From here, they extend this to the first algorithm, Gradient Boosting.
Essentially, and I guess I already knew this, this algorithm focuses on fitting some function, then adding a weak learner on the
residual, and then evaluating the new gradient, and iterating forward.

Algorithms:
What's interesting, is different loss functions seem to genuinly change how the author represents the algorithms. This isn't so much a mathematical point, as an interesting point. I typically thought of different loss functions as "flavors" of the same thing, but here they seem to be treated as sincerely and fundamentally different. Hmm. Interesting.


Regression Trees:
Each base learner is a J-terminal node regression (what's that?)

disjoint regions of the space of all joint values of the predictor variables of x can be interpreted
as the terminal nodes of the corresponding trees. 
In effect, it's learning a correct value b for each of these nodes. In this sense it's learning the joint mapping
by breaking the joint distribution into partitions, and assigning each area some value b that minimizes the
objective function.





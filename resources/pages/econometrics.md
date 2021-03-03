
# TODO:

https://ocw.mit.edu/courses/economics/14-382-econometrics-spring-2017/lecture-notes/MIT14_382S17_lec1.pdf


#
Chapter 8
Estimators.

Conceptually these problems take the form where we consider some outcome space, some data set, some sample space, and some joint distribution of a sample.

A class of distributions is parametric if i can be indexed by finitely many parameters. Otherwise it is nonparametric.

$$
\mathscr P =\{ P_\theta : \theta \in O \} \ for\  some\  O \subset \mathbb R^N
$$

Where $\mathscr P$ is a parametric class. 

A statistic is any borel measurable function
$T:  Z_D \Rightarrow S$

If we want to infer the mean of the marginal distribution P of IID data, then the most common estimator is the sample mean, duh.

Formally, this is a mapping from $Z_d = R^N$ to $S=R$
This mapping is regarded as an estimator of the unknown mean

A common estimator of the kth moment of P is the kth sample moment of P.

$$
1/N * \Sigma x_n^k
$$

A common estimator of the variance is the sample variance etc etc.

Convergence:
The empirical distribution is asymptotically an excellent estimator of P. If z1,...,zn are IID with common distribution P, and $\hat P$ is an empirica distribution, then by the LLN.

https://en.wikipedia.org/wiki/Glivenko%E2%80%93Cantelli_theorem

https://www.stat.berkeley.edu/~bartlett/courses/2013spring-stat210b/notes/8notes.pdf

Identification.
A class of distributions $P_\theta$ indexed by $\theta$ is called identifiable if the map $\theta \Rightarrow P_\theta$ is one-to-one.

Identifiability means that the parameter vector associated with the unknown distribution can eventually be distinguished from the data.

Essentially the set of parameters to the indexed distribution must be 1:1

The plug-in method
to estimate $\gamma(P)$ use $\gamma(\hat P_N)$

Where $\hat P_N$ is the empirical distribution constructed from te sample. So we replace the unknown distribution with the observable distribution and then evaluate the function.

8.2.1.1 Best linear predictor.

Consider the best linear predictor.
We know we want to minimize the expected value of (y-$\alpha$-$\beta$)^2

But in this case the (x,y) we are minimizing come from an underlying distribution P which is unknown.

In fact, we can imagine we only have a sample of ((x1,y1),..,(Xn,yn))

As a result we use the empirical distribution, and plug this into the original equation. As a result our parameters are estimators of the underlying features. 

There are limitations to plug-in estimators, such as trying to get the density of an ECDF, which is either zero or a jump, cause of how the ECDF is. In this case we would want some sort of regularization/smoothing, which is the same thing as saying we have additional prior information on how the empirical distribution should truly be.

Empirical risk minimization.

So we can consider a setting where we observe some input and an output. Both are random variables with a join distribution. Our goal is to choose a function such that f(x) is our prediction as a function of x. 

The way we measure our loss is through a loss function. 

In a statistiacl setting, we obvoiusly cannot evaluate the true distribution, as this requires knowledge of the join distribution, as a result we evaluate the empirical distribution.

This is called the empirical risk. We want to minimize the empirical risk over a restricted function space.

If we restrict our function space (hypothesis space) to $\alpha$ + $\beta x_n$ type functions, then quadratic loss reduces to a simple linear least squares problem.

When we first acme to this problem in 8.13, we got to this solution by using the plug-in estimator to find the best linear predictor, whereas here we are simply trying to find the best predictor, while restricting ourselves to linear approximations.
    
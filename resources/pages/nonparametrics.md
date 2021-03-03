
Nonparametic statistics:

I've been studying Nonparametric statistics after building an alright foundation in typical parametric mathematical statistics
So far I've enjoyed it quite a bit,as  is it is a really low level primitive that branches out into
econometrics, statistics, algorithms and ML, with pretty direct applications for all of them.
A lot of the nonparametric theorems overlap/are ML theorems, which makes sense.

For statistics, it specifies how to reason about and estimate densities, prior to
the discovery of any distributional function. You can then view distributions as this 'discovery' that solves some of the issues
of nonparametrics.

Because nonparametric methods increase their number of estimators with the size of the data,
it's not as straightforward as simply 'fitting a model' and moving on. You need to think carefully
about runtime complexity and scaling. Plus, a lot of the optimal parameters are estimated using CV,
as a result finding the correct model can result in more irritating training, with less convergence guarantees.

For econometrics, it's interesting because it gives you a chance to try and measure model structural assumptions,
by loosening traditional requirements.

## Resources/Notes:
1. Nonparametric Econometrics by Pagan and Ullah

I've reviewed primarily Chapter 1, part of 2, and 3. The book goes into a lot of depth in terms of
rethinking/formulating econometric problems nonparametrically. However, chapters 1, 2, and 3 focus more on
the general framework for approaching non-parametric problems. Specifically, how to reason about
estimation absent a parametric structure.

The text starts with histograms, which really are a form of nonparametric estimation. Despite most people
who use them not realizing that what is typically just a cheap data viz tool, is actually built on a theoretical statistical
structure. But the simple intuition behind it is that at each point in a histogram, you're estimating the value
based on *some* concept of its neighborhood. That is to say, a histogram evaluated at point x ends up being a function
of the values surrounding x. 

The text then extends this weighting function to the set of all possible weighting functions. This is a parallel
to more standard mathematical stats, where we start by fitting a distribution to the data, and then begin to view other 
distributional functions.

For me the really key insight here, which I had heard before, and repeated before, but hadn't internalized through careful study,
is the distinction between imposing structure on your model, and inferring structure from your data. 

(As a side note, it always surprises me when I spent five years thinking I 'know' something, and discussing and repeating modeling platitudes,
but when I finally invest the time into walking through the proofs, I realize my old self was just LARPing as someone who knew what he was talking about)

But now we can see that estimating a new point, is a function of the existing data, plus our weighting function. So from here
we can notice that a KNN is part of the same theoretical class as a histogram, just with a different weighting function.
That's pretty cool. And it gives us a good way to reason about the correct modeling strategy to use in a given situation:
If you have a smaller sample of data, and a strong prior belief on its functional structure, fit a pdf. If you have a lot of data,
and no clue what the functional form looks like, approximate it with something like a KNN (or any local weighting scheme).
This is the type of fact I 'knew' before reading this book, but seeing it built up from first principles 
is useful to internalize how all the practical modeling wisdom ties back to proofs about histograms.

This is one of those things that feels obvious to me, but I often see people reaching straight for ML when it's unjustified,
because they haven't internalized that ML is our modern version of nonparametric statistics, and it requires the data to provide
it sufficient structure. If that structure isn't self-evident in the data, you are going to have a bad experience.
To take that even further, I think it's important in the exploratory data stage to convince yourself that there truly is a rich
source of structure providing information (note: information, not sample size), that will allow your algorithm to infer what is going on.
There can be cases where you have millions of observations, but your information set is still constrained across some dimensions
such that you can't nonparamterically approximate the data generating process.

I've seen this particularly in time-series forecasting, which frequently has an extreme constraint in terms of its effective sample size.
This tends to happen in seasonal data, where certain events you only observe once per year. If your data generating process
is ergodic or 'close' to ergodic (it usually isn't), even if you have 10 years of data, you'll only have an effective
sample size of 10. Is it reasonable to expect that a function can learn the true structure from those 10 points? Maybe?
But you probably shouldn't count on it.

I also see this with most people who want to fit a model to financial time-series, but don't know enough about financial theory.
The problem here, of course, being that there are relatively strong financial theorems that reason about how the data generating process
should behave working from individual rationality and investor behavior. If you aren't reasoning about this information, you
aren't aware of how the true process should behave. As a result, you can fit the deepest net in the world, but unless you 
understand the structure of what you're trying to approximate, you're just fitting a function to complicated noise.

** notes **


# Notes
Multivariate K nearest neighbords
https://core.ac.uk/download/pdf/82551385.pdf
?

Chapter 3:
If yi is the target ad xi the policy variable,
we can express it in terms of the conditional moment
E(yi|xi) = m(xi), where the dependence no xi is made explicit.
The challenge is determining the function m(*).

The two functions above sustain m(xi)=a+xiB
or, e.g., m(xi)=a+B log xi.

This task tends to be subsumed by noting that the variance
of a variable zi conditional upon xi would be
E[(zi-E(zi|xi))^^2|xi] = E(zi^2|xi) - (E(zi|xi))^2

This results in estimating two conditional expectations, almost always
making sigma_i^2=m(xi) a function a quadratic in x.

Alternatively, we can estimate conditional moments by Kernel Methods.

Suppose we want to estimate the conditional mean.
Y = E(Y|X=x) + u = m(x) + u

Where the error term has the properties E(u|x) = 0
and E(u^2|x) = sigma_2(x)

So we want to come up with a non-parametric estimator of m(x)

Parametric methods specify a form of m(xi), say that it is linear
in the variables.
y_i = a + xi B + ui
This implies assumptions about the dgp (joint density).

For example, if (yi,xi) is a bivariate normal density, we can show that the mean
of the conditional density of yi given xi is E(yi|xi)=a + xi B
Where a = Eyi-(Exi)B and B=(var(xi))^-1 * cov(xi, yi)
This implies that the assumption of linear specification for m(x)
holds if the data come from a normal distribution.

The goal of nonparametric estimation is to approximate m(x)
arbitrarily closely, given a large enough sample.

A sensible way to estimate m(x) would be to average the yi
corresponding to all xi*s that equal x.

The LLN shows hat m_hat is a consistent estimator of m.

Ultimately, it seems nonparametrics focus on learning the structure
from the data itself.

By definition, the conditional expectation at point X=x
m = integral from -inf to inf (y*f(y,x)/(f1(x))dy
where f1(x) is the marginal density of X at x.

We then use what we know from 2.8, which is the Multivariate density estimation.

Let Z=(Y,X1,...,Xq) = (Y, X) be a vector of q + 1
random variables, where Y is a scalar and X is a 1 x q vector.
Then the kernel estimtor of Z is

fhat(y, x) = fhat(z) = 1 / nh^(q+1) sum(i->n) K1 * ((zi-z) / h)
where zi is the ith sample observation (yi, xi) and z=(y, x) is a fixed point.

Reasoning from this, we can understand a few things:
1. Standardizing data is important fundamentally because this is what a lot of ML is doing.
2. We also notice, obviously, that we need much more data for this to work.
However, in functional form space, if we believe our structural assumptions regarding
extrapolation, we can be 'protected' from this, by assuming we can exploit a high density
of information in one location. We lose this ability when we abandon a structural assumption
(for better or worse).
3. We can risk being locally biased by outliers in extreme ways, which is why
regularization tends to be more common when estimating this sort of thing.

Left-off on page 22 and 89, going over bias variance trade-off, and knn proofs.


Status: Unfinished.

I asked a Finance Professor of mine in 2011, if econometric models were great,
why they didn't use them when building M&A models? I think he may have answered my question,
but I didn't get it at the time.

As I think about it more, we can think of a lot of modern data analyst roles, or equity research roles,
as essentially being nonparametric statistics in action. All the excel operations tend to be
some function of other cells, but without a specific estimation procedure or distributional assumptions,
as a result we can think of them as some local neighborhood weighting -- which ends up matching our basic
nonparametric models.

Although, as I think about it a little more, they also try to estimate the impact of events that they have no
real data on, other than their own personal prior beliefs. 

This seems like it might be Bayesian nonparametric statistics, which I know nothing about.
https://projecteuclid.org/download/pdfview_1/euclid.ba/1369407550

It seems like this might be a useful way to think about the problem.

Links:
https://core.ac.uk/download/pdf/82551385.pdf


Good course notes.
http://faculty.washington.edu/yenchic/19A_stat535.html



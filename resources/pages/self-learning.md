

Self-learning.

I've spent ten years studying how to learn, by teaching myself what I know.

1. Real knowledge is hard to gain. Hard and slow. We all want to speed it up, and maximize the number of 'things we know' given our
time constraints. I think this largely misses the point. 
For example, I've spent most of the day learning how to differentiate under an integral sign to do some exponential distribution proofs,
and then some proofs on curved exponential families. In an immediate sense this "isn't' useful." Except that building statistical
maturity i.e. the ability to reason about new statistical concepts is *extremely useful* for my career. 
On the other hand, I could have 'learned a new technology' or written a notebook where I called some new ML API today.
That would have definiteley felt more immediately rewarding. And probably been more fun. But it doesn't really contribute to
maturity.

May 17th, 2020
I spent most of today going over the basics of deep learning, and learning how we learn features.
It's one of those things that I "learned" a few years ago, but before I had a higher level of mathematical
or statistical maturity, so I didn't fully get it.

I'm still struck by the strangeness of self-learning, or I guess learning in general. This weekend I covered a lot of ground,
as I was surveying a new field. I nominally "learned" a lot of high-level tensorflow APIs and deep learning concepts. It's always interesting
to contrast this to the fact that a few weekends ago I pretty much spent 10 hours learning how histogram estimators work.
The levels of depth you can go on any one topic can make it difficult to calibrate the depth to your goal.
Still, there are elements of histogram estimators that reveal themselves within deep nets. You can think of histogram
features as learning their features, but only given a specific assumption some kernel smoothness. Whereas a deep net
has much more freedom to learn what it wants. 

The nice part about learning it this way is that you can build up to deep net intuition from statistical first principles.
1. There exists some distribution we want to estimate, and we make a parametric assumption.
f(x)=phi(x), Where phi is an existing distribution. This distribution may be correct, or it might not be.
2. There exists some distribution we want to estimate, and we can't make a parametric assumption, so we learn it
using a locally smoothed kernel to estimate the density.
f(x)=l(x), where l is some nonparametric density estimator.
3. We want to estimate some joint distribution, but we don't know anything about this distribution, and in fact this joint distribution
might itself be a function, which we don't know, of some noisy information that has no clear interpretation.
f(x)=k(q(x)), where q is some composed set of functions that learns transformations of x,
and k is some set of weights that relates them to the function.

If we go about it this way, we can retain statistical intuition.

Again, this all comes back to Glivenko-Cantelli.


Every day feels like you learn nothing. It's painful and frustrating.
Good. Keep going. 
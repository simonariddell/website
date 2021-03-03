

"Just bend it down"

On my first team as a data scientist, we were having trouble with a long-run forecast
'exploding.' In this case exploding means our forecast was well-behaved in the short-run,
but in the long-run it grew beyond any reasonable boundary. We also couldn't do any sort of
careful cross-validation, as our out-of-sample forecast was longer than our training data.
I was incredibly irritated and couldn't figure out what to do.

My manager at the time wrote some code to fix it. He just 'bent' the forecast down, until
it was reasonable. What's reasonable? It's some threshold. It's whatever we say it is!

At the time it felt incredibly odd, and wrong. You can't just... modify a statistical model like that.
It's not allowed, it's unnatural. But it turns out you can actually do whatever you want. The goal
in our case was to accurately predict the future.

Statistics, time-series forecasting, programming languages, are all just tools. If we could accurately
predict the future, at scale, without them, then we would. At the time it was strange for me, because
coming from academia I was used to a world where the method and tools were just as important as the result.
Whereas in this new world, all that mattered was the result.

Obviously we didn't want to *manually* change the results every time we updated the forecast,
so we put it into a heuristic algorithm. Still, it worked. Since that point, one of my mantras is 
'that there are no rules.' Focus on solving the problem first, by any means necessary. 

# Nutrition

https://academic.oup.com/ajcn/article/111/4/795/5713417


# Novels
Novels as simulations. This is a loose idea I had, that apparently TC enumerated on.
 > It is now well understood that the difference between a regression and a simulation is one
   of degree rather than of kind (Hansen and Heckman 1996). Any regression contains an
   implicit simulation. Consider, for instance, y = 2x + k as a least squares estimation fitted
   around actual data points. This regression also suggests imaginary, simulated alternate
   histories, based on varying values for the independent variable.

> A novelist, for instance, might believe in the universal human desire for status and
  recognition. He can then ask, as did Proust, how this desire will play itself out in French
  social circles at the time of the Dreyfus Affair. The resulting story then offers us some
  vision of how an underlying worldview applies to a particular setting. Similarly, we can
  think of Tolstoy's Anna Karenina, in part, as a story of the prevalence of self-deception,
  set among the Russian nobility. 

> Along similar lines, the novels of Camus and Sartre have convinced many readers of the
  philosophic virtues (and vices) of existentialism. Camus's The Stranger, or Sartre's The
  Age of Reason, reflect elements of the existentialist worldview. If a reader finds the final
  psychological portraits convincing, and to match his intuitions, he may conclude there is
  something to existentialism after all, as an account of the human condition. 


As a warning though, TC notes:

> To some extent we can expect people to read
  novels that confirm their ideologies and preconceptions. So a left-wing reader may prefer
  Upton Sinclair, while a libertarian may read Ayn Rand. 

An additional point, that is implied but TC doesn't explicitly state, is that novels
allow us to experience variation that we otherwise will never have the opportunity to feel.
While it's true that no novel on war will ever capture the experience. It's probably safe to say that not
reading any war novels risks drastically misunderstanding what war entails.
All Quite on the Western Front by Erich Maria Remarque, and What it is Like to Go to War by Karl Marlantes
were two novels that impressed upon me a particular disdain and understanding of war.
The former helped me understand that the concept of 'good guys' and 'bad guys' is often a leaky abstraction over
scared, young men, who are dying for no good reason.

The latter helped me understand, in a rarely honest depiction, what it means to willingly kill your enemies, while
trying to simultaneously instill a sense of respect and virtue. 
http://www.sscnet.ucla.edu/polisci/faculty/chwe/austen/cowen2005.pdf


# Fat tails? Or outliers? 

The existence of some small subset of people taking some radical action drives a pretty substantial
portion of our new cycle. Typically it's linked to an example of the outgroup doing something bad.
Charlotesville is probably the most famous example of this in the past ten years, regardless of what you think about it.
More recently there were the Covid Michigan protests. We've had Atifa protests as well.
But while those are large or recent examples, I think this is an uncontroversial statement.

As a first order condition, it makes sense why it's reported on. We click and view these articles, and that makes money.
That's fine, whatever. It makes sense.

But as a second order condition, I wonder what the correct way to do inference on these small sample size events. I can think of
two corner solutions.

The first: These events are outliers. We know they are reported on due to them being popular stories, but they don't tell us much
about the true state of the world. We keep hearing about Covid protestors wielding assault rifles. But there were only ten or so of them
in the entire nation. Is this just noise? How should we make some type of inference off this event? 

Let's be a little more specific: What implicit inference *are* we making off of this event already? The right seems to view them
as patriots who are reminding the government that they aren't all powerful, while obeying and exercising laws related to weapons.
That's my impression of their impression. I think it's mostly correct, as Trump tweeted something about them being passionate or something.

The second: These events are signals. The skew of the distribution is related to the mean, and we can infer something about the average
of the entire population by the existence of the tail.

This is how I believe the left views the event in Michigan. Sure, most people aren't doing it, but this group represents the true
belief of many on the right. If it didn't, they would denounce them.

In this world we have the right, despite having a positive emotional valence, largely disagreeing
with their perspective.

More generally, it seems our attempt to estimate skewness of these weird multi-variate distributions of political belief
drives our inability to see the same world. 





# Orwell

Orwell
https://www.orwell.ru/library/essays/politics/english/e_polit

In our time, political speech and writing are largely the defence of the indefensible. Things like the continuance of British rule in India, the Russian purges and deportations, the dropping of the atom bombs on Japan, can indeed be defended, but only by arguments which are too brutal for most people to face, and which do not square with the professed aims of the political parties. Thus political language has to consist largely of euphemism, question-begging and sheer cloudy vagueness. Defenceless villages are bombarded from the air, the inhabitants driven out into the countryside, the cattle machine-gunned, the huts set on fire with incendiary bullets: this is called pacification. Millions of peasants are robbed of their farms and sent trudging along the roads with no more than they can carry: this is called transfer of population or rectification of frontiers. People are imprisoned for years without trial, or shot in the back of the neck or sent to die of scurvy in Arctic lumber camps: this is called elimination of unreliable elements. Such phraseology is needed if one wants to name things without calling up mental pictures of them. Consider for instance some comfortable English professor defending Russian totalitarianism. He cannot say outright, ‘I believe in killing off your opponents when you can get good results by doing so’. Probably, therefore, he will say something like this:

‘While freely conceding that the Soviet regime exhibits certain features which the humanitarian may be inclined to deplore, we must, I think, agree that a certain curtailment of the right to political opposition is an unavoidable concomitant of transitional periods, and that the rigors which the Russian people have been called upon to undergo have been amply justified in the sphere of concrete achievement.’

# Tech heuristics
I think dealing with messy upstream data, internal tools, authentications, and random bullshit software errors in order to set up
a big data pipeline, is harder than building a model, in a weird, subtle way.
On the surface, modeling something is 'harder', in that it draws on more complex, mathematical, and theoretical primitives.
It's hard in an elegant, interesting way. Okay, that's probably overselling it a little, but it isn't dramatically wrong.
Or even when that's not true, knowing the complex primitives helps you to avoid horrible pitfalls.
On the other hand, dealing with systems bullshit is hard in the same way that traveling through an unmarked path in a jungle with a machete is hard.
It's hard in a really straightforward, brutal way. It's exhausting.


# Forecasting heuristics

I've spent the better part of five years working in forecasting, although I don't at the moment. First at the Federal Reserve,
which was admittedly more of a research role that had some associated forecasting. Then at Amazon.
Forecasting is a weird field. There are a lot of heuristics that follow the field of forecasting around different disciplines.
This happens to such an extent that the ability to build a good forecast is often divorced from the actual subject matter to a far more profound extent than you might think.

# Regularization

Regularization increases statistical bias, but decreases epistemic bias. 

This is something I still haven't fully internalized. The bias variance decomposition, within a statistical framework,
mostly makes sense. But what's a nice philosophical way to think about it as a bias, variance, epistemic bias decomposition.

# Casual evaluation of political systems.

Casually comparing capitalism to socialism is incredibly common. Although there has been
a century of varying and rich academic comparisons, they don't seem to have settled the issue. 
And even there, the field of study that has decided to make the comparison results in supporting one
or the other. And even within field of study, the cultural or national background influences it as well.
Economists in the soviet union obviously supported socialism. Even today, French economists
are more likely than American.

Whatever the answer to 'what is better' (to the extent that's a well formed question), here is my framework
for reasoning about this question.

The first is you have to determine whether the claim is based on a prescriptive set of attributes,
or an empirical set of attributes. 
The prescriptive set looks like this: Socialism, as an 'ism', is a term that holds a set of properties.
One common property might be that workers own the means of production. But even that's not guaranteed,
as sometimes people slide the word 'democratic' in front of socialism, and then later forget to remove it,
and the democratic prefix tends to make the implicit claim that this property is not within the socialism set.
So, now we have a 'ism' that contains some set of properties, and we don't know exactly which, unless
the person making the claim goes to an absurd length to enumerate every one. 
(and even here, there is a structural assumption that a set of discrete properties composes the whole. 
Is that true? What about higher-order interactions?)

The prescriptive set for capitalism has it's problems as well. Is there a social safety net? In fact,
how does capitalism interact with democracy? Does democracy solve capitalism's failures through worker protections?
Or is it even correct to say that it solves its failures, if it's only their combination that is a stable equilibrium.

On this point of stable equilibrium, we now consider the empirical comparison.
In the above the speaker gets to claim a set of attributes. But would that set of attributes be
stable in reality? For example, if my definition of capitalism solves healthcare by claiming that the market
would provide for all those without health insurance through donation... Well I can claim that this is a property of capitalism
if I want, but is that what we observe? Or for a less contrived example, we might say Capitalism when observed
results in workers gaining more protections over time. 

I call this the 'intention to treat' approach. I personally think it's correct.
When we evaluate socialism or capitalism, we restrict ourselves primarily to observing historical success
or failure, rather than the intrinsic properties of these algorithms.

The rationale looks something like this: When a group of people decide to enact a socialist or capitalist system,
they likely do not all share the same vision, or preferred set of policies for these algorithms. In addition,
often times these combined properties do not form a stable equilibrium, and fall a part in reality.

As a result we can consider the implementation as a type of combination of all the individual property sets of the implementers.
This is important, as any good system needs to be robust to the loss of information. For example, if properties (a, b, c) and properties (a, b, d)
are each stable. But the combination of (a, b, c, d) is unstable, than the implementation may not succeed.
(what this might suggest is systems with less complexity and interdependence are more likely to succeed).

We also then observe the outcome. For example, if one system assumption is there will be a leader who is moral, good, and true,
and in implementation the leader is good and moral, but rarely true, we can observe that the property we wanted
is not a stable property.

The problem this framework imposes is that we're information constrained. 
It's not like there have been tons of socialism and capitalism experiments. And even those that exist
suffer from the same confounders. If you believe American capitalism isn't true capitalism, which let's say is properties
(x, y, z) but capitalism-imperialism, which is (x, y, z, q) then you'd say that their idea to seed other countries
was not correct. Not only that, but you could use this observation to argue either both in support or against capitalism.
For example: Capitalism is great, the parts that weren't great were due to the mistaken addition of property q. This resulted in
imperialism. Without q, it's even better. Or: Capitalism claims to be great, but have you ever seen it without q? q always somehow
gets tacked on. The equilibrium of capitalism tends towards imperialism. 

We can try an even darker epistemic though experiment.

(As an side, political thought experiments work best when you consider some event
that could have plausibly gone either way, then try to reason about how our inference on the world
would have differed. For example, a bad thought experiment would be "What if America started without slavery?"
This is bad because there is no reason this would have happened that is uncorrelated with what we want to make an inference on.)

A good thought experiment might be what if the US failed during the Civil War? The reason this is a justifiable thought experiment
is that a few different strategic moves by individual generals and the confedracy could have resulted in a different outcome where the US collapsed. 
In that case, I don't know how the world would have panned out, but is it possible that we would be saying something like:
"Democracy and capitalism was attempted under best intentions, but despite claiming individual freedoms, the markets capitalism creates
results in people inevitably selling one another, and an inability on how to regulate these markets is unstable and can collapse due to internal conflict"

Although ultimately these thought experiments are more fun than they are useful. We're trying to simulate more data, but are we truly generating novel information?

So we end with the following question, which is how do you reason under political uncertainty?

And here, I'm tempted to try and answer my original question, and link to McCloskey and others who have pointed out the resounding
success of Democratic Capitalism. That's my belief. Except that's not the purpose of this blog post, because you might not think that's true, and
I want this to be a general framework for reasoning.

Instead we need to consider the cost of dramatically breaking things. Transitions rarely work. 
Hobbes.


# Epistemic Inequalities
An informal idea I use to evaluate a lot of information is the idea of epistemic inequalities. It is the casually
applied version of statistical inequality theorems, which let you make certain claims about statistics, with varying strength
depending on your assumptions.

The way I use it is to put bounds on what any given researcher can reasonbly know, and use it to discount their claims accordingly.
For example, some people make claims about red meat. Maybe that it's good, maybe that it's bad. Right off the bat, what do we know about this
epistemic question without even reading any research?

For one, humans have been eating red meat for as long as we remember. So there is a rich historical success when it comes to eating
red meat. That doesn't mean it's good or bad, but it's an important historical prior. The second is that variation between groups that 
eat red meat is heavily confounded. The Japanese are different in many ways when compared to Americans. Two groups that eat different amounts of meat.

Any randomized control trial, in order to answer the question with any satisfaction, would have to run for decades on thousands of people.
Anything short of this will probably be underpowered to the point of uselessness.

The question itself presupposes that there is an average effect that's the same for all human types: is there? Are young men who lift weights
effect the same as old women? What about different ethnicities?

With all this information, we can impose certain constraints on the epistemic value of any claim. While not insurmountable, 
we've effectively reasoned about the information space available to us for inference, and observed that it is not a space capable
of answering the question effectively.

That's not to say research here is useless. With a strong enough effect size anything is noticable, and it's worth looking to see if that's the case.
But in general the information content we can observe, or generate within a reasonable timeframe, precludes us from a great answer.

We can also see this type of phenomena in the current covid case. While we can test for vaccine safety, we can say nothing about vaccine
longer than the trial lasts. If the trial last measures vaccine safety at time T, then it's possible at time T+1 everyone dies.
Okay, that's unlikely to happen. But this is an epistemic inequality: You don't know that it won't. Specifically, no one knows that it won't,
no matter how smart they are or how much of an expert they are. Again, an expert might have a better prediction as to how safe a vaccine is
conditional on it being safe up until 90 days, but it's just a prediction. 


# Time-series
All problems are time-series problems. We bootstrap our philosophy of science
by cross-validating processes that seem to work.
If time has finished, and we were able to load all data into a computer, could we still do science?

# Guided by Science

In Covid-19 there have been many statements by elected officials that our policies will be 'guided by science.' Overall, you know, all things considered,
I appreciate the sentiment. However, I don't think this is a robust or clear framework for building policy. 
I think there does exist an elegant abstraction between science and policy making that we are muddying, which is causing confusion,
and for many mistrust of science. Unfortunately, a lot of this mistrust is eminating from the non-intellectual right electoral base.

Personally, I tend to be less disappointed with the this group of people (sometimes referred to as 'Townies'), not because I think they are any less wrong,
but because my expectations for them are very low. It's an elitist perspective, but one of elitist responsibility. It's the job of the elites
to help this group of people make the right decisions and defer power to those who know what they're doing. To do that they need to trust you,
and to trust you, they need to believe you are acting in their best interests.

Why would they lose trust? I'll offer a framework then check it against a few examples.

One important objective of a scientist within the realm of policy should be to map out the true state of the world
as accurately as possible. That sounds a little obvious, but the distinction is it doesn't focus on what we should do,
or the preferences of the populace. As a result, it does require a level of detachment from the actual implemented policy.

Consider the case of covid-19 lock-downs. The science should be incapable of saying if we should lockdown or lift a lockdown. 
That's not in the set of what science can say. Instead, science should make specific predictions as to the value of locking down
or lifting a lockdown. It's then up to an elected official to use that information.

Now, we don't have to be overly dogmatic about this distinction. If you have a statistician helping you with polling the electorate,
perhaps they can give you a scientific impression of what the populace wants. But the general pattern here is that the scientist
portrays reality a certain way, then the policy maker acts.

So let's revisit the townies who are upset. They want the freedom to live life normally without restrictions. 
When they protested lockdowns, the overwhelming and condescending argument was that they are completely anti-science, because
science says lockdown. Now there are protests due to the murder of George Floyd, but apparently those protests are not anti-science.

The problem here is that the science actually should be the same. Instead, it's the policy makers decision that differs. They
decided that the benefit from protesting racial injustices justifies the risks (It's worth pointing out I don't actually know if
they believe that, but that seems to be the impression they give off). What's certainly true is celebrities, err sorry, the Hollywood Elite,
are very much in favor of these protestors. Whereas the other protestors caused them to laugh at the idiocy of people going to a sunny beach.

And let me really quickly point out I'm not trying to 'compare' the validity of these two protests at all. I'm instead trying to point out
that this is the impression of the townies. One scientific rule for one, another scientific rule for another.
The answer might be that the cost predicted by the science is the same, but the benefit from protesting racial injustice 
outweighs the cost. You can disagree with that if you want, but it's a clear framework that distinguishes between prediction and preference.

When science is modified to incorporate preferences, there becomes a battle over whose preferences are incorporated. 
The result is the group that feels their preferences are not represented, will begin to ignore science.
The particularly frustrating part of this is that the townies can't distinguish between what science has been tainted, and what hasn't.
In fact, most people can't. As a result, without that ability to distinguish, you end up with the memes where people are either 'pro'
or 'anti' science. Even governors keep saying they will let 'science' guide re-opening. If that's true, then what they are doing
is asking scientists not only to make prediction as to what will happen, but also determine our preferences, which is a nearly impossible task.

# Don't over infer
If someone makes a claim, evaluate that claim just at the immediate object level of what they are saying. Humans have a bias of
over-inferring. Often when people make a claim (or retweet something) there is both the object level interpretation, and the inferred interpretation.
The most obvious example right now is related to the current riots in America. If someone retweets or shares a case of police
brutality during a riot, or of a rioter attacking a civilian, depending on which side you think is more of an issue, you'll probably
have a positive emotional reaction to one and a negative emotional reaction to the other. Let's say you think rioting is overall bad,
and someone shares a post that says "Look at this case where a police abuses a rioter." In that case you might infer that this person
is overall in support of rioting. 

And maybe they are. But if in that specific case the police did abuse their power, then don't argue or dismiss that point.
What you're actually upset about is that this person is sharing something that implies they think rioting is good.
Except, did they say that? Or are you just inferring it? It's certainly correlated with that belief, but assuming correlation structures
of beliefs doesn't lead to productive conversations. If belief A is highly correlated with belief B, but a person only
expresses belief A, then don't assume they also believe B. 

To be more formal about it, don't use your knowledge of the covariance structure of beliefs to impute other peoples beliefs
based on a sample of information. Let other people be explicit in defining their belief structure. 

This is a particularly dangerous trap, because humans are so tribal. As a result, from a small piece of information we can then impute
the rest of a persons belief, then categorize them into a political category, and determine if they are in our tribe or not.


# Violence is satisfying.
In 1st grade there were two factions on the playground. There was our group, which focused on development of I guess what were small
mounds of dirt within a shaded area of a few trees, with the queen sitting at the top of the hill. Then there was some rogue group
of kids, who for some reason I think considered themselves wolves. I don't really remember. What I do remember
is how much fun it was to be part of a tribe that went to war with other small groups of kids. 

The idea of kids forming groups and fighting seems to be a universal experience, and a lot of our cultural institutions work on
taking that energy and amplifying the good parts of it, and truncating the bad, often through sports.

Still, it took me many years of reading to internalize that violence is deeply satisfying, particularly for young men.
There is a call to tribalism and violence that is hard to resist. But it can be resisted and moulded, if done properly.

Karl Marlantes wrote a book 'What it's like to go to war,' which is the most lucid and honest modern book I've read on the
enjoyment of battle. In this case in the Vietnam war. Through this book you get a picture of what it means for a soldier
to enjoy combat, in a specific and idiosyncratic way to all other types of enjoyment. 

The driving point he makes is that we can't avoid violence or war, but we need to build a reverence and spiritual framework for
manging ourselves within the violence. If we operate within a specific framework that sets rules, not at the legal level, but at a higher
level of abstraction, for what it means to commit violence and kill, we can build a shared moral framework for killing our enemies,
while maintaining a sense of respect for them and avoiding atrocity.

I worry that the message we instead share, and what was shared with me, is that violence is almost ways wrong,
we don't really talk about when it's acceptable, except obviously against Nazis and racists, and we don't warn young men
that they will feel an urge to commit violence that may be detached from any actual reason. In other societies, the justification 
for violence focuses on other ultimate enemies, such as those who oppose Islam.

Now, in the grand scheme of things, Nazis and racists are a better shared target than, I don't know, those who oppose the Sun God
by not sacrificing a goat during an eclipse or something. Probably someone did that once. But what we do see in America
is all our enemies are Nazis or racists. It doesn't really matter what you support and what your opponent is against, you just need
to categorize them as a Nazi or racist to justify your violence.

And I don't think that's a great framework for violence justification. What I think we end up seeing is a lot of
young people who feel the siren call of violence, and who want to feel the rush of attacking another group with their own tribe,
instead considering themselves some form of activists, who are fighting for justice, since that's the acceptable avenue towards violence.

One question I continue to struggle with is what amount of the benefit in the cost vs. benefit of equation for a human
to commit violence is due to the latent enjoyment of violence. Specifically, the benefit of commiting violence in America should
be lower than most points in human history. What does it take to push that latent benefit down further? How do we channel that anger
into something useful? 

Karl Marlantes
TC What the hell is going on
Siren call of ISIS.

# Crazy old scientific theories aren't crazy.

# The corner case is optimal only in some conditions.


# Novel Metaheuristics

There are certain ranges of the human experiential and emotional specturm we either will never
experience, or won't experience until late in our lives. Without understanding
this span of human emotion, we're at risk of making mistakes in how we respond to the world.

As a light example, imagine if your friend's dog dies. You say "Eh, whatever, it's just a dog." Since you grew up
in a country where no one had dogs as a pet, and they were just an annoyance. You responded poorly to this interaction
and upset our friend. If you had read Ol' yeller (A book about a great pet dog), you might not have made this mistake.

But let's be specfic with what we mean by a mistake. My assertion here is we should treat a given, notable, human
experience as a treatment. What I mean specifically here is let's say you are unfortunate enough to lose a parent as a child.
That is an experiential event. We could call it an experiential treatment, borrowing some of the language of causal inference.

So let's imagine we want back to the previous example, and split the universe in two.
In one of them you were forced to read Ol' Yeller first, and in the second you didn't.
Now we've embedded the treatment of a novel into a randomized control framework. We could study the difference
between the two outcomes.

Let's move on to a new example, that's still related to experential information, but not about novels.
Let's say I split the universe in two, and in both I asked you about your opinion on terrorism. But in one of the universes,
the day before, I orchestrated it so you experiened a massive deadly terrorist attack (don't worry, these are simulated universes, no one was really hurt.)

Should your opinion on terrorism be different as a result? The answer is maybe. Actually, this is an unfair question,
since there isn't enough information to answer it properly. So how do we answer it properly?

Let's first decompose the information into two pieces. The first piece is you've just received new information on the existence of terrorist attacks.
The second is you've experienced a personal impression on what a terrorist attack looks and feels like experientially.
Let's say the first piece of information actually contains no information. This is a terrorist attack that is part of along line of
semi-predictable terrorist attacks, and isn't particularly new or novel in frequency of magnitude. If previously there were zero terrorist attacks
for decades, and suddenly you experienced something catastrophic, it may make sense to change your view on their potential risk.

But let's say that's not the case, and this was part of a long string of regular terrorist attacks, for example, let's say you live in Israel, where attacks are semi-regular
and generally similar in magnitude. Should you change your view based on the experience? Or a better question would be, under what conditions
should you change your view based on the experience?

One condition is you underestimated how horrible a terrorist attack. That feels somewhat possible, right? It was easy to dismiss
how awful it was when reading about it, but being forced to look it in the face made it more real.
Sometimes the horror of something is lost 

# You probably don't want a re-write.

# The fat tails no-man zone and information asymmetry
When discussing topics such as racism, or terrorism, we often focus on the extreme events to characterize the problem.
The issue with this is, I think, that the real problem isn't the extreme events, which we can all observe.
It's the slightly-less-than extreme events, which only a subset can observe. This is in line with my general view
that we shouldn't attribute to malice what we can attribute to information asymmetries.

Consider that there exists a distribution f(x) that a subset of people, in group A, draw from, and this distribution
characterizes their experience. Each person in this subset is fully aware of the density of this distribution.

Now imagine another subset of people, group B, who either do not fully trust them OR the cost 
of transmitting the distributional information is constrained for some reason.

As a result, let's model the first group as sending this distribution f(x) over a lossy channel.
This specific channel, loses a certain type of information. To characterize this, let's suppose that we decompose the information
content of f(x) into two distinct sets of information. One is information that is easily transmitted without loss. The second
is information that can be lost in transmission.

In our observed reality, we can ask what distributional information is more likely to be in the first set, and what is more likely
to be in the second set. The first set tends to have information that is less disputable. For example, deaths, while typically rare, are
not open to easy dispute. The second set tends to have information that is more mercurial, and harder to communicate.

A motivating example is a given persons own perception of experiencing racism. The mean experience may be composed of many small events,
each of which is difficult to communicate. The tail, however, consists of the worst events, such as unarmed murders, which is easier to communicate.

As a result, the most effective messaging tactic is to focus on the extreme events. However, the area under the curve from this identifiable portion
t1 to t2 (integral), despite the true known suffering being from t0 to t2.

The result of this may also manifest itself in a seeming 'irrationality' with respect to data. Numerical data, of course, must measure
real cases observed in reality. It cannot measure feelings of shared indignity. 

The result of this model of the world is one where the actions of a group are seemingly 'irrational' when measured using data.
However, this may be attributed to specific information asymmetries and lossy information channels, 

While the above example focused on racism, we can think of it as applying to any generic case. Although the most likely case it would arise
is where tail information is most easily transmitted. In the case of terrorism, the similar analog would be that most people don't ide
or not at risk of terrorism, but it truly is as bad as people claim, due to the difficult to measure widespread fear.

The risk of this model in 'rationalizing' this case though, is it assumes full common knowledge of the strategy from those in subset A,
who are aware they must share this communicable information as they are operating under an information asymmetry. However, a more plausible
scenario is likely one where the elites of this group are aware of this strategy, but the majority of members or not. Or perhaps more likely,
no one in the subset is aware that this is the strategy, but it is an emergent property.

The motivation for this model does rise, in part, to my own experiences both reading historical texts and novels of racial experience
in the US, as well as general statistical knowledge. 

# There is no such thing as a logical fallacy or social science axioms.

# Solve perceived irrationality through treatment effect strategies.

I was recently calmly debating someone on reddit on the question of whether the current black lives matter
protests are 'rational' given Covid-19. The first order approximation of the problem is currently 100+ black Americans
are dying a day due to covid, with the tail risk of that number being substantially higher. This represents an immediate, and ongoing,
massive loss of life, which protests threaten. Not only due to the literal gathering of large crowds, but also due to damaging
trust across other demographics that social distancing is important. When the news is showing huge crowds constantly, others will
no longer feel that distancing is important.

The counter-argument is the harder-to-measure point that ending systemic racism will also save lives. The counter-factual benefit
of these protests is mostly beyond our ability to measure. So we have to rely more on very weak priors. My personal position when dealing
with cases where there is a strong and immediate benefit to one action, and a hard to measure potential second order benefit to another,
is to lock in what is clear and direct. In this case, it would be that the tail risk of covid on black lives is simply more immediate
and threatening than anything else.

The hidden complexity here though, is that optimizing for lives isn't really what we do as humans. And this isn't meant to single out
the current black lives matter protests. We saw the same thing following 9/11. Tribal threats from enemies terrify us far more than
calculated odds. It's almost boring how calibrated our reactions are to what you would expect of an animal. We are scared of flying,
because animals don't fly. Even though flying isn't more dangerous than other modes of travel. 

The question as to whether being scared of flying is irrational is sort of an unfair question. Even for those of us who are very numerate
and think in terms of cost vs. benefit, sometimes that animal instinct forces it to be an unpleasent experience.

Is it rational that I like medium rare steak more than well done steak? Is it rational that the slight taste of rawness and blood is preferabble?
That's sort of a stupid question, but I don't think it's different than the other questions above. There exists a piece of firmware in my brain
that simply makes it so.

Still, I don't think the answer is to abandon the concept of rationality all together, and simply say "we are animals, subject to animal
whims, so be it!." Instead, I like to imagine humans belief on these topics as being decomposable into a reducible and irreducible component.
The reducible component is what we can eliminate through careful and numerate reasoning. 

In the case of flying on an airplane, we can reduce a portion of the fear through treating the person with evidence on the safety of air travel.
Following that treatment, we can observe how much their fear has decreased. For some people, that is sufficient to eliminate their fear.
For others, the act of being on an airplane is intrinsically terrifying, and nothing could eliminate that fear.

The same methodology can be used for protests against systemic racism under pandemic times. We should treat the participants with
unbiased and true knowledge related to the relevant risks. If, knowing those risks fully well, they continue to prefer to protest, then we
can at least be confident that their choice is made under full knowledge of the risk. Even if it remains sub-optimal with respect
to optimizing lives lost, that's okay, we know humans have an irreducible component that does not always permit our preferences to match
the exact numerical risk. Some humans are better at over-riding this instinctual feeling than others, but we all feel it to a certain extent.

# -founded
micro-founded
statistical theory founded
datastructures founded.

# Breaking things
It's essentially never okay to make things worse, because you'll make things better afterwards.
Breaking things *more* in order to eventually fix things, is a recipe to just end up in a worse situation than you started.
It's also much, much easier, than starting to fix small things. 
Fixing things, no matter how small, is difficult and painful. It requires understanding a system, and building a small new piece,
or refactoring a small piece. It's not glorious, and not dramatic. If you destroy something, you get to imagine recreating it all
with your idea of perfection in mind.  

This is the type of thing that is hard to learn. You can get it through studying history. Go look at all cases when a ancien regime
was dismantled, and replaced wholesale. How did it turn out? You have to work through it carefully. Why didn't it work?
Usually the system, as it stands today, is in some form of equilibrium. Whatever the initial motivations were to build the system
you're observing how it ended up. Both its successes and its failures. How can this compare to your new ideal? In its purity, we haven't yet
seen the unintended consequences that arise from its implementation. 
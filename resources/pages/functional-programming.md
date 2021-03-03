

# How to learn Functional Programming
Lisp Manual http://www.softwarepreservation.org/projects/LISP/book/LISP%201.5%20Programmers%20Manual.pdf

As the Summer of 2019 came to an end, Alison and I went on a trip to Spain for two weeks.
This trip came right before a large project I was the science lead on was planned to launch.
It also came a month before my brother's one year cancer scan. I mention those two things, but really only one
of them was weighing particularly heavy on my mind.

Our travel strategy tends to be hyper-active. A combination of hiking, trail-running, running, and when we can't handle anymore,
walking. After a full day of hiking and running, we'll usually spend a couple hours before dinner relaxing. Either reading
or studying something. For me, it's an opportunity to learn something different and new, that might only have
a tangential relationship to data science.

On this trip, for me, it was Lisp. A little programming, but mostly reading and learning about the paradigm (it's a vacation after all).
The world of lisp was strange and new. 

I read everything Norvig had on Lisp: https://norvig.com/python-lisp.html
I listened to Rich Hickey talk about FP. And I googled "Hacker News Functional Programming"
and read everything I could on the topic. 

I've always had a soft spot for esoteric knowledge. Yeah, obvoiusly you can solve problems with lisp and FP,
but there is an aesthetic about it as well. I often get the impression that while FP advocates try and show off all the advantages
of this paradigm -- of which I largely agree -- they are rationaliations for an aesthetic preference.

I get that now too. 

I began to see programs not as sequential operations but as syntax that we use to express solutions to problems, which the solutions themselves
are pure and true, but the syntax is obfuscatory. Our programs often have some state to them, but we hide it, and bury it under different layers.
And the state temporally changes and mutates. It's disgusting. I'm disgusted by it. 

And there is an aesthetic solution, where we aspire to keep our syntax pure and clean. Each small expression is responsible for a single
transformation. You compose those expressions. State exists, but it is explicit. The hidden, ugly state is exposed in plain site.
Each incremental step in your program is a self-evident change in state.

And it goes deeper (http://www.michaelnielsen.org/ddi/lisp-as-the-maxwells-equations-of-software/), although I have to admit
I don't really understand this! But this elegance isn't a coincidence. These languages more strictly express the most fundamental primitives
of computer science. We pay for this with them being perhaps harder to develop in.

When we returned from Spain life resumed, in a strange new way. My manager, and mentor, both left the team. I had worked with them
for nearly three years. I was responsible for launching this project with a level of responsibility I'd never carried before. 
I began the final step of implementing some of the final work. Short, simple, pure functions. In between meetings
it was relaxing in a way I hadn't felt before. The FP way of thinking had unlocked a way of reasoning and coding
that made everything seem easier. Yeah, I was writing in Python, sure. But you can write Python functionally.

My brother's one year scan was negative. I received a text from my dad while at work. I quietly left the office temporarily.
The last remnants of Summer remained, and it was a beautiful and blue-skied day. I walked to lake Union, sat by myself,
and cried. I was both worried someone I knew would see me, and also wished that they would. 

Around this time I started learning Clojure. I had an idea that I wanted a personal website, and maybe I could continue my enjoyment of FP
and writing by building a website. I usually spend my time outside of work studying or working on projects that have a more
direct connections to my primary career interests. Statistics, ML, scientific software tools. But, man, I had been having a rough time
and decided I was just going to do what I want. So Clojure it was.

I began small. I had never used Clojure before. And I guess one thing people say is that the paranthesis irritate them or something,
but I gotta tell you, I absolutely loved them. The multi-colored and vast number of paranthesis in emacs was beautiful.
I worked through the problems on 4clojure. Each piece of logic slowly twisted and bent my mind and my perception of how could should be
expressed. Formally speaking, it helped me realize how much of the code I currently wrote was kludgey stateful loops. The reason
that became obvious is that when writing in FP you're not really supposed to use loops. Okay, that's not true, they have their moments,
but that's not the standard practice. Yet each time I had to solve a problem my typical problem solving approach was "Eh, just
initialize an empty list and write a loop with some conditional logic in it." And, that's how we solve most problems normally, but
should it be? That loop is just abusing the fact that you can store some state over each run.

With the FP tools, you determine what the problem you want to solve, express the correct FP solution, then execute swiftly.
There is no intermediate return, you're given the solution to your expression as a new immutable piece of data.

Consider this function from my website:

(defn index-page [pages]
  (zipmap (map #(str/replace % #"\.md$" ".html") (keys pages))
          (map #(layout-page (md/to-html %)) (vals pages))))
          
As 2020 began, I returned to statistics and ML. I'd love to go deeper in FP, but I'm already spread too thin
in terms of the intellectual burdens by career places on me. I still have this little website though, and it's handful of functions.
And I also know FP is waiting for me. The zips and maps feel cozy and warm.




# FP thoughts:

I know that for loops are impure (just going to pause to appreciate how perfect of a starting sentence
that is for my notes on FP). There is the classic way to think about it
out = []
for letter in ['a', 'b', 'c']:
    out.append(letter)
    
Here we are mutating the list out, without doing a specific call.
def out_appender(out, letter)
    out = copy(out) # Copy so it's idempotent
    out.append(letter) # append is inplace (impure), but it's a copy, so this is sort of okay.
    return out

out_a = out_appender(out, 'a')
out_b = out_appender(out, 'b')
out_c = out_appender(out, 'c')

With these examples we can see that we're calling a function repeatedly, and each time have some intermediate output.
With the for loop, these intermediate are mutating a hidden state. 

# Scala
https://books.underscore.io/essential-scala/essential-scala.html
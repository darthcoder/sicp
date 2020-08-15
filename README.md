# SICP Solved in Clojure

This repository is my attempt at working through all of the SICP book in the Clojure language. 

## Why SICP

I have been trying to on and off learn CS for the last ten years. I've been successful in some aspects and a garden variety failure at others.
Among other resources one that I have tried to follow is called Teach yourself CS. 

**The basic argument is mastery**

Hundreds of books abound that claim to teach a topic or a subject in 24 hours or Y minutes. Can you really learn something effectively in such limited time?
The only thing you can have in such a short period of time is an explicit demonstration of the [Dunning-Kruger effect](https://en.wikipedia.org/wiki/Dunning%E2%80%93Kruger_effect?oldformat=true).

![Dunning-Kruger effect](img/dk.jpeg)

So what is the alternative? The alternative is to learn deeply via metaphors. Lots of things are similar to lots of other things. In fact this is how we learn things, we learn things by making connections between things we know and things we are trying to learn and these links are basically metaphors.

We have to strive for mastery and for that we have to go to the unique texts by the masters of the field that we are interested in. The 1000 page college textbooks for undergrads are not used in postgraduate study and that I think is very telling. 

Verbosity doesn't make exposition clearer. In fact there is a definite advantage to terseness and conciseness. Adding more words like I am doing right now is immaterial other than trying to prove a point. 

So we come back to the same question, why SICP? And the reason is best explained [here](https://teachyourselfcs.com/#programming) 

## Why Clojure

SICP is taught in MIT Scheme also known as GNU Scheme. It is a good langauge but there are many lisps like Racket that have features that the old MIT Scheme doesn't have. I have decided to choose Clojure mainly because it runs on the JVM and hence is fully interoperable with it. 

These libraries make a lot of the painful work easier. It is my ambition to learn how to build and ship software, that is why a good build system is necessary. Clojure with Leiningen is one such solution. 

The important take-away here is that Lisp supports some abstractions that are just not efficiently expressed in imperative languages. These models make computations far more mathematical and easier to reason about in the sense that they were first conceived by the folks that came up with the Science in Computer Science. 


## About this repository

This repository is divided into five chapters with the unimaginative names one thru five, one for each chapter of the book. Each chapter is then further subdivided into sections and each section has its own worked exercises. Time permitting I'll try to add readme's in every section containing a synopsis of the sections problems and their solutions.

Wish me luck
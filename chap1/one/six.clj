;; Exercise 1.6: Alyssa P. Hacker doesn’t see why if needs to be pro-
;; vided as a special form. “Why can’t I just define it as an ordinary
;; procedure in terms of cond?” she asks. Alyssa’s friend Eva Lu Ator
;; claims this can indeed be done, and she defines a new version of
;; if:
;; (define (new-if predicate then-clause else-clause)
;; (cond (predicate then-clause)
;; (else else-clause)))
;;
;; Eva demonstrates the program for Alyssa:
;; (new-if (= 2 3) 0 5)
;; 5
;; (new-if (= 1 1) 0 5)
;; 0
;; Delighted, Alyssa uses new-if to rewrite the square-root program:
;; (define (sqrt-iter guess x)
;; (new-if (good-enough? guess x)
;; guess
;; (sqrt-iter (improve guess x) x)))
;; What happens when Alyssa attempts to use this to compute square
;; roots? Explain.


;; Current implementation of Newton's method as per the newtons_meth.clj
;; file in this folder

 (defn average [x y]
  ( / (+ x y) 2.0))

 (defn improve [guess x]
   ( average guess (/ x guess) ))

 (defn good-enough? [guess x]
   (< ( Math/abs (- (* guess guess ) x )) 0.001 ))

(defn sqrt-iter [guess x]
  ( if
    (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))



(defn sqrt [x] (sqrt-iter 1.0 x ) )

(println (sqrt 9.0 ))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;
;;
;; ANSWER ::
;;
;; Since the languages of Scheme and Clojure aren't the same implementation
;; wise, I cannot think of an easy way to translate the scheme code to
;; clojure that gets the effect.
;;
;; The effect is basically the fact that it won't loop.
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

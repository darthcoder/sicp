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

(defn new-if [predicate then-clause else-clause]
  (cond
    (predicate) then-clause
    :else else-clause
    ))

 (defn good-enough? [guess x]
   (< ( Math/abs (- (* guess guess ) x )) 0.001 ))

(defn sqrt-iter [guess x]
   ( new-if good-enough? guess (sqrt-iter (improve guess x) x)))


 ;;   ( good-enough? guess x ) guess
 ;;   (sqrt-iter (improve guess x) x)))



(defn sqrt [x] (sqrt-iter 1.0 x ) )

(println (sqrt 9.0 ))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;
;;
;; ANSWER ::
;; From point 19  pp 45:
;; A minor difference between if and cond is that the 〈e 〉 part of each cond clause
;; may be a sequence of expressions. If the corresponding 〈p 〉 is found to be true, the
;; expressions 〈e 〉 are evaluated in sequence and the value of the final expression in
;; the sequence is returned as the value of the cond. In an if expression, however, the
;; 〈consequent 〉 and 〈alternative 〉 must be single expressions.
;;
;; Since the new-if is based on cond, it keeps re-evaluating the statement that is true
;; and never returns leading to eventually running out of memory. This problem doesn't
;; occur with the normal if method.
;;
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

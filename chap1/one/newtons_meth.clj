;; Trying to implement Newton's method from Section 1.7 in Clojure
;;
;; The sqrt function depends on sqrt-iter which requires good-enough?
;; the good-enough? function improves the guess using the improve
;; function.
;; The logic of the function is completely based on the logic
;; in SICP just translated to Clojure.

 (defn average [x y]
  ( / (+ x y) 2.0))

 (defn improve [guess x]
   ( average guess (/ x guess) ))

 (defn good-enough? [guess x]
   (< ( Math/abs (- (* guess guess ) x )) 0.001 ))

(defn sqrt-iter [guess x]
  (cond
    (good-enough? guess x)
    guess
    :else (sqrt-iter (improve guess x) x)))



(defn sqrt [x] (sqrt-iter 1.0 x ) )

(println (sqrt 9.0 ))

;; Define a procedure that takes three numbers as arguments and returns the sum of the squares of the two larger numbers. 

;; Uding the min function from the std library of clojure

(ns exercises.one.three    
    (:gen-class))

;; define the three numbers
(def a 3)
(def b 4)
(def c 5)

;; the computation and printing the result
(defn sum_sq [a b c](+ (Math/pow a 2) (Math/pow b 2) (Math/pow c 2)))
(println (- (sum_sq a b c) (Math/pow (min a b c) 2)))
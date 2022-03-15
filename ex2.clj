;; Write a function to return true or false based
;; on the supplied value being divisible by a factor
;; – Use a closure to define the divisor
;; – Use filter to apply the function to a list of
;;   integers
;; – Print the original and resulting lists

;; (def myadd (adder -500)) Example closure

(defn isDivisibleBy [factor]
	(fn [number]
		(def result (/ number factor))
		(def roundedResult (Math/round (double result)))

		(and (= result roundedResult))
	)
)

(def divisibleBy2 (isDivisibleBy 2))

(def testList [2 3 4 17 3000 -3 -6 0])

(def divisibleSuccess (filter divisibleBy2 testList))

(println "Original list:" testList)
(println "List of numbers divisible by 2:" divisibleSuccess)
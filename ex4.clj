;; Combine the three functions into a composite function which takes a list
;; of doubles, rounds them to ints, filters them based on divisibility by a
;; value, and finally returns the largest value
;; – Note: comp is the functional composition function
;; – Print the original list and resulting value

(load-file "ex1.clj")
(load-file "ex2.clj")
(load-file "ex3.clj")

;; Tried many different versions of using the comp function but there was always an issue
;; and there don't seem to be many good resources on the internet for how to use this function
(def allThree
	(comp maxValue divisibleBy2 round)
)

;; Composing the round and divisible functions is easy as pie
(def firstTwo
	(comp divisibleBy2 round)
)

(def testList [4.7 3.3 -17 17 -5.6 -3.3 0])

;; Manually composing end since the comp function is so difficult to use with findMax
(def almostThere (filter firstTwo testList))
(def output (reduce findMax almostThere))

(println "Original list:" testList)
(println "Highest rounded number divisible by 2:" output)
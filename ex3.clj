;; Write a function to use with reduce that will result in the largest number
;; in a list of values being returned
;; – Apply the function using reduce to a list of values
;; – Print the original list and resulting value

(defn findMax [accum value]
	(if (> accum value) accum value)
)

(def testList [2 3 4 17 3000 -3 0 -3001])
(def maxValue (reduce findMax testList))

(println "Original list:" testList)
(println "Highest number:" maxValue)
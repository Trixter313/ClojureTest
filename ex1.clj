;; Write a function to properly round values
;; – Use map to round a list of double values
;; – Print the original and resulting lists

(defn round [input] (Math/round (double input)))

(def testList [4.7 3.3 -17 17 -5.6 -3.3 0])

(def roundedList (map round testList))

(println "Original list:" testList)
(println "Rounded list:" roundedList)
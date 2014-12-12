(ns joyofclojure.strict-map2-test
  (:require [clojure.test :refer :all]
            [joyofclojure.strict-map2 :refer :all]))

(deftest test_strict_map2
  (testing "apply a function to every element in a collection"
  	(is (= [0 -1 -2 -3 -4] (strict-map2 - (range 5)))))
  )
  
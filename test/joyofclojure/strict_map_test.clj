(ns joyofclojure.strict-map-test
  (:require [clojure.test :refer :all]
            [joyofclojure.strict-map :refer :all]))

(deftest test_strict_map
  (testing "apply a function to every element in a collection"
  	(is (= `(0 -1 -2 -3 -4) (strict-map - (range 5)))))
  )
  
(ns clojurectci.chapter8.q5.parentheses-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter8.q5.parentheses :refer :all]))

(deftest test_pair_of_parentheses
  (testing "generating n pair of properly closed parentheses"
  	(is (= #{} (pair_of_parentheses 0)))
  	(is (= #{"()"} (pair_of_parentheses 1)))
 )) 
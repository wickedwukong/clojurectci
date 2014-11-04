(ns clojurectci.chapter8.q1.steps-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter8.q1.steps :refer :all]))

(deftest test_steps
  (testing "different steps to climb a n step stair"
  	(is (= #{`(1)} (steps 1)))
  	(is (= #{`(1 1) `(2)} (steps 2)))
 )) 
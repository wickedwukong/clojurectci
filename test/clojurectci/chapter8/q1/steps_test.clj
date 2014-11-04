(ns clojurectci.chapter8.q1.steps-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter8.q1.steps :refer :all]))

(deftest test_steps
  (testing "different steps to climb a n step stair"
  	(is (= #{} (steps 0)))
  	(is (= #{`(1)} (steps 1)))
  	(is (= #{`(1 1) `(2)} (steps 2)))
  	(is (= #{`(1 1 1) `(1 2) `(2 1) `(3)} (steps 3)))
  	(is (= #{`(1 1 1 1) `(1 1 2) `(1 2 1) `(2 1 1) `(2 2) `(1 3) `(3 1)} (steps 4)))
 )) 
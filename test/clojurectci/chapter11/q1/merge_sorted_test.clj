(ns clojurectci.chapter11.q1.merge-sorted-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter11.q1.merge-sorted :refer :all]))

(deftest test_merge
  (testing "merge two sorted list"
  	(is (= `(1 1) (merge_sorted `(1) `(1))))
  	(is (= `(1) (merge_sorted `(1) `())))
  	(is (= `(1) (merge_sorted `() `(1))))
  	(is (= `(1 2) (merge_sorted `(1) `(2))))
  	(is (= `(1 2) (merge_sorted `(2) `(1))))
  	))

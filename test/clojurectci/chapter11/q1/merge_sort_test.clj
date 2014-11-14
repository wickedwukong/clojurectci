(ns clojurectci.chapter11.q1.merge-sort-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter11.q1.merge-sort :refer :all]))

(deftest test_merge
  (testing "merge two sorted list"
  	(is (= `(1) (merge_sort `(1) `(1))))
  	(is (= `(1) (merge_sort `(1) `())))
  	))

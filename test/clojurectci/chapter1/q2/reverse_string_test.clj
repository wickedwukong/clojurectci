(ns clojurectci.chapter1.q2.reverse-string-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.q2.reverse-string :refer :all]))

(deftest test_reverse_string
  (testing "reverse various strings including empty and nil string"
    (is (= "a" (reverse-string "a")))))

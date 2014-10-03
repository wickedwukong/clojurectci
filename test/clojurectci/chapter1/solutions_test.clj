(ns clojurectci.chapter1.solutions-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.solutions :refer :all]))

;q1 tests
(deftest test_has_unique_chars
  (testing "test if a string has has unique chars"
    (is (= true (has_unique_chars "a")))
    (is (= true (has_unique_chars "A")))
    (is (= true (has_unique_chars "a")))
    (is (= true (has_unique_chars "ab")))
    (is (= true (has_unique_chars "AB")))
    (is (= true  (has_unique_chars "")))
    (is (= false (has_unique_chars "aa")))
    (is (= false (has_unique_chars "aba")))
    (is (= false (has_unique_chars "caca")))
    (is (= false (has_unique_chars "cabad")))
    ))

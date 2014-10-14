(ns clojurectci.chapter1.q3.permutation?-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.q3.permutation? :refer :all]))

(deftest test_one_string_is_a_permutation_of_the_other
  (testing "if one string is a permutation of the other"
    (is (= true (permutation? "" "")))
    (is (= true (permutation? "A" "A")))
    (is (= true (permutation? "ab" "ba")))
    (is (= true (permutation? "ab" "ab")))
    (is (= true (permutation? "AB" "BA")))
    (is (= true (permutation? "abc" "cba")))
    (is (= true (permutation? "abc" "abc")))
    (is (= true (permutation? "abca" "aabc")))
    (is (= true (permutation? "" "")))
    (is (= true (permutation? "a " " a")))
    (is (= false (permutation? "a" "aa")))
    (is (= false (permutation? "a" "a ")))
    (is (= false (permutation? "abc" "abd")))
    (is (= false (permutation? "A" "a")))
    (is (= false (permutation? "Ab" "ab")))
    (is (= false (permutation? nil nil)))
    ))

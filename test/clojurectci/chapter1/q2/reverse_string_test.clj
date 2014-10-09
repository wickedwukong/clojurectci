(ns clojurectci.chapter1.q2.reverse-string-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.q2.reverse-string :refer :all]))

(deftest test_reverse_string
  (testing "reverse various strings including empty and nil string"
  	(is (= "" (reverse-string "")))
    (is (= "" (reverse-string-using-dotdot-macro "")))
    (is (= "" (reverse-string-using-recur "")))
    (is (= " " (reverse-string " ")))
    (is (= " " (reverse-string-using-dotdot-macro " ")))
    (is (= " " (reverse-string-using-recur " ")))
    (is (= "a" (reverse-string "a")))
    (is (= "a" (reverse-string-using-dotdot-macro "a")))
    (is (= "a" (reverse-string-using-recur "a")))
    (is (= "ba" (reverse-string "ab")))
    (is (= "ba" (reverse-string-using-dotdot-macro "ab")))
    (is (= "ba" (reverse-string-using-recur "ab")))
    (is (= "aa" (reverse-string "aa")))
    (is (= "aa" (reverse-string-using-dotdot-macro "aa")))
    (is (= "aa" (reverse-string-using-recur "aa")))
    (is (= nil (reverse-string nil)))
    (is (= nil (reverse-string-using-dotdot-macro nil)))
    (is (= nil (reverse-string-using-recur nil)))
    ))

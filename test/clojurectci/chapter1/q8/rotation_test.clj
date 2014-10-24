(ns clojurectci.chapter1.q8.rotation-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.q8.rotation :refer :all]))

(deftest test_rotation?
  (testing "if a string is a rotation of another string"
  	(is (= true (rotation? "a" "a")))
  	(is (= false (rotation? "a" "b")))
  	(is (= true (rotation? "ab" "ba")))
  	(is (= true (rotation? "abc" "bca")))
  	(is (= true (rotation? "abc" "cab")))
  	(is (= true (rotation? "" "")))
))
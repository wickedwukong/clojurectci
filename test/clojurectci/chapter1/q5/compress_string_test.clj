(ns clojurectci.chapter1.q5.compress-string-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.q5.compress-string :refer :all]))


(deftest test_compress_string
  (testing "compress string"
  	(is (= "" (compress "")))
  	(is (= "a" (compress "a")))
  	(is (= "a2" (compress "aa")))
  	(is (= "a3" (compress "aaa")))
  	(is (= "a3b1" (compress "aaab")))
  	(is (= "a3b2c1" (compress "aaabbc")))
  	(is (= "a2b1c5a3" (compress "aabcccccaaa")))
))

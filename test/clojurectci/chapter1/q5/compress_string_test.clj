(ns clojurectci.chapter1.q5.compress-string-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.q5.compress-string :refer :all]))


(deftest test_compress_string
  (testing "compress string"
  	(is (= "" (compress "")))
))

(ns clojurectci.chapter1.q8.rotation-test
  (:require [clojure.test :refer :all]
            [clojurectci.chapter1.q8.rotation :refer :all]))

(deftest test_rotation?
  (testing "compress string"
  	(is (= true (rotation? "a" "a")))
))
(ns joyofclojure.pos-test
  (:require [clojure.test :refer :all]
            [joyofclojure.pos :refer :all]))

(deftest test_pos
  (testing "finding the index or key"
  	(is (= 5 (pos 3 [:a 1 :b 2 :c 3 :d 5])))
  	(is (= 2 (pos 3 [1 2 3])))
  	(is (= 0 (pos 1 [1 2 3])))
  	(is (= nil (pos 3 [])))
  	(is (= nil (pos 3 [1 1]))))
  )

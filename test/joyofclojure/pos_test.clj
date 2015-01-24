(ns joyofclojure.pos-test
  (:require [clojure.test :refer :all]
            [joyofclojure.pos :refer :all]))

(deftest test_pos
  (testing "finding the index or key"
  	(is (= 5 (pos 3 '(:a 1 :b 2 :c 3 :d 5))))
  	(is (= 5 (pos 3 [:a 1 :b 2 :c 3 :d 5])))
  	(is (= 2 (pos 3 [1 2 3])))
  	(is (= 0 (pos 1 [1 2 3])))
  	(is (= nil (pos 3 [])))
  	(is (= nil (pos 3 [1 1])))
    (is (= :c (pos 3 {:a 1 :b 2 :c 3 :d 4})))	
    (is (= nil (pos 5 {:a 1 :b 2 :c 3 :d 4})))	
    (is (= 13 (pos \3 ":a 1 :b 2 :c 3 :d 4")))	
    (is (= 3 (pos 3 #{:a 1 :b 2 :c 3 :d 4})))	
    (is (= :b (pos :b #{:a 1 :b 2 :c 3 :d 4})))	
    (is (= 4 (pos 4 #{:a 4})))	
  	)
  )

(deftest test_pos2
  (testing "finding the index or key"
  	(is (= 5 (pos2 3 '(:a 1 :b 2 :c 3 :d 5))))
  	(is (= 5 (pos2 3 [:a 1 :b 2 :c 3 :d 5])))
  	(is (= 2 (pos2 3 [1 2 3])))
  	(is (= 0 (pos2 1 [1 2 3])))
  	(is (= nil (pos2 3 [])))
  	(is (= nil (pos2 3 [1 1])))
    (is (= :c (pos2 3 {:a 1 :b 2 :c 3 :d 4})))	
    (is (= nil (pos2 5 {:a 1 :b 2 :c 3 :d 4})))	
    (is (= 13 (pos2 \3 ":a 1 :b 2 :c 3 :d 4")))	
    (is (= 3 (pos2 3 #{:a 1 :b 2 :c 3 :d 4})))	
    (is (= :b (pos2 :b #{:a 1 :b 2 :c 3 :d 4})))	
    (is (= 4 (pos2 4 #{:a 4})))	
  	)
  )

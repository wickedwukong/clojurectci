(ns joyofclojure.matrix-2d-neighbors-test
  (:require [clojure.test :refer :all]
            [joyofclojure.matrix-2d-neighbors :refer :all]))

(deftest test_neighbors
  (testing "finding neighboring celss in a 2D matrix"
  	(is (= `([1 0] [0 1]) (neighbors 3 [0 0])))
  	(is (= `([0 1] [2 1] [1 0] [1 2]) (neighbors 3 [1 1]))))
  )
  
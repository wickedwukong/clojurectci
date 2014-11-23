(ns joyofclojure.matrix-2d-neighbors)

(defn neighbors 
	([size yx] (neighbors [[-1 0] [1 0] [0 -1] [0 1]] size yx))
	([delta size yx]
		(filter (fn [new-yx] 
			      (every? #(< -1 % size) new-yx))
			(map #(vec (map + % yx)) delta))))


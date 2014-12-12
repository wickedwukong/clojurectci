(ns joyofclojure.strict-map2)

(defn strict-map2 [f col]
	(loop [coll col, acc []]
		(if (empty? coll)
			  acc
			  (recur (next coll) 
			  	     (conj acc (f (first coll)))))))


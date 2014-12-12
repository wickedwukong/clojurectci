(ns joyofclojure.strict-map)

(defn strict-map [f col]
	(loop [coll col, acc nil]
		(if (empty? coll)
			  (reverse acc)
			  (recur (next coll) 
			  	     (cons (f (first coll)) acc)))))


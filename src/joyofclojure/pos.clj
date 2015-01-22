(ns joyofclojure.pos)

(defn pos ([e coll] (pos -1 e coll))
	([index e coll] 
		(cond 
			(empty? coll) nil
		    (= e (first coll)) (+ index 1)
			:else (recur (+ index 1) e (rest coll)))))



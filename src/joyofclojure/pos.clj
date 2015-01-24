(ns joyofclojure.pos)

(defn find-key-or-index [e indexed-pairs]
	(cond 
		(empty? indexed-pairs) nil
		(= e (second (first indexed-pairs))) (first (first indexed-pairs))
		:else (recur e (rest indexed-pairs))))

(defn pos [e coll]
	(cond 
		(map? coll) (find-key-or-index e (seq coll))
		(set? coll) (find-key-or-index e (map vector coll coll))
		:else (find-key-or-index e (map-indexed vector coll))))


(defn index [coll]
	(cond 
		(map? coll) (seq coll)
		(set? coll) (map vector coll coll)
		:else (map-indexed vector coll)))

(defn pos2 [e coll]
	(for [[i element] (index coll) :when (= e element)] i))
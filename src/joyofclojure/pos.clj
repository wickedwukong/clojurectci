(ns joyofclojure.pos)

; (defn pos ([e coll] (pos -1 e coll))
	; ([index e coll] 
		; (cond 
			; (empty? coll) nil
		    ; (= e (first coll)) (+ index 1)
			; :else (recur (+ index 1) e (rest coll)))))

(defn find-key-or-index [e indexed-pairs]
	(cond 
		(empty? indexed-pairs) nil
		(= e (second (first indexed-pairs))) (first (first indexed-pairs))
		:else (recur e (rest indexed-pairs))))

(defn pos [e coll]
	(if (map? coll)
		(find-key-or-index e (vec coll))
		(find-key-or-index e (map-indexed vector coll))))
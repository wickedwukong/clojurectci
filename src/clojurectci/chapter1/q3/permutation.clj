(ns clojurectci.chapter1.q3.permutation)

(defn count-char [char-value count-map] 
	(let [count (get count-map char-value)]
		(if (= count nil)
			(assoc count-map char-value 1)
			(assoc count-map char-value (+ count 1))
			)
	))

(defn build-count-map [str-value count-map] 
	(if (= (.length str-value) 0)
		count-map
		(recur (.substring str-value 1) (count-char (.charAt str-value 0) count-map))
		))

(defn unique-char-count-map [str-value] 
	(build-count-map str-value {})
	)

(defn permutation? [str-value1 str-value2]
	(if (or (= str-value1 nil)
			(= str-value2 nil)
			(not= (.length str-value1) (.length str-value2)))
		false
		(if (= (unique-char-count-map str-value1) (unique-char-count-map str-value2))
			true
			false
			)
		))

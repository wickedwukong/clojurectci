(ns clojurectci.chapter1.q5.compress-string)

(defn append-current-compressed-string [compressed-string, current-char-count]	
	(do (.append compressed-string (clojure.string/join current-char-count))
		 compressed-string
	))

(defn empty-str [str-value]
	(== (count str-value) 0))

(defn compress-recursively [compressed-string, current-char-count, remaining-string]
	(if (empty-str remaining-string)
		(do (append-current-compressed-string compressed-string current-char-count) 
			(.toString compressed-string))
		(let [next-char (first remaining-string)
			  current-char (nth current-char-count 0)
			  current-count (nth current-char-count 1)]
			(if (not= current-char next-char)
				(do (append-current-compressed-string compressed-string current-char-count)
					(recur compressed-string [next-char 1] (rest remaining-string)))
				(recur compressed-string [current-char (+ current-count 1)] (rest remaining-string))
			))))



(defn compress [str-to-be-compressed] 
	(if (empty-str str-to-be-compressed)
		str-to-be-compressed
		(let [compressed (compress-recursively (StringBuffer. "") [(first str-to-be-compressed) 1] (rest str-to-be-compressed))]
			(if (> (count compressed) (count str-to-be-compressed))
				str-to-be-compressed
				compressed
			))
))



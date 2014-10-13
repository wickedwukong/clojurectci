(ns clojurectci.chapter1.q5.compress-string
  (:gen-class))

(defn append-current-compressed-string [compressed-string, current-char-count]	
	(do (.append compressed-string (clojure.string/join current-char-count))
		 compressed-string
	))

(defn empty-str [str-value]
	(== (.length str-value) 0))

(defn compress-recursively [compressed-string, current-char-count, remaining-string]
	(if (empty-str remaining-string)
		(do (append-current-compressed-string compressed-string current-char-count) 
			(.toString compressed-string))
		(let [next-char (.charAt remaining-string 0)
			  current-char (nth current-char-count 0)
			  current-count (nth current-char-count 1)]
			(if (not= current-char next-char)
				(do (append-current-compressed-string compressed-string current-char-count)
					(recur compressed-string [next-char 1] (.substring remaining-string 1)))
				(recur compressed-string [current-char (+ current-count 1)] (.substring remaining-string 1))
			))))



(defn compress [str-to-be-compressed] 
	(if (empty-str str-to-be-compressed)
		str-to-be-compressed
		(let [compressed (compress-recursively (StringBuffer. "") [(.charAt str-to-be-compressed 0) 1] (.substring str-to-be-compressed 1))]
			(if (> (.length compressed) (.length str-to-be-compressed))
				str-to-be-compressed
				compressed
			))
))



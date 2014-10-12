(ns clojurectci.chapter1.q5.compress-string
  (:gen-class))

(defn append [compressed-string, current-char-count]	
	(let [current-char (nth current-char-count 0)
		  current-count (nth current-char-count 1)]
 		 (do (.append compressed-string current-char)
			 (if (> current-count 1) (.append compressed-string current-count))
			 compressed-string
	)))

(defn do-it [compressed-string, current-char-count, remaining-string]
	(if (== (.length remaining-string) 0)
		(do (append compressed-string current-char-count) 
			(.toString compressed-string))
		(let [next-char (.charAt remaining-string 0)
			  current-char (nth current-char-count 0)
			  current-count (nth current-char-count 1)]
			(if (not= current-char next-char)
				(do (append compressed-string current-char-count)
					(recur compressed-string [next-char 1] (.substring remaining-string 1)))
				(recur compressed-string [current-char (+ current-count 1)] (.substring remaining-string 1))
			))))

(defn compress [value] 
	(if (== (.length value) 0)
		value
		(let [compressed (do-it (StringBuffer. "") [(.charAt value 0) 1] (.substring value 1))]
			(if (>= (.length compressed) (.length value))
					value
					compressed
				))
		))

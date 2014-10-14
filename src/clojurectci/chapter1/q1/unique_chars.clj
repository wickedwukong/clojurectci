(ns clojurectci.chapter1.q1.unique-chars)

(defn is_empty [str_value] (= 0 (count str_value)))

(defn detect_duplicate_chars_recursively [str_value unique_char_set] 
	(if (is_empty str_value) 
		true
		(if (contains? unique_char_set (.charAt str_value 0))
			false
			#(detect_duplicate_chars_recursively (subs str_value 1) (conj unique_char_set (.charAt str_value 0))))))


;q1 detect whether a string contains only unique strings 
(defn has_unique_chars? [str_value]
	(if (= nil str_value)
		false
		(trampoline #(detect_duplicate_chars_recursively str_value #{}))))




(ns clojurectci.chapter1.q1.unique-chars)

(defn detect_duplicate_chars_recursively [str_value unique_char_set] 
	(if (seq str_value) 
		(if (contains? unique_char_set (first str_value))
			false
			#(detect_duplicate_chars_recursively (rest str_value) (conj unique_char_set (first str_value))))
		true
		))


;q1 detect whether a string contains only unique strings 
(defn has_unique_chars? [str_value]
	(if (nil? str_value)
		false
		(trampoline #(detect_duplicate_chars_recursively str_value #{}))))




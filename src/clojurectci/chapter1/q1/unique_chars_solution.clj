(ns clojurectci.chapter1.q1.unique-chars-solution
  (:gen-class))

(declare has_unique_chars_a has_unique_chars_b)

(defn is_empty [str_value] (= 0 (count str_value)))

(defn has_unique_chars_a [str_value unique_char_set] 
	(if (is_empty str_value) 
		true
		(if (contains? unique_char_set (.charAt str_value 0))
			false
			#(has_unique_chars_b (subs str_value 1) (conj unique_char_set (.charAt str_value 0))))))

(defn has_unique_chars_b [str_value unique_char_set] 
	(if (is_empty str_value)
		true 
		(if (contains? unique_char_set (.charAt str_value 0))
			false 
			#(has_unique_chars_a (subs str_value 1) (conj unique_char_set (.charAt str_value 0))))))


;q1 detect whether a string contains only unique strings 
(defn has_unique_chars [str_value]
	(if (= nil str_value)
		false
		(trampoline #(has_unique_chars_a str_value #{}))
		))




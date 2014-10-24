(ns clojurectci.chapter8.q5.parentheses)

(defn pair_of_parentheses [n]
	(if (= n 0) 
		#{}
		#{"()"}
		))
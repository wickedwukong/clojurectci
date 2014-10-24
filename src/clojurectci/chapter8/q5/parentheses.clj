(ns clojurectci.chapter8.q5.parentheses)

(defn- find_all_properly_closed_parentheses [current_parentheses remaining_left_parens_count remaining_right_parens_count closed_n_pair_of_parents]
		#{"()"}	)

(defn pair_of_parentheses [n]
	(if (= n 0) 
		#{}
		(find_all_properly_closed_parentheses "(" (- n 1) n #{})
		))
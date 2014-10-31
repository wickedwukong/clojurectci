(ns clojurectci.chapter8.q5.parentheses
	(:require [clojure.set :refer [union]]))

(defn- left_parent? [remaining_left_parens_count remaining_right_parens_count]
	(> remaining_left_parens_count 0))

(defn- right_parent? [remaining_left_parens_count remaining_right_parens_count]
	(and (> remaining_right_parens_count remaining_left_parens_count) (>= remaining_left_parens_count 0)))


(defn- find_all_properly_closed_parentheses [current_parentheses remaining_left_parens_count remaining_right_parens_count closed_paren_set]
	(union 
		(if (left_parent? remaining_left_parens_count remaining_right_parens_count)
		        (union closed_paren_set (find_all_properly_closed_parentheses (str current_parentheses "(") (- remaining_left_parens_count 1) remaining_right_parens_count closed_paren_set))
		         closed_paren_set)

		(if (right_parent? remaining_left_parens_count remaining_right_parens_count)
		        (union closed_paren_set (find_all_properly_closed_parentheses (str current_parentheses ")") remaining_left_parens_count (- remaining_right_parens_count 1) closed_paren_set))
		        closed_paren_set)
     
	    (if (and (= remaining_right_parens_count 0) (= remaining_left_parens_count 0))
		       (conj closed_paren_set current_parentheses)
		       closed_paren_set)
	  )  
)	


(defn pair_of_parentheses [n]
	(if (= n 0) 
		#{}
		(find_all_properly_closed_parentheses "(" (- n 1) n #{})
		))
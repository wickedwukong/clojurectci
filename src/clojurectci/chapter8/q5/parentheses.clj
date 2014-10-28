(ns clojurectci.chapter8.q5.parentheses
	(:require [clojure.set :refer [union]]))

(defn- can_insert_left_paren [remaining_left_parens_count remaining_right_parens_count]
	(> remaining_left_parens_count 0))

(defn- can_insert_right_paren [remaining_left_parens_count remaining_right_parens_count]
	(> remaining_right_parens_count remaining_left_parens_count))


(defn- find_all_properly_closed_parentheses [current_parentheses remaining_left_parens_count remaining_right_parens_count]
		(cond (can_insert_left_paren remaining_left_parens_count remaining_right_parens_count)
			        (union #{} (find_all_properly_closed_parentheses (str current_parentheses "(") (- remaining_left_parens_count 1) remaining_right_parens_count))
		      (can_insert_right_paren remaining_left_parens_count remaining_right_parens_count)
			        (union #{} (find_all_properly_closed_parentheses (str current_parentheses ")") remaining_left_parens_count (- remaining_right_parens_count 1)))
			        :else #{})
			)	


(defn pair_of_parentheses [n]
	(if (= n 0) 
		#{}
		(find_all_properly_closed_parentheses "(" (- n 1) n)
		))
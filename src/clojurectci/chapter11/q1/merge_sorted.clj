(ns clojurectci.chapter11.q1.merge-sorted)

(defn-  merge_in_ascending_order [current_a remaining_a current_b remaining_b merged_results]
	(cond 
		(nil? current_a) (concat (conj merged_results current_b) remaining_b)
		(nil? current_b) (concat (conj merged_results current_a) remaining_a)
		:else	(if (> current_a current_b) 
					(recur (first remaining_a) (rest remaining_a) current_b remaining_b (conj merged_results current_a))
					(recur current_a remaining_a (first remaining_b) (rest remaining_b) (conj merged_results current_b)))))

(defn merge_sorted [sorted_a sorted_b] 
	(merge_in_ascending_order (first sorted_a) (rest sorted_a) (first sorted_b) (rest sorted_b) ()))
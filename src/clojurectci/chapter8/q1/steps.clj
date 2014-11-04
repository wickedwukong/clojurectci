(ns clojurectci.chapter8.q1.steps
	(:require [clojure.set :refer [union]]))

(defn- take_one_step [current_steps] (conj current_steps 1))

(defn- take_two_steps [current_steps] (conj current_steps 2))

(defn- take_three_steps [current_steps] (conj current_steps 3))

(defn- not_enough_steps? [current_steps num_stairs]
	(< (reduce + current_steps) num_stairs))

(defn- just_enough_steps? [current_steps num_stairs]
	(= (reduce + current_steps) num_stairs))

(defn- find_steps [num_stairs current_steps step_set] 
	(union
		(if (just_enough_steps? current_steps num_stairs)
	     	(conj step_set current_steps))

		(if (not_enough_steps? current_steps num_stairs) 
			(union step_set
				(find_steps num_stairs (take_one_step current_steps) step_set)
				(find_steps num_stairs (take_two_steps current_steps) step_set)
				(find_steps num_stairs (take_three_steps current_steps) step_set)
		    ))

	    step_set) 	
	)

(defn steps [n]
	(if (<= n 0)
		#{}
		(find_steps n () #{})))


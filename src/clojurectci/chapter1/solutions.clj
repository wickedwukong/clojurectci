(ns clojurectci.chapter1.solutions
  (:gen-class))

(defn fa [stringValue stringSet] 
	(if (= 0 (count stringValue)) true 
		(if (contains? stringSet (.charAt stringValue 0))
			false 
			#(fb (subs stringValue 1) (conj stringSet (.charAt stringValue 0))))))

(defn fb [stringValue stringSet] 
	(if (= 0 (count stringValue)) true 
		(if (contains? stringSet (.charAt stringValue 0))
			false 
			#(fb (subs stringValue 1) (conj stringSet (.charAt stringValue 0))))))


;q1 detect whether a string contains only unique strings 
(defn has_unique_chars [stringValue]
	(trampoline (fa stringValue #{})))


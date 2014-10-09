(ns clojurectci.chapter1.q2.reverse-string
  (:gen-class))

(defn reverse-string[value] 
	(if (= nil value)
	nil
	(.toString (.reverse (StringBuilder. value)))))

(defn do-it[value, index, reversed] 
	(if (>= index 0)
		(recur value (- index 1) (.append reversed (.charAt value index)))
		reversed
		)
	)

(defn reverse-string-using-recur[value] 
	(if (= nil value)
	nil
	(.toString (do-it value (- (.length  value) 1) (StringBuffer. "")))))


(defn reverse-string-using-dotdot-macro[value] 
	(if (= nil value)
	nil
	(.. (StringBuilder. value) reverse toString)))



(ns clojurectci.chapter1.q2.reverse-string
  (:gen-class))

(defn reverse-string[value] 
	(if (= nil value)
	nil
	(.toString (.reverse (StringBuilder. value)))))

(defn reverse-string-using-dotdot-macro[value] 
	(if (= nil value)
	nil
	(.. (StringBuilder. value) reverse toString)))



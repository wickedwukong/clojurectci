(ns clojurectci.chapter1.q8.rotation)

(defn rotation? [s1 s2]
	(.contains (str s1 s1) s2))

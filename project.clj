(defproject clojurectci "0.1.0-SNAPSHOT"
  :description "Solutions, imlemented in Clojure, to the excersies in the Cracking the coding interview."
  :url "https://github.com/wickedwukong/clojurectci.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot clojurectci.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

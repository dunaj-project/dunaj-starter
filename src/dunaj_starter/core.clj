(ns dunaj-starter.core
  "See http://www.dunaj.org for documentation and examples"
  (:api dunaj))

(defn bar :- String
  [s :- String]
  (str (print "Hello %s!" s)))

(defn foo :- nil
  [s :- String]
  (println! (bar s))
  nil)

(foo "World")

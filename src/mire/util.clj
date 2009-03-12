(ns mire.util)

(defn move-between-refs
  "Move one instance of obj between from and to. Must be called in a transaction."
  [obj from to]
  (commute from disj obj)
  (commute to conj obj))


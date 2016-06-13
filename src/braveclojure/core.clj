(ns braveclojure.core)

(def my-name (str "Walter"))                 ; Use the str 
(def my-vector [1 2 3])                      ; Use the vector 
(def my-list '(1 2 3))                       ; Use the list
(def my-hash-map (hash-map :a 1 :b 2 :c 3))  ; Use the hash-map
(def my-hash-set (hash-set "1" "2" "3"))     ; Use the hash-set

(defn adds-100
  "Write a function that takes a number and adds 100 to it"
  [num]
  (+ num 100))

(defn dec-maker
  "Write a function like inc-maker"
  [y]
  (fn [x] (- x y)))

(def dec9 (dec-maker 9))

(defn mapset
  "Write a function that works like map except the return value is a set"
  [x y]
  (apply sorted-set (set (map x y))))

(defn -main []
  (println "Use the str:" my-name)
  (println "Use the vector:" my-vector)
  (println "Use the list:" my-list)
  (println "Use the hash-map:" my-hash-map)
  (println "Use the hash-set:" my-hash-set)
  (println "Write a function that takes a number and adds 100 to it:" (adds-100 1))
  (println "Write a function like inc-maker:" (dec9 10))
  (println "Write a function that works like map except the return value is a set:" (mapset inc [1 1 2 2])))

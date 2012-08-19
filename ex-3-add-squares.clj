(def square
  (fn [n]
    (* n n)))

(def add-squares
  (fn [& list]
    (apply + (map square list))))

(print (add-squares 1 2 5))
(def second (fn [list] (first (rest list))))

(def third-a (fn [list] (first (rest (rest list)))))
(def third-b (fn [list] (second (rest list))))

(print (third-a '(5 4 3 2 1)))
(print (third-b '(5 4 3 2 1)))

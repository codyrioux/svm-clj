(ns svm.data
  (:use [clojure.string :only (split)]))

(defn parse-libsvm-line
  "Parse a text line in LibSVM format."
  [line]
  (let [[label & data] (split line #"\s+")]
    [(Integer/parseInt label)
     (reduce
      (fn [set [index value]]
        (assoc set
          (Integer/parseInt index)
          (Double/parseDouble value)))
      {} (map #(split % #":") data))]))

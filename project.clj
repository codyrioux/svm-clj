(defproject svm-clj "0.1.0-SNAPSHOT"
  :author "Roman Scherer"
  :autodoc {:copyright "Copyright (c) 2011 Roman Scherer"
            :name "Clojure LibSVM"
            :web-src-dir "https://github.com/r0man/svm-clj/blob/"
            :web-home "https://r0man.github.com/svm-clj/"}
  :description "Clojure Library for LibSVM."
  :url "https://github.com/r0man/svm-clj"
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :extra-classpath-dirs ["/usr/share/java/libsvm.jar"])
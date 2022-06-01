(ns clojure-simple-web-app.core
  (:require
   [org.httpkit.server :refer [run-server]]
   [clojure-simple-web-app.routes :refer [app]]))

(def server (atom nil))

(reset! server (run-server #'app {:port 8080}))

(@server)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

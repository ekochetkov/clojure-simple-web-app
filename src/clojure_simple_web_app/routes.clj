(ns clojure-simple-web-app.routes
  (:require
   [compojure.core :refer [defroutes GET]]
   [clojure-simple-web-app.views :refer [handler-home]]
   [clojure-simple-web-app.patient :refer [handler-patient-index]]))

(defroutes app
  (GET "/" request handler-home)
  (GET "/patient" request handler-patient-index)  
  )

(ns clojure-simple-web-app.patient
  (:require
   [clojure-simple-web-app.views :refer [template]]
   [hiccup.core :refer [html]]
   [clojure.java.jdbc :as jdbc]
   ))

;; DB-spec example file
;; TODO: move to .env file
(def db-spec
  {:dbtype "postgresql"
   :dbname "public"
   :host "127.0.0.1"
   :user "postgres"
   :password "postgres"})

(defn handler-patient-index [request]
  (html (template
         "Patient CRUD page"
         [:div
          [:h3 "Patient index here"]
          [:table {:border "1px"}
           [:thead
            [:tr
             [:th "#"]
             [:th "FIO"]
             [:th "Gender"]
             [:th "Burth-date"]
             [:th "OMS-number"]]]
           [:tbody
            
            ] ; tbody end

           ]])))


(ns clojure-simple-web-app.views
  (:require [hiccup.core :refer [html]]))

(defn handler-home [request]
  (html
   (template
    "The clojure web app"
    [:div
     [:h1 "Hello!"]
     [:p "Some information about clojure simple web app"]
     [:a {:href "/patient"} "Patient CRUD"]])))

(def header [:div [:h1 "Header"]])
(def footer [:div [:hr] [:p "All right reserved"]])

(defn template [title content]
  [:html
   [:head
    [:title title]]
   [:body
    content footer]])

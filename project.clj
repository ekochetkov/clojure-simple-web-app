(defproject clojure-simple-web-app "0.1.0-SNAPSHOT"
  :description "Simple web-application by clojure"
;;  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.54"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [org.postgresql/postgresql "42.3.6"]
                 [hiccup/hiccup "1.0.5"]
                 [http-kit/http-kit "2.5.3"]
                 [compojure/compojure "1.7.0"]]
  :main clojure-simple-web-app.core
)

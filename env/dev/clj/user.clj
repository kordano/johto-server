(ns user
  (:require
    [johto-server.config :refer [env]]
    [clojure.spec.alpha :as s]
    [expound.alpha :as expound]
    [mount.core :as mount]
    [johto-server.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'johto-server.core/repl-server))

(defn stop []
  (mount/stop-except #'johto-server.core/repl-server))

(defn restart []
  (stop)
  (start))



(ns johto-server.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [johto-server.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[johto-server started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[johto-server has shut down successfully]=-"))
   :middleware wrap-dev})

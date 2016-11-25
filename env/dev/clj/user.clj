(ns user
  (:require [mount.core :as mount]
            [slurry.figwheel :refer [start-fw stop-fw cljs]]
            slurry.core))

(defn start []
  (mount/start-without #'slurry.core/repl-server))

(defn stop []
  (mount/stop-except #'slurry.core/repl-server))

(defn restart []
  (stop)
  (start))



(ns slurry.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[slurry started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[slurry has shut down successfully]=-"))
   :middleware identity})

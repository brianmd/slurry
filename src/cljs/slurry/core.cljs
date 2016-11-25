(ns slurry.core)

(defn init! []
  (-> (.getElementById js/document "app")
      (.-innerHTML)
      (set! "Welcome to slurry")))

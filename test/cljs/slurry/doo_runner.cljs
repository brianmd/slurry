(ns slurry.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [slurry.core-test]))

(doo-tests 'slurry.core-test)


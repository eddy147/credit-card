(ns credit-card.core
  (:require [clojure.java.io :as io]
            [clojure.string :as string]
            [clojure.data.csv :as csv]
            [clojure.core.matrix :as mat]
            [clojure.core.matrix.stats :as matstats]
            [cortex.nn.layers :as layers]
            [cortex.nn.network :as network]
            [cortex.nn.execute :as execute]
            [cortex.optimize.adadelta :as adadelta]
            [cortex.optimize.adam :as adam]
            [cortex.metrics :as metrics]
            [cortex.util :as util]
            [cortex.experiment.util :as experiment-util]
            [cortex.experiment.train :as experiment-train]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def orig-data-file "resources/creditcard.csv")
(def log-file "training.log")
(def network-file "trained-network.nippy")

(def params
  {:test-ds-size      50000 ;; total = 284807, test-ds ~= 17.5%
   :optimizer         (adam/adam)   ;; alternately, (adadelta/adadelta)
   :batch-size        100
   :epoch-count       30
   :epoch-size        200000})
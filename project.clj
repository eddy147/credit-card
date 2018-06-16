(defproject credit-card "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                [thinktopic/cortex "0.9.10"]
                [thinktopic/experiment "0.9.10"]
                [org.clojure/tools.cli "0.3.5"]
                [org.clojure/clojurescript "1.8.51"]
                [org.bytedeco.javacpp-presets/cuda "8.0-1.2"]
                [org.clojure/data.csv "0.1.3"]]
  :main ^:skip-aot credit-card.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

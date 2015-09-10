(ns require-paths.core
  (:require [SecondLib :as second-lib]))

(enable-console-print!)

(println "Calling all the things...")

(second-lib/call "some argument")

(println "All the things called...")

(require 'cljs.build.api)

(cljs.build.api/build "src" {:main          "require-paths.core"
                             :language-in   :ecmascript6-strict
                             ; :language-out
                             :output-to     "out/require-paths.js"
                             :output-dir    "out"
                             :optimizations :none
                             :verbose       true
                             :foreign-libs  [{:file "lib/FirstLib.js"
                                              :provides ["FirstLib"]
                                              :module-type :commonjs}
                                             {:file "lib/SecondLib.js"
                                              :provides ["SecondLib"]
                                              :module-type :commonjs}]})

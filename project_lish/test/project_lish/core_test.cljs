(ns project-lish.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [project-lish.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))

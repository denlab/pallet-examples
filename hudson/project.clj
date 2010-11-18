    (defproject blank-project "0.4.0-SNAPSHOT"
      :description "hudson example project for pallet"
      :dependencies [[org.cloudhoist/pallet "0.4.0-SNAPSHOT"]
                     [org.cloudhoist/pallet-crates-all "0.4.0-SNAPSHOT"]
                     [org.jclouds/jclouds-all "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-jsch "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-log4j "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-enterprise "1.0-SNAPSHOT"]
                     [log4j/log4j "1.2.14"]]
      :dev-dependencies [[org.cloudhoist/pallet-lein "0.1.0"]]
      :repositories {"sonatype-snapshot" "https://oss.sonatype.org/content/repositories/snapshots/"
                     "sonatype" "https://oss.sonatype.org/content/repositories/releases"})

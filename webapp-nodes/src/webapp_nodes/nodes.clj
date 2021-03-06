(ns webapp-nodes.nodes
  (:require
   [pallet.core :as core]
   [pallet.resource :as resource]
   [pallet.resource.service :as service]
   [webapp-nodes.crates :as crates]))

(core/defnode webapp
  "Basic web app, serverd by tomcat"
  {:inbound-ports [8080 22]} ;; 8080 for tomcat, 22 for SSH
  :bootstrap (resource/phase
              (crates/bootstrap))
  :configure (resource/phase
              (crates/tomcat))
  :deploy (resource/phase
           (crates/tomcat-deploy
            "../mini-webapp/mini-webapp-0.4.0-SNAPSHOT.war"))
  :restart-tomcat (resource/phase
                   (service/service "tomcat6" :action :restart)))

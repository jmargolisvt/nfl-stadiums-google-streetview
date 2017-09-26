(ns stadium.core
  (:require [reagent.core :as r]
            [data.teams :as data]
            [components.inputs :as cmp]))

(enable-console-print!)

(def app-state
  (r/atom {:street "" :city "" :name nil}))

(defn set-image
  "Add an extra step here to only update the stadium image when the button is clicked."
  ([address]
    (let [stadium-img (.getElementById js/document "stadium")]
      (set! (.-src stadium-img) (str data/base-url (:street address) (:city address))))))

(defn form []
  [:div
   [cmp/input app-state :street]
   [cmp/input app-state :city]
   [:button  {:on-click #(do
                           (swap! app-state assoc :name nil)
                           (set-image @app-state))}
    "Let's Go!"]])

(defn teams-list []
  [:div
   [:h1 "Visit an NFL Stadium"]
    [:div#teams
      (for [tm data/teams]
        ^{:key (:name tm)}
        [:span.team
          {:on-click #(do
                        (reset! app-state tm)
                        (set-image @app-state))}
          (:name tm)])]])

(defn home []
  [:div.home
   [teams-list]
   [:h2 "-- Or Anywhere, Really --"]
   [form]
   [:img#stadium {:src ""}]
   [:div#title (@app-state :name)]
   [:div (@app-state :street)]
   [:div (@app-state :city)]
   (if-let [team-name (@app-state :name) ]
     [:img#helmet {:src (str "http://icons.iconarchive.com/icons/evermor-design/nfl-helmets/128/" team-name "-icon.png")}])])


;; Render the root component
(defn start []
  (r/render-component
   [home]
   (.getElementById js/document "app")))

(start)

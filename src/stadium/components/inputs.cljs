(ns components.inputs)

(defn input [state field]
     [:input {:type "text"
            :value (@state field) ; avoids keeping state in the DOM
            :placeholder field
            :style {:width "30%" :padding "1%" :margin "1%"}
            :on-change #(swap! state assoc field (.-value (.-target %)))}])

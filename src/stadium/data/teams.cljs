(ns data.teams
  (:require [data.google-api :as api]))

(def base-url (str
  "http://maps.googleapis.com/maps/api/streetview?size=600x400&key="
  api/google-key "&location="))

(def teams [{:name "Giants" :street "1 MetLife Way" :city "East Rutherford"}
            {:name "Redskins" :street "1600 Fedex Way" :city "Hyattsville"}
            {:name "Eagles" :street "1 Lincoln Financial Field Way" :city "Philiadelphia"}
            {:name "Cowboys" :street "ATT Stadium" :city "Arlington"}
            {:name "Packers" :street "1265 Lombardi Ave" :city "Green Bay"}
            {:name "Vikings" :street "401 Chicago Ave" :city "Minneapolis"}
            {:name "Bears" :street "1410 Museum Campus Dr" :city "Chicago"}
            {:name "Lions" :street "2000 Brush St" :city "Detroit"}
            {:name "Rams" :street "Los Angeles Stadium at Hollywood Park" :city "Inglewood"}
            {:name "49ers" :street "4900 Marie P DeBartolo Way" :city "Santa Clara"}
            {:name "Seahawks" :street "800 Occidental Ave S" :city "Seattle"}
            {:name "Cardinals" :street "1 Cardinals Dr" :city "Glendale"}
            {:name "Saints" :street "1500 Sugar Bowl Dr" :city "New Orleans"}
            {:name "Buccaneers" :street "4201 N Dale Mabry Hwy" :city "Tampa"}
            {:name "Panthers" :street "800 S Mint St" :city "Charlotte"}
            {:name "Falcons" :street "1414 Andrew Young International Blvd NW" :city "Atlanta"}
            {:name "Patriots" :street "1 Patriot Place" :city "Foxborough"}
            {:name "Jets" :street "1 MetLife Way" :city "East Rutherford"}
            {:name "Bills" :street "1 Bills Dr" :city "Orchard Park"}
            {:name "Dolphins" :street "347 Don Shula Dr" :city "Miami Gardens"}
            {:name "Bengals" :street "1 Paul Brown Stadium" :city "Cincinnati"}
            {:name "Ravens" :street "1101 Russell St" :city "Baltimore"}
            {:name "Steelers" :street "100 Art Rooney Ave" :city "Pittsburgh"}
            {:name "Browns" :street "100 Alfred Lerner Way" :city "Cleveland"}
            {:name "Chargers" :street "9449 Friars Rd" :city "San Diego"}
            {:name "Chiefs" :street "1 Arrowhead Dr" :city "Kansas City"}
            {:name "Raiders" :street "7000 Coliseum Way" :city "Oakland"}
            {:name "Broncos" :street "1701 Bryant St" :city "Denver"}
            {:name "Texans" :street "2 NRG Park " :city "Houstan"}
            {:name "Titans" :street "1 Titans Way," :city "Nashville"}
            {:name "Jaguars" :street "1 Everbank Field Dr" :city "Jacksonville"}])

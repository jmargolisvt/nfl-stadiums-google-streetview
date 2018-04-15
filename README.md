# NFL Stadium Google Street View

Ever want to visit all the NFL stadiums without the hassle of actually going there?  Now you sorta can!

To run this project, you'll need a [Google Maps API key](https://developers.google.com/maps/documentation/javascript/get-api-key).
In the `/data` directory, create a file called "google-api.cljs".  It should look like this:

    (ns data.google-api)

    (def google-key "my-google-maps-api-key")


To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

The street addresses don't always provide the best view for the stadium, so if you have better data, please feel free to create a pull request.

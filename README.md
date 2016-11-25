# slurry

generated using Luminus version "2.9.11.12"
lein new luminus slurry +cljs

All project dependencies have been removed from this project, meaning this library cannot be run or tested on its own.
This allows adding of just the dependencies you need.
For example, no need to include oracle, neo4j, or datomic if you don't use those applications.
See https://github.com/brianmd/slurry-test.git for dependency versions that have been tested.

Also note that code in src/clj-and-s is used in both clojure and clojurescript. Please modify your source paths to include this directory should you use one of these libraries.

FIXME

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein run

## License

Copyright © 2016 FIXME

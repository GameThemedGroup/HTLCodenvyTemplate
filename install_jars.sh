#! /bin/bash

mvn install:install-file -Dfile=/projects/HTL/lib/HTL_API-1.0.jar -DgroupId=Engine -DartifactId=HTL_API -Dversion=1.0 -Dpackaging=jar

mvn install:install-file -Dfile=/projects/HTL/lib/HTLProceduralAPI-1.0.jar -DgroupId=HTLProceduralAPI -DartifactId=HTLProceduralAPI -Dversion=1.0 -Dpackaging=jar

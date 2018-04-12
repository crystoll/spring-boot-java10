#!/bin/bash

# Example of linking spring boot app, not really working yet due to 'Module spring.boot not found'

JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-10.jdk/Contents/Home \
  jlink --module-path $JAVA_HOME/jmods:target \
        --add-modules fi.solita.java10demo \
        --launcher run=fi.solita.java10demo/fi.solita.java10demo.Java10demoApplication \
        --output dist \
        --compress 2 \
        --strip-debug \
        --no-header-files \
        --no-man-pages

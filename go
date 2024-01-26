#!/bin/bash
clear
./gradlew   build
mv  -v  ./build/libs/*.jar   ~/local_Mindustry/mods/

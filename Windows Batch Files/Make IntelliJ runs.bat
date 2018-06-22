@echo off
echo To import project into IntelliJ IDEA, click on “Open” or “Import Project”, navigate to the build.gradle file, and accept default settings.
echo .
title Generating IntelliJ run files...
cd..
gradlew genIntellijRuns
pause
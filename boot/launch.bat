@echo off
cd /d %~dp0
start javaw --module-path .\lib --add-modules javafx.controls,javafx.fxml,javafx.graphics -jar .\bin\aston-task.jar %1
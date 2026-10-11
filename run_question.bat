@echo off
setlocal
if "%~1"=="" (
  echo Usage: run_question.bat Q01_Student_Record_Class_Object.java
  exit /b 1
)
set "SOURCE=%~1"
if not exist "%SOURCE%" (echo File not found: %SOURCE% & exit /b 1)
for /f "tokens=3" %%C in ('findstr /r /c:"^public class " "%SOURCE%"') do set "CLASS=%%C"
if "%CLASS%"=="" (echo Could not identify public class. & exit /b 1)
copy /y "%SOURCE%" "%CLASS%.java" >nul
javac "%CLASS%.java"
if errorlevel 1 (del "%CLASS%.java" 2>nul & exit /b 1)
java "%CLASS%"
set "RESULT=%ERRORLEVEL%"
del "%CLASS%.java" 2>nul
for %%F in (*.class) do del "%%F" 2>nul
exit /b %RESULT%

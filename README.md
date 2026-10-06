# AI Interview Readiness Simulator

A Java console application for practicing Core Java, OOP, DBMS, DSA, and HR interview questions. It collects candidate details, runs a five-question interview, and reports a readiness score.

## Requirements

- Java 21 or newer

## Run from PowerShell

From the repository root:

```powershell
Set-Location .\AIInterviewSimulater
$jdk = Get-ChildItem 'C:\Program Files\Eclipse Adoptium' -Directory | Where-Object { $_.Name -like 'jdk-21*' } | Select-Object -First 1
& "$($jdk.FullName)\bin\javac.exe" -d bin src\module-info.java (Get-ChildItem -Path src\AIInterviewSimulater -Filter *.java | ForEach-Object FullName)
& "$($jdk.FullName)\bin\java.exe" --module-path bin -m AIInterviewSimulater/AIInterviewSimulater.Main
```

Follow the prompts to enter candidate details, choose a category, and answer the questions.

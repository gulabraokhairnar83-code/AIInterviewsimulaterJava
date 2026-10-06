$ErrorActionPreference = 'Stop'
$project = Join-Path $PSScriptRoot 'AIInterviewSimulater'
$jdkRoot = Join-Path $env:ProgramFiles 'Eclipse Adoptium'
$jdk = Get-ChildItem $jdkRoot -Directory |
    Where-Object { $_.Name -like 'jdk-21*' } |
    Select-Object -First 1

if (-not $jdk) {
    throw "Java 21 JDK was not found under $jdkRoot."
}

Set-Location $project
$sources = @(
    'src\module-info.java'
    Get-ChildItem -Path 'src\AIInterviewSimulater' -Filter '*.java' |
        ForEach-Object FullName
)

& (Join-Path $jdk.FullName 'bin\javac.exe') -d bin $sources
if ($LASTEXITCODE -ne 0) {
    throw 'Compilation failed.'
}

& (Join-Path $jdk.FullName 'bin\java.exe') --module-path bin -m 'AIInterviewSimulater/AIInterviewSimulater.Main'

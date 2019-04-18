
@echo off

REM Commandes permettant d'exécuter du code Natif C/C++ à partir de Java
echo.
echo    ____________    _____   _____    _________
echo   I____    ____I   I    \  I   I   I__     __I
echo        I   l       I     \ I   I      I   I
echo        I   I       I      \I   I      I   I
echo        I   I       I           I      I   I 
echo        I   I       I   I\      I      I   I
echo   _____I   I       I   I \     I    __I   I__ 
echo   \________I       I___I  \____I   I_________I


REM -- Configurer la console
title L'api JNI avec le langage C/C++
color 5f

REM Description du projet
echo ----------------------------------------------------------------
echo.
echo EXECUTION DU CODE NATIF C/C++ EN JAVA AVEC L'API JNI
echo.
echo @author Jerome Dh
echo @see https://www.linkedin.com/in/jerome-dh/	
echo @date: 18 Avril 2019	
echo.
echo ----------------------------------------------------------------

REM -- Compiler le fichier Java et générer les entêtes C/C++
echo Generation des fichiers d'entete C/C++ en Java

javac -h headers -d classes java/com/exemple/jni/JNIExemple.java

REM -- Implémenter le fichier d'entête C/C++ et Compiler la source pour générer la Bibliothèque .dll
echo Compilation des sources C/C++

gcc -I "%JAVA_HOME%\include" -I "%JAVA_HOME%\include\win32" -shared -o libs/hello.dll sources/JNIExemple.c

REM -- Exécuter la classe principale faisant appel à la Bibliothèque générée plus haut
echo Appel des fonctions de la bibliotheque hello.dll en Java
echo.

echo ----------------------------------------------------------------
java -Djava.library.path=libs --class-path classes com.exemple.jni.JNIExemple
echo ----------------------------------------------------------------

REM -- OK

echo.

pause

@echo on
/** 
 * Implémentation de com_exemple_jni_JNIExemple.h
 *
 * @author Jerome Dh
 * @see (https://www.linkedin.com/in/jerome-dh/)
 */
 
#include <jni.h>        // JNI header provided by JDK
#include <stdio.h>      // C Standard IO Header
#include "../headers/com_exemple_jni_JNIExemple.h"   // Entête générée
 
// Implementation de la fonction native sayHello()
JNIEXPORT void JNICALL Java_com_exemple_jni_JNIExemple_sayHello(JNIEnv *env, jobject thisObj) 
{
   printf("Bonjour a tous !!!\n\nExecuter depuis la bibliotheque du programme C \n\n");

   printf("Merci a JNI !\n");

   return;
}
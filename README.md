# JNI EXEMPLE

Comment exécuter du code natif pur (par exemple C/C++) en Java.

![Launch](https://github.com/jerome-Dh/jni-exemple/blob/master/resources/launch.png)

Il est parfois nécessaire d'utiliser des codes natifs comme C/C++ pour gérer les contraintes de gestion de la mémoire et de performances dans certains programmes. 

Cela est pris en charge via l'API JNI (Java Native Interface) pour le langage Java.

## Commencer

Cette exemple utilise l'API JNI de Java SE pour exécuter du code C/C++.

Le code C/C++ est lui même compilé et sauvé dans une bibliothèque externe (dll ou so), puis les différentes fonctions sont appelées puis exécutées à partir du programme Java.

Pour plus d'informations sur l'API JNI veuillez consulter la documentation sur le site officiel https://docs.oracle.com/javase/7/docs/technotes/guides/jni/index.html

### Conditions préalables

De quoi avons-nous besoin pour utiliser l'API JNI et comment les installer ?

> Suivez cette excellent guide (en anglais) (https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaNativeInterface.html#zz-5.4) qui vous donnera un meilleur aperçu de JNI et le nécéssaire pour l'exécuter. 

Nous montrerons ici un exemple d'application en suivant le même guide.

Mais avant de vous lancer dans cette exemple, rassurer vous d'avoir installé et configuré dans votre machine 
* [Java] (https://www.oracle.com/technetwork/java/javase/downloads/index.html) - La JDK complete
* [GCC] (https://www3.ntu.edu.sg/home/ehchua/programming/cpp/gcc_make.html) - La collection d'outils pour C/C++

`` Note:`` Si vous choisissez la version JDK x64 pour Java, vous devez aussi choisir la version x64 de GCC pour que l'exemple s'exécute correctement

`` Astuce:`` Tester les commandes suivantes en console pour être sûr que tout fonctionne.

Il faut au préalable avoir ajouté les chemins des exécutables (Java et GCC) dans [la variable path](https://www.java.com/fr/download/help/path.xml)

```
java -version
```
 Doit afficher la version de Java utilisée
 
et

```
GCC --version
```
Doit afficher la version GCC

### Installation

- Télécharger le projet sur Github (utiliser le bouton clone en haut à droite)
![download](https://github.com/jerome-Dh/jni-exemple/blob/master/resources/download.png)

- Dézippez le dossier téléchargé quelque part dans votre machine
![Structure](https://github.com/jerome-Dh/jni-exemple/blob/master/resources/structure.png)

## Lancer les tests

Le dossier dézippé contient un fichier batch nommé ``launch.cmd`` permettant d'automatiser la construction et l'exécution

Vous pourrez modifier cette configuration selon vos besoins.

Double-cliquez sur le fichier batch ``launch.cmd`` pour exécuter l'application. Le résultat ressemblera à l'image d'illustration situé à l'entête de cette page.

Vous pourvez modifier le code source Java ou C  pour voir les changements ensuite.


### Organisation des dossiers
 
 Les dossiers permettent de mieux séparer le code pour plus de flexibilité
 
- `` classes `` contient les fichiers de bytecodes générés par javac
- `` headers `` contient les fichiers d'entêtes C/C++ générés par javac
- `` java `` porte le code source java
- `` libs `` contient les bibliothèques dynamiques (dll ou so) générées par GCC
- `` resources `` utilisé pour mettre quelques images d'illustration
- `` sources `` pour les codes sources C/C++

`` Note: `` Cette organisation n'est pas obligatoire, il s'agit simplement d'une façon de mieux régrouper les différentes parties de l'application. Vous pouvez l'adapter selon votre convenance.

Le fichier `` launch.cmd `` est utile à la fois pour configurer, mais aussi pour exécuter l'application


## Construite avec

* [JNI] (https://docs.oracle.com/javase/7/docs/technotes/guides/jni/index.htm) - L'API JNI
* [Javac] (https://www.oracle.com/technetwork/java/javase/downloads/index.html) - La JDK complete
* [GCC] (https://www3.ntu.edu.sg/home/ehchua/programming/cpp/gcc_make.html) - Le compilateur pour C/C++


## Contribuants

### Auteurs

*** Travail initial : Jerome Dh
- [GitHub](https://github.com/jerome-Dh)
- [LinkedIn](https://www.linkedin.com/in/jerome-dh)

### Contributeurs
Merci de prendre part

## Licence

Ce projet est sous licence MIT - voir le fichier [MIT license](https://opensource.org/licenses/MIT).

## Remerciements

* A toute personne dont le code a été utilisé
* A tous les contributeurs


# JNI EXEMPLE

Comment exécuter du code natif pur (par exemple C/C++) en Java.

Il est parfois nécessaire d'utiliser des codes natifs comme C/C++ pour gérer les contraintes de gestion de la mémoire et de performances en Java. Cela est pris en charge via l'API JNI (Java Native Interface).

## Commencer

Cette exemple utilise l'API JNI de Java SE pour exécuter du code C/C++.
Le code C/C++ est lui même compilé et sauvé dans une bibliothèque externe (dll ou so).

Pour plus d'informations sur l'API JNI veuillez consulter la documentation sur le site officiel https://docs.oracle.com/javase/7/docs/technotes/guides/jni/index.html

### Conditions préalables

De quoi avons-nous besoin pour utiliser l'API JNI et comment les installer ?

Suivez cette excellent guide (en anglais) (https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaNativeInterface.html#zz-5.4) qui vous donnera un meilleur aperçu de JNI et le nécéssaire pour l'exécuter. 

Nous montrerons ici un exemple d'application en suivant ce guide.

Mais avant de vous lancer dans cette exemple, rassurer vous d'avoir installé et configuré dans votre machine 
* [Java] (https://www.oracle.com/technetwork/java/javase/downloads/index.html) - La JDK complete
* [GCC] (https://www3.ntu.edu.sg/home/ehchua/programming/cpp/gcc_make.html) - La collection d'outils pour C/C++

Si vous choisissez la version JDK x64 pour Java, vous devez aussi choisir la version x64 de GCC pour que l'exemple s'exécute correctement

[Astuce] Tester les commandes suivantes en console pour être sûr que tout fonctionne
Il faut au préalable avoir ajouté les chemins des exécutables (Java et GCC) dans la variable path
https://www.java.com/fr/download/help/path.xml

```
java --version ou  java -version: Doit afficher la version de Java utilisée
```

et

```
GCC --version: Doit afficher la version GCC
```

### Installation

Une série d'exemples pas à pas vous expliquant comment exécuter un environnement de développement en cours d'exécution.

Dites ce que le pas sera

`` `
Donner l'exemple
`` `

Et répétez

`` `
jusqu'à la fin
`` `

Terminez avec un exemple d'extraction de données du système ou d'utilisation pour une petite démonstration.

## Lancer les tests

Expliquer comment exécuter les tests automatisés pour ce système

### Décomposer en tests de bout en bout

Expliquez ce que ces tests testent et pourquoi

`` `
Donne un exemple
`` `

### Et tests de style de codage

Expliquez ce que ces tests testent et pourquoi

`` `
Donne un exemple
`` `

## Déploiement

Ajouter des notes supplémentaires sur la façon de déployer ceci sur un système actif

## Construit avec

* [Dropwizard] (http://www.dropwizard.io/1.0.2/docs/) - Le cadre Web utilisé
* [Maven] (https://maven.apache.org/) - Gestion des dépendances
* [ROME] (https://rometools.github.io/rome/) - Utilisé pour générer des flux RSS

## Contribuant

Veuillez consulter [CONTRIBUTING.md] (https://gist.github.com/PurpleBooth/b24679402957c63ec426) pour obtenir des détails sur notre code de conduite et sur le processus de soumission des demandes d'extraction.

## Versioning

Nous utilisons [SemVer] (http://semver.org/) pour la gestion des versions. Pour les versions disponibles, voir les [balises sur ce référentiel] (https://github.com/your/project/tags).

## Auteurs

* ** Billie Thompson ** - * Travail initial * - [PurpleBooth] (https://github.com/PurpleBooth)

Voir aussi la liste des [contributeurs] (https://github.com/votre/projet/contributeurs) ayant participé à ce projet.

## Licence

Ce projet est sous licence MIT - voir le fichier [LICENSE.md] (LICENSE.md) pour plus de détails.

## Remerciements

* Astuce de chapeau à toute personne dont le code a été utilisé
* Inspiration
* etc

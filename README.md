
# # Flicksters - 

** Flicksters ** montre les derniers films en cours de lecture sur les théâtres. L'application utilise l'API Movie Database pour afficher les images et les informations de base sur ces films à l'utilisateur.

Temps passé: **72** heures dépensées au total

## Histoires d'utilisateurs

La fonctionnalité ** requise ** est terminée:

* [X] L'utilisateur peut ** faire défiler les films en cours ** à partir de l'API de la Base de données de film
* [X] La mise en page est optimisée avec le modèle [ViewHolder] (http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView#improving-performance-with-the-viewholder-pattern).
* [X] Pour chaque film affiché, l'utilisateur peut voir les détails suivants:
  * [X] Titre, image de l'affiche, vue d'ensemble (mode Portrait)
  * [X] Titre, image de fond, vue d'ensemble (mode paysage)

Les fonctionnalités suivantes ** optionnelles ** sont implémentées:

* [] Affichez un bon défaut [graphique de l'espace réservé] (http://guides.codepath.com/android/Displaying-Images-with-the-Picasso-Library#configuring-picasso) pour chaque image pendant le chargement.

Les fonctionnalités ** bonus ** suivantes sont mises en œuvre:

* [] Permet à l'utilisateur d'afficher les détails du film, y compris les notes et la popularité dans une activité ou un fragment de dialogue distinct.
* [] Lors de la visualisation d'un film populaire (c'est-à-dire qu'un film a voté pour plus de 5 étoiles), la vidéo devrait montrer l'image complète de la toile de fond comme la mise en page. Utilise [ListViews hétérogènes] (http://guides.codepath.com/android/Implementing-a-Heterogenous-ListView) ou [Heterogenous RecyclerView] (http://guides.codepath.com/android/Heterogenous-Layouts-inside- RecyclerView) pour afficher différentes mises en page.
* [] Autoriser les disques vidéo à être reproduits en plein écran en utilisant YouTubePlayerView.
    * [] Survolez une icône de lecture pour les vidéos qui peuvent être lues.
    * [] Les films les plus populaires devraient commencer une activité distincte qui joue la vidéo immédiatement.
    * [] Les vidéos moins populaires comptent sur la page de détail doivent afficher les notes et un aperçu de YouTube.
* [] Appliquer la populaire [bibliothèque d'annotations Butterknife] (http://guides.codepath.com/android/Reducing-View-Boilerplate-with-Butterknife) pour réduire le code de l'étiquette.
* [] Appliquer des coins arrondis pour l'affiche ou les images d'arrière-plan en utilisant [Transformations Picasso] (https://guides.codepath.com/android/Displaying-Images-with-the-Picasso-Library#other-transformations)
* [] Remplace le client de réseau Android-async-http par les bibliothèques de réseau [OkHttp] (http://guides.codepath.com/android/Using-OkHttp) populaires.

Les fonctionnalités ** supplémentaires ** suivantes sont implémentées:

* [] Liste tout ce que vous pouvez faire pour améliorer la fonctionnalité de l'application!

## Video Walkthrough

Voici une description détaillée des histoires d'utilisateurs implémentées:

<Img src = 'http: //i.imgur.com/link/to/your/gif/file.gif' title = 'Video Walkthrough' width = '' alt = 'Video Walkthrough' />

GIF créé avec [LiceCap] (http://www.cockos.com/licecap/).

## Remarques

Décrivez les défis rencontrés lors de la création de l'application.

## Bibliothèques open-source utilisées

- [Android Async HTTP] (https://github.com/loopj/android-async-http) - Requêtes HTTP asynchrones simples avec analyse JSON
- [Picasso] (http://square.github.io/picasso/) - Bibliothèque de chargement et de mise en cache d'images pour Android

## Licence

    Copyright [aaaa] [nom du titulaire du droit d'auteur]

    Licence sous Licence Apache, Version 2.0 (la "Licence");
    Vous ne pouvez pas utiliser ce fichier, sauf en conformité avec la licence.
    Vous pouvez obtenir une copie de la licence au

        Http://www.apache.org/licenses/LICENSE-2.0

    À moins d'être exigé par la loi applicable ou accepté par écrit, le logiciel
    Distribué sous la licence est distribué sur une base "TEL QUEL"
    SANS GARANTIE OU CONDITION DE QUELQUE NATURE QUE CE SOIT, express ou implicite.
    Voir la licence pour la langue spécifique qui régit les autorisations et
    Limitations de la licence.

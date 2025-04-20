Mini Projet - Injection des Dépendances (Spring-like)
Calculateur prix produits
Description du projet :
Ce projet illustre l'injection des dépendances dans une application Java en utilisant un modèle similaire à Spring IOC. L'objectif est de démontrer comment injecter dynamiquement les dépendances (DAO, Service, Controller) dans un projet à l'aide de deux mécanismes :

Par fichier de configuration XML (optionnel dans certaines versions).

Par annotations Java et réflexion à travers un fichier de configuration config.txt.

L'application gère un catalogue de produits où chaque produit possède un identifiant, un nom, et un prix hors taxe (HT). Un service permet de calculer le prix TTC (Toutes Taxes Comprises) pour chaque produit. Le contrôle et l'affichage des informations sont effectués par un contrôleur.

Structure du projet :
Le projet est structuré en différentes couches, comme suit :

DAO (Data Access Object) :

  Interface : IProduitDAO définit les méthodes d'accès aux attributs d'un produit (getId(), getNom(), getPrixHT()).

  Implémentation : ProduitDaoImpl implémente cette interface, définissant les attributs et les méthodes de chaque produit.

  IProduitListDAO et ProduitListDAOImpl gèrent la liste des produits et les opérations de récupération de produits (par ID ou liste complète).

Métier (Service) :

  Interface : IProduitService définit les méthodes de calcul, comme recupererTousLesProduits() et calculerPrixTTC().

  Implémentation : ProduitServiceImpl implémente ces méthodes pour gérer les produits.

Présentation (Contrôleur) :

  Interface : IProduitController définit les actions de présentation (affichage des produits, calcul des prix).

  Implémentation : ProduitControllerImpl contient les méthodes pour afficher les produits et les prix TTC.

Configuration :

  Fichier config.txt : Ce fichier contient la configuration des classes à utiliser pour le contrôleur, le service, et le DAO. Il permet de spécifier les classes à utiliser pour l'injection des dépendances.
Fonctionnalités principales :
  Injection des Dépendances :

    Le projet utilise la réflexion Java pour charger dynamiquement les classes spécifiées dans le fichier de configuration config.txt.

    Les dépendances entre le DAO, le service et le contrôleur sont injectées automatiquement via leurs constructeurs respectifs.

  Lecture du fichier de configuration :

    Le fichier config.txt est utilisé pour spécifier quelle classe doit être utilisée pour le contrôleur, le service et le DAO.

    En fonction de ce fichier, le programme charge les classes dynamiquement et crée les objets nécessaires.

  Gestion des Produits :

    Le DAO contient une liste statique de produits (produits de type ProduitDaoImpl avec un identifiant, un nom et un prix hors taxe).

    Le service permet de récupérer cette liste et de calculer les prix TTC des produits.

  Affichage :

    Le contrôleur affiche la liste des produits et le prix TTC d'un produit donné.

  Utilisation du projet :
    Fichier de configuration (config.txt) :

    Vous devez créer un fichier config.txt à la racine de votre projet avec la structure suivante pour spécifier les classes à utiliser
  Exécution du programme :

    Lancer la classe pres2 pour voir l'injection des dépendances en action. Le programme lira le fichier config.txt, chargera dynamiquement les classes, puis effectuera les actions de l'application (affichage des produits et calcul du prix TTC).

  Affichage des produits et prix TTC :

    La méthode afficherProduits() du contrôleur sera exécutée pour afficher les informations sur les produits.

    La méthode afficherPrixTTC() sera exécutée pour afficher le prix TTC d'un produit particulier (par exemple, produit avec ID 1).

  Dépendances utilisées :
    Java 21 : Le projet est développé avec Java 21.

    Réflexion Java : Utilisation de la réflexion pour instancier dynamiquement les classes et injecter les dépendances.
Conclusion :
Ce projet offre une démonstration de l'injection des dépendances dans une application Java avec un modèle similaire à celui de Spring IOC. Il montre comment gérer l'injection des dépendances via un fichier de configuration et un mécanisme de réflexion, en séparant clairement les couches DAO, Service et Présentation.

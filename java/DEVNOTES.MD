Temps passé : environ 2h.

Postulat :
Le joueur devant choisir une façon de calculer son score, on doit garder l'ensemble des méthodes, même si certaines auraient pu être complêtement supprimées.
Exemple : une méthode pour Ones, Twos, Threes, Fours, Fives, Sixes

Méthodologie utilisée :
Analyse des spécifications fonctionnelles
Analyse du code existant
Séparation en différentes taches à réaliser suivant ce qui peut être mis en commun.
Ajout de la classe Dices pour séparer le coté "technique" du coté fonctionnel, réduire le nombre de variables passées en paramètre et éviter les variables globales dans la classe Yatzy.
Ecriture des tests en séparant l'initialisation des tests (choix des dés) et les asserts liés. 
Modification des classes en prenant en compte les besoins similaires pour différentes méthodes.

Commentaires :
J'ai peut être trop recréé certaines méthodes plutôt que d'avoir vraiment refactor, mais je pense que c'était nécessaire à une meilleure qualité de code.
Les TU sont améliorables : 
	Par manque de temps, je n'ai créé de classe de tests pour la classe Dices. Mais les méthodes y étant présentes sont couvertes par les TU de la classe de tests Yatzy.
	Je pense que j'aurais pu être plus complêt dans les différents cas testés. Il aurait fallu que je refasse une passe sur les TU post-développements.
Au niveau de la classe Dices : les méthodes occurenceForXTimesStrictlyEqual, highiestOccurenceForXTimes et lowestOccurenceForXTimes auraient probablement pu être au moins en partie mises en commun. 
	Potentiellement en ajoutant un paramètre déterminant l'opérateur de comparaison.
Je n'ai pas réalisé de commits intermédiaires pour ne pas perdre de temps de part l'exigence de vitesse sur l'exercice.
Créer un package fr.eni.quelPokemon.bo
2. A l’intérieur de ce package, créer une classe Pokemon, une classe Attaque
et une classe Dresseur.
3. Une Attaque est caractérisée par un nom et un nombre de dégâts. Par
exemple, l’attaque « éclair » inflige « 22 points de dégâts ».
◦ Écrire les attributs, et la (ou les) associations unidirectionnelles.
◦ Écrire le constructeur permettant d’instancier un Attaque grâce à un
nom et un nombre de dégâts.
◦ Écrire les getters/setters de cette classe.
◦ Écrire une méthode afficher() permettant d’afficher les informations
d’une Attaque.
4. Un Dresseur est caractérisé par un prénom et une collection de Pokemon.
Le Dresseur sait quels sont ces Pokemon. Et chaque Pokemon connaît son
Dresseur.
◦ Écrire les attributs de la classe Dresseur et la (ou les) associations
bidirectionnelles.◦ Écrire le constructeur permettant de créer un dresseur a partir de son
prénom.
◦ Écrire les getters/setters de cette classe.
◦ Écrire une méthode afficher() permettant d’afficher les informations d’un
Dresseur.
5. Un Pokemon est caractérisé par son nom, sa taille, son poids et un nombre
de points de vie. Il possède aussi 2 Attaques différentes et un Dresseur.
◦ Écrire les attributs et la(ou les) associations bidirectionnelles et la (ou les)
associations unidirectionnelles.
◦ Écrire un constructeur permettant de créer un Pokemon a partir de son
nom, sa taille, son poids, ses points de vie, son attaque01 et son
attaque02.
◦ Écrire les getters/setters de tous les attributs.
◦ Écrire une méthode afficher() permettant d’afficher les informations d’un
Pokemon.Déroulé de l’histoire principale
1. Créer un package fr.eni.quelPokemon.main
2. Créer une classe Main à l’intérieur de ce package.
3. Créer une méthode main() à l’intérieur de la classe Main.
4. Tu es Sacha, du Bourg Palette et tu croises Ondine.
◦ Créer un instance de Dresseur représentant Sacha et une autre représentant
Ondine.
5. Après plusieurs heures de marches, vous croisez un pikachu. Il fait 0,4 mètres, un
poids de 6kg, et il a 120 points de vie. Sa première attaque est « statik » qui fait 20
points de dégâts et la deuxième est « paratonnerre » qui fait 75 points de dégâts.
◦ Créer une instance pour chaque attaque.
◦ Créer une instance de pikachu.
6. sacha (donc toi), le plus grand dresseur de Pokemon de tout les temps, capture
pikachu.
◦ Ajouter pikachu à la collection de Pokemon de sacha en créant une nouvelle
méthode capture() dans la classe Dresseur. Celle ci prend en paramètre le
Pokemon capturé.
◦ Vérifier, en utilisant la méthode afficher() de l’instance pikachu, que sacha est
bien devenu le dresseur de pikachu.
◦ Vérifier, en utilisant la méthode afficher() de sacha, que pikachu est bien dans
la collection de Pokemon de Sacha.Bonus
1. Ajouter rattata (0,3 m, 3,5 kg, 90 points de vie) comme Pokemon capturé par
Ondine. Sa première attaque est « cran » et inflige 10 points de dégâts. Sa
deuxième attaque est « agitation » et inflige 35 points de dégâts.
2. Ajouter une méthode attaque() dans la classe Pokemon qui prend en paramètre
un Pokemon et qui permet de lancer la première attaque d’un Pokemon sur un
autre.
3. Organiser un combat de Pokemon entre le pikachu de Sacha et le rattata de
Ondine. Un combat consiste a alterner des attaques à tour de rôle jusqu’à ce
qu’un des Pokemon ai un nombre de points de vie inférieur à zéro. Celui ci est
déclaré KO et le second Pokemon est déclaré vainqueur si son nombre de points
de vie est supérieur à zéro.
4. Modifier la méthode combat() de la classe Pokemon. Chaque Pokemon a 10 % de
chances de lancer sa deuxième attaque à la place de la première.Si un Pokemon
a moins de 25 % de points de vie restants, cette probabilité passe a 50 %.
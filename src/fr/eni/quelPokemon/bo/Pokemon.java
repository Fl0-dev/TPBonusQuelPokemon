package fr.eni.quelPokemon.bo;

/**
 * Création d'une classe Pokemon
 * associée à la classe Dresseur
 * ainsi qu'à la classe Attaque
 */
public class Pokemon {

    private Attaque attaque01;
    private Attaque attaque02;
    private static Dresseur dresseur;
    private String nom;
    private int taille;
    private int poids;
    private int pv;

    ////////////Constructeurs////////////////////////////

    /**
     * Constructeur de la classe Pokemon
     * @param attaque01
     * @param attaque02
     * @param nom
     * @param taille
     * @param poids
     * @param pv
     */
    public Pokemon(Attaque attaque01, Attaque attaque02, String nom, int taille, int poids, int pv) {
        this.attaque01 = attaque01;
        this.attaque02 = attaque02;
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
        this.pv = pv;
        dresseur = getDresseur();
    }


    ////////////Getters Setters////////////////////////////


    public Attaque getAttaque01() {
        return attaque01;
    }

    public void setAttaque01(Attaque attaque01) {
        this.attaque01 = attaque01;
    }

    public Attaque getAttaque02() {
        return attaque02;
    }

    public void setAttaque02(Attaque attaque02) {
        this.attaque02 = attaque02;
    }

    public static Dresseur getDresseur() {
        return dresseur;
    }

    public static void setDresseur(Dresseur dresseur) {
        Pokemon.dresseur = dresseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    ////////////Méthodes////////////////////////////

    /**
     * Permet l'affichage des caractéristiques d'un pokemon
     */
    public void afficher() {
        System.out.printf("%s PV : %d%n", this.nom, this.pv);
        this.attaque01.afficher();
        this.attaque02.afficher();
        System.out.printf("%s%n", dresseur.getNom());
        System.out.printf("Taille : %d cm, poids : %d kg%n", (this.taille) * 100, this.poids);
    }

    /**
     * méthode attaque qui permet à pokemeon d'en attaquer un autre
     * l'attaque dépendant d'un poucentage selon les pv restants
     * et affiche ces derniers
     * @param pokemonCible
     */
    public void attaque(Pokemon pokemonCible) {
        System.out.printf("%s attaque %s%n", this.nom, pokemonCible.nom);
        System.out.printf("%s lance ",this.nom);
        double nb = Math.random() * 100;
        if ((this.pv < (this.pv)*0.25 & nb<50)| nb < 10) {
            attaque02.afficher();
            pokemonCible.pv = pokemonCible.pv - attaque02.getNbreDedegats();
        }
        else{
            attaque01.afficher();
            pokemonCible.pv = pokemonCible.pv - attaque01.getNbreDedegats();
        }
        System.out.printf("Il reste %d pv à %s%n", pokemonCible.pv, pokemonCible.nom);
    }
}

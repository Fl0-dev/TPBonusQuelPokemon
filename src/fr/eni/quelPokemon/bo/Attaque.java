package fr.eni.quelPokemon.bo;

/**
 * Cion d'une classe Attaque
 */
public class Attaque {
    private String nom;
    private int nbreDedegats;

    ////////////Constructeurs////////////////////////////

    /**
     * Constructeur de la classe Attaque
     * @param nom
     * @param nbreDedegats
     */
    public Attaque(String nom, int nbreDedegats) {
        this.nom = nom;
        this.nbreDedegats = nbreDedegats;
    }

    ////////////Getters Setters////////////////////////////
    public String getNom() {
        return nom;
    }

    public int getNbreDedegats() {
        return nbreDedegats;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbreDedegats(int nbreDedegats) {
        this.nbreDedegats = nbreDedegats;
    }

    ////////////Méthodes////////////////////////////

    /**
     * Permet l'affichage de l'attaque
     */
    public void afficher(){
        System.out.printf("%s %d%n",this.nom,this.nbreDedegats);
    }

}

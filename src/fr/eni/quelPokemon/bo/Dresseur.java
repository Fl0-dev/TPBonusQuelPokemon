package fr.eni.quelPokemon.bo;

/**
 * Création d'une classe Dresseur
 * associéé à la classe Pokemon
 */
public class Dresseur {
    private String nom;
    private Pokemon[] pokemons = new Pokemon[6];

    ////////////Constructeurs////////////////////////////

    /**
     * Constructeur de la classe Dresseur
     * @param nom
     */
    public Dresseur(String nom) {
        this.nom = nom;
    }

    ////////////Getters Setters////////////////////////////
    public String getNom() {
        return nom;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
    ////////////Méthodes////////////////////////////

    /**
     * Permet l'affichage du nom du dresseur
     * ainsi que le nom de ses pokemons
     */
    public void afficher(){
        System.out.printf("Dresseur : %s%n",this.nom);
        for (Pokemon pokemon : this.pokemons) {
            if (pokemon != null){
                System.out.printf("%s%n",pokemon.getNom());
                break;
            }
        }
    }

    /**
     * méthode qui perme à un dresseur de capturer un pokemon
     * d'ajouter à sa collection
     * @param pokemonAajouter
     */
    public void capture(Pokemon pokemonAajouter){
        Pokemon.setDresseur(this);
        for (int i = 0; i <this.pokemons.length ; i++) {
            if (this.pokemons[i]==null){
                this.pokemons[i] = pokemonAajouter;
                break;
            }
        }
    }
}

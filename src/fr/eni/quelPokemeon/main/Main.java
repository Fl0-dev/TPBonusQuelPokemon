package fr.eni.quelPokemeon.main;

import fr.eni.quelPokemon.bo.Attaque;
import fr.eni.quelPokemon.bo.Dresseur;
import fr.eni.quelPokemon.bo.Pokemon;

/**
 * TP bonus pour appréhender les notions d'association en Java
 * création de 2 dresseurs avec chacun un pokemon chacun qui ont 2 attaques différentes
 * les dresseurs s'affrontent pour savoir qui sera le meilleur dresseur
 * @author Florian Girard
 * @date 16 mai 2021
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Dresseur sacha = new Dresseur("Sacha");
        Dresseur ondine = new Dresseur("Ondine");

        Attaque statik = new Attaque("statik",20);
        Attaque paratonnerre = new Attaque("paratonnerre",75);
        Pokemon pikachu = new Pokemon(statik,paratonnerre,"Pikachu",(int)0.4,6,120);
        sacha.capture(pikachu);
        Attaque cran = new Attaque("cran",10);
        Attaque agitation = new Attaque("agitation",35);
        Pokemon rattata = new Pokemon(cran,agitation,"Rattata",(int)0.3, (int) 3.5, 90);
        ondine.capture(rattata);

        System.out.printf("%s et %s combatent%n",sacha.getNom(),ondine.getNom());
        do{

            pikachu.attaque(rattata);
            if(rattata.getPv()>0)
                rattata.attaque(pikachu);
        }while (pikachu.getPv()>0 & rattata.getPv()>0);

        if ((pikachu.getPv() > 0) & (rattata.getPv() < 0))
            System.out.printf("%s et %s ont gagné!", sacha.getNom(), pikachu.getNom());
        else
            System.out.printf("%s et %s ont gagné!", ondine.getNom(), rattata.getNom());

    }
}

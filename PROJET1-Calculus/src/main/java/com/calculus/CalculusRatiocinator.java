package com.calculus;

public class CalculusRatiocinator {
    Affirmation affirmation =  new Affirmation();
    Conjonction conjonction = new Conjonction();


    /* Fonction qui calcule deux affirmations à travers une seule conjonction */

    public String calculusAvecDeuxAffirmations(String Affirmation1, String Conjonction, String Affirmation2) {



        /* Logique des deux affirmations relié par la conjonction 'et' */

        if (Affirmation1 == affirmation.vérité && Conjonction == conjonction.et && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else
        if ((Affirmation1 == affirmation.vérité && Conjonction == conjonction.et && Affirmation2 == affirmation.mensonge)
                ||
            (Affirmation1 == affirmation.mensonge && Conjonction == conjonction.et && Affirmation2 == affirmation.vérité)) {
            return "Fausse";
        } else
        if (Affirmation1 == affirmation.mensonge && Conjonction == conjonction.et && Affirmation2 == affirmation.mensonge) {
            return "Fausse";
        }



        /* Logique des deux affirmations relié par la conjonction 'ou' */

        else
        if (Affirmation1 == affirmation.vérité && Conjonction == conjonction.ou && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else
        if ((Affirmation1 == affirmation.vérité && Conjonction == conjonction.ou && Affirmation2 == affirmation.mensonge)
                ||
            Affirmation1 == affirmation.mensonge && Conjonction == conjonction.ou && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else
        if (Affirmation1 == affirmation.mensonge && Conjonction == conjonction.ou && Affirmation2 == affirmation.mensonge) {
            return "Fausse";
        }



        /* Logique des deux affirmations relié par la conjonction 'Donc' */

        else
        if (Affirmation1 == affirmation.vérité && Conjonction == conjonction.donc && Affirmation2 == affirmation.mensonge) {
            return "Fausse";
        } else
        if (Affirmation1 == affirmation.mensonge && Conjonction == conjonction.donc && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else
        if (Affirmation1 == affirmation.vérité && Conjonction == conjonction.donc && Affirmation2 == affirmation.vérité) {
            return "Vraie";
        } else
        if (Affirmation1 == affirmation.mensonge && Conjonction == conjonction.donc && Affirmation2 == affirmation.mensonge) {
            return "Vraie";
        } else return "jenesaispas";
    }



    /*
    * Fonction qui calcule trois affirmations avec une conjonction qui relie les deux premières affirmations et
    * se termine par une affirmation précédé d'un donc */

    public String calculusAvecTroisAffirmations(String Affirmation1, String Conjonction1, String Affirmation2,
                                                String Conjonction2, String Affirmation3) {



        if (calculusAvecDeuxAffirmations(Affirmation1, Conjonction1, Affirmation2) == "Vraie"
            || Conjonction2 == conjonction.donc && Affirmation3 == affirmation.vérité) {
            return "Vraie";
        } else
        if (calculusAvecDeuxAffirmations(Affirmation1, Conjonction1, Affirmation2) == "Vraie"
            || Conjonction2 == conjonction.donc && Affirmation3 == affirmation.mensonge) {
            return "Fausse";
        } else
        if ((calculusAvecDeuxAffirmations(Affirmation1, Conjonction1, Affirmation2) == "Fausse"
            || Conjonction2 == conjonction.donc && Affirmation3 == affirmation.mensonge)) {
            return "Vraie";
        } else return "jenesaispas";
    }



    /* Calculus avec deux affirmations non connecté */

    public String calculusAvecDeuxAffirmationsNonConnecté (String Affirmation1, String Conjonction1, String Affirmation2,
                                                           String Conjonction2, String Affirmation3,String Affirmation4,
                                                           String Conjonction3, String Affirmation5) {
        String réponse1 = calculusAvecTroisAffirmations(Affirmation1, Conjonction1, Affirmation2, Conjonction2, Affirmation3);
        String réponse2 = calculusAvecDeuxAffirmations(Affirmation4, Conjonction3, Affirmation5);

        return réponse1 + " et " + réponse2;
    }
}

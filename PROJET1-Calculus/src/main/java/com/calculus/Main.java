package com.calculus;

public class Main {
    public static void main(String[] args) {

        CalculusRatiocinator calculusRatiocinator = new CalculusRatiocinator();

        /* Voici la liste des affirmations selon les demandes du sujet */

        String réponse1 = calculusRatiocinator.calculusAvecDeuxAffirmations("Lou est pauvre.", "et", "Lou est généreux.");
        String réponse2 = calculusRatiocinator.calculusAvecDeuxAffirmations("Lou est beau.", "Donc", "Lou est pauvre.");
        String réponse3 = calculusRatiocinator.calculusAvecDeuxAffirmations("Lou est pauvre.", "et", "Lou est généreux.");
        String réponse4 = calculusRatiocinator.calculusAvecTroisAffirmations("Lou est beau.", "ou", "Lou est généreux.", "Donc", "Lou est pauvre.");
        String réponse5 = calculusRatiocinator.calculusAvecDeuxAffirmationsNonConnecté("Lou est beau.", "ou", "Lou est généreux.", "Donc",
                "Lou est pauvre.", "Lou est pauvre.","ou", "Lou est généreux.");


        System.out.println(réponse1);
    }
}
package com.calculus;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculusRatiocinatorTest {

    @Test
    public void testCalculusAvecDeuxAffirmations_jenesaispas() {
        CalculusRatiocinator calculusRatiocinator = new CalculusRatiocinator();
        String réponse = calculusRatiocinator.calculusAvecDeuxAffirmations("Lou est pauvre.", "et", "Lou est généreux.");
        assertEquals("jenesaispas", réponse);
    }

    @Test
    public void testCalculusAvecDeuxAffirmations_Fausse() {
        CalculusRatiocinator calculusRatiocinator = new CalculusRatiocinator();
        String réponse = calculusRatiocinator.calculusAvecDeuxAffirmations("Lou est beau.", "Donc", "Lou est pauvre.");
        assertEquals("Fausse", réponse);
    }

    @Test
    public void testCalculusAvecTroisAffirmations_Fausse() {
        CalculusRatiocinator calculusRatiocinator = new CalculusRatiocinator();
        String réponse = calculusRatiocinator.calculusAvecTroisAffirmations("Lou est beau.", "ou", "Lou est généreux.", "Donc", "Lou est pauvre.");
        assertEquals("Fausse", réponse);
    }

    @Test
    public void testCalculusAvecDeuxAffirmationsNonConnecté_Fausse_et_jenesaispas() {
        CalculusRatiocinator calculusRatiocinator = new CalculusRatiocinator();
        String réponse = calculusRatiocinator.calculusAvecDeuxAffirmationsNonConnecté(
                "Lou est beau.", "ou", "Lou est généreux.", "Donc", "Lou est pauvre.",
                "Lou est pauvre.", "ou", "Lou est généreux."
        );
        assertEquals("Fausse et jenesaispas", réponse);
    }
}

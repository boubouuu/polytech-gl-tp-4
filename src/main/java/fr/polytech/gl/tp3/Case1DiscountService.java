package fr.polytech.gl.tp3;

/*
 * Case 1 : gestion de remise.
 * Tâches :
 * - Corriger l'issue de duplication de littéraux dans existingDiscountLabel().
 * - Implémenter calculateDiscountedPrice(amount, rate) :
 *      - amount >= 0, rate entre 0 et 1.
 *      - retourne le prix après remise.
 * - Écrire au moins un test unitaire pour calculateDiscountedPrice.
 */
public class Case1DiscountService {

    // ISSUE : duplication de littéraux ("DISCOUNT")
    public String existingDiscountLabel(String code) {
        if (code == null) {
            return "DISCOUNT"; // littéral dupliqué
        }
        if (code.isBlank()) {
            return "DISCOUNT"; // littéral dupliqué
        }
        return "DISCOUNT-" + code; // même base
    }

    // FEATURE : à implémenter
    public double calculateDiscountedPrice(double amount, double rate) {
        // - si amount < 0 ou rate < 0 ou rate > 1 -> IllegalArgumentException
        // - sinon, retourner amount * (1 - rate)
        if (amount <0 || rate <0 || rate>1){
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }
        else{
            return amount * (1- rate);
        }
    }
}

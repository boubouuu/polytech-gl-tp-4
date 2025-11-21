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
    public String existingDiscountLabel(String code) {
        if (code == null || code.isBlank()) {
            return "DISCOUNT";
        }
        return "DISCOUNT-" + code; // même base
    }


    public double calculateDiscountedPrice(double amount, double rate) {
      if (rate < 0 || rate > 1) {
        throw new IllegalArgumentException("Rate value must be between 0 and 1");
      }

      if (amount < 0) {
        throw new IllegalArgumentException("Amount value must be superior at 0");
      }
      return amount * (1 - rate);
    }
}

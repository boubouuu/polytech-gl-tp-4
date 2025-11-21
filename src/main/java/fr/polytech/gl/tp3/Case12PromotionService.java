package fr.polytech.gl.tp3;

/*
 * Case 12 : promotions.
 * Tâches :
 * - Corriger la complexité inutile de existingIsPromoDay().
 * - Implémenter applyPromo(amount, promoCode) :
 *      - si promoCode = "FREE" et amount >= 100 -> tout gratuit (0)
 *      - si promoCode = "HALF" -> moitié prix
 *      - sinon, pas de remise
 * - Écrire au moins un test unitaire pour applyPromo.
 */
public class Case12PromotionService {

    public boolean existingIsPromoDay(String day) {
        if ("WEDNESDAY".equals(day)) {
            return true;
        } else {
            return false;
        }
    }

    // FEATURE : à implémenter
    public double applyPromo(double amount, String promoCode) {
        // TODO: implémenter selon la description
        if ("FREE".equals(promoCode) && amount>=100) {
          amount=0;
        }
        if ("HALF".equals(promoCode)) {
          amount=amount*0.5;
        }
        return amount; // valeur par défaut
    }
}

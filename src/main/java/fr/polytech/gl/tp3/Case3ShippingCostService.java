package fr.polytech.gl.tp3;

/*
 * Case 3 : coût de livraison.
 * Tâches :
 * - Corriger l'usage de magic numbers dans existingBaseCost().
 * - Implémenter computeShippingCost(weightKg, express) :
 *      - weightKg <= 0 -> IllegalArgumentException
 *      - base : 5€ + 1€ par kilo entamé
 *      - si express = true : supplément de 10€
 * - Écrire au moins un test unitaire pour computeShippingCost.
 */
public class Case3ShippingCostService {
    public double existingBaseCost() {
        return 5.0 + 1.0 * 3;
    }

    // FEATURE : à implémenter
    public double computeShippingCost(double weightKg, boolean express) {
      if (weightKg <= 0) {
        throw new IllegalArgumentException("Weight cannot be lower or equal to 0 ");
      }

      return 5 + weightKg + (express ? 10 : 0);
    }
}

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

    // ISSUE : magic numbers non documentés
    public double existingBaseCost() {
        return 5.0 + 1.0 * 3.0; // 3 kg "magique"
    }

    // FEATURE : à implémenter
    public double computeShippingCost(double weightKg, boolean express) {

        if (weightKg <= 0) {
            throw new IllegalArgumentException("Le poids doit être supérieur à 0 kg.");
        }

        double base = 5.0 + Math.ceil(weightKg); // Math.ceil(value) permet d'arrondir la valeur à l'unité supérieur
        if (express) base = base + 10.0;

        return base;
    }
}

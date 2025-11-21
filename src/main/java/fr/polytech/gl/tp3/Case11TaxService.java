package fr.polytech.gl.tp3;

/*
 * Case 11 : calcul de TVA.
 * Tâches :
 * - Corriger l'issue de paramètre inutile dans existingVatLabel().
 * - Implémenter computeVat(amount, rate) :
 *      - amount >= 0, rate >= 0
 *      - retourne le montant de TVA
 * - Écrire au moins un test unitaire sur computeVat.
 */
public class Case11TaxService {
  double tva = 0;

  // FEATURE : à implémenter
  public double computeVat(double amount, double rate) {
    if (amount < 0 || rate < 0)
    {
      return -1;
    }
    else
    {
      tva = amount * rate;
      return tva;
    }
    // TODO: implémenter en gérant les entrées invalides
  }
}

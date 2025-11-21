package fr.polytech.gl.tp3;

public class Case11TaxService {
  public double computeVat(double amount, double rate) {
    if (amount < 0 || rate < 0)
      throw new IllegalArgumentException("Un prix ou taux négatif n’a absolument aucun début de commencement de sens");

    return amount * rate;
  }
}

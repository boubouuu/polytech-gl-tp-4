package fr.polytech.gl.tp3;

/*
 * Case 4 : formatage de facture.
 * Tâches :
 * - Corriger la concaténation inefficace dans existingFormat().
 * - Implémenter formatInvoiceNumber(prefix, id) :
 *      - prefix non null/non blanc, id > 0
 *      - format : PREFIX-000ID (id sur 3 chiffres minimum, ex: 7 -> 007)
 * - Écrire au moins un test pour formatInvoiceNumber.
 */
public class Case4InvoiceFormatterService {
    public String existingFormat(String[] lines) {
        return String.join("\n", lines);
    }

    public String formatInvoiceNumber(String prefix, int id) {
        // TODO: implémenter selon la description
      if (prefix.isBlank() || prefix.isEmpty()) {
        throw new IllegalArgumentException("Prefix cannot be null");
      }

      if (id <= 0) {
        throw new IllegalArgumentException("Id cannot be inferior or equal to 0");
      }

      return String.format("%s-%03dID", prefix, id);
    }
}

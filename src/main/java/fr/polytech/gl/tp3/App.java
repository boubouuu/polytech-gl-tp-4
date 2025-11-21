package fr.polytech.gl.tp3;

/*
 * Point d'entrée du TD.
 * <p>
 * Ce main ne sert qu'à illustrer l'utilisation des 15 services.
 * Les valeurs affichées sont volontairement simplistes et peuvent être fausses
 * tant que les méthodes ne sont pas correctement implémentées : c'est le travail
 * des étudiant·es.
 */
public class App {

  public static void main(String[] args) {
    System.out.println("TD Collaboration CI/CD — 15 cases");
    System.out.println("--------------------------------------------------");

    // Case 1
    Case1DiscountService c1 = new Case1DiscountService();
    System.out.println("[Case1DiscountService] label = "
      + c1.existingDiscountLabel("WELCOME")
      + " | discounted(100, 0.1) = "
      + c1.calculateDiscountedPrice(100.0, 0.1));

    // Case 2
    Case2LoyaltyPointsService c2 = new Case2LoyaltyPointsService();
    System.out.println("[Case2LoyaltyPointsService] levelName(150) = "
      + c2.existingLevelName(150)
      + " | earnedPoints(80) = "
      + c2.computeEarnedPoints(80.0));

    // Case 3
    Case3ShippingCostService c3 = new Case3ShippingCostService();
    System.out.println("[Case3ShippingCostService] baseCost() = "
      + c3.existingBaseCost()
      + " | computeShippingCost(3kg, express=true) = "
      + c3.computeShippingCost(3.0, true));

    // Case 4
    Case4InvoiceFormatterService c4 = new Case4InvoiceFormatterService();
    String[] lines = {"L1", "L2"};
    System.out.println("[Case4InvoiceFormatterService] existingFormat = "
      + c4.existingFormat(lines).replace("\n", "\\n")
      + " | formatInvoiceNumber(\"INV\", 7) = "
      + c4.formatInvoiceNumber("INV", 7));

    // Case 5
    Case5TemperatureConverterService c5 = new Case5TemperatureConverterService();
    System.out.println("[Case5TemperatureConverterService] existingToCelsius(32) = "
      + c5.existingToCelsius(32.0)
      + " | toFahrenheit(0) = "
      + c5.toFahrenheit(0.0));

    // Case 6
    Case6StringUtilsService c6 = new Case6StringUtilsService();
    System.out.println("[Case6StringUtilsService] safeTrim(\"  hi  \") = '"
      + c6.safeTrim("  hi  ") + "'"
      + " | isPalindrome(\"Kayak\") = "
      + c6.isPalindrome("Kayak"));

    // Case 7
    Case7StatisticsService c7 = new Case7StatisticsService();
    int[] values = {1, 2, 3};
    System.out.println("[Case7StatisticsService] existingAverage({1,2,3}) = "
      + c7.existingAverage(values)
      + " | median({1,2,3}) = "
      + c7.median(values));

    // Case 8
    Case8PasswordStrengthService c8 = new Case8PasswordStrengthService();
    System.out.println("[Case8PasswordStrengthService] existingIsDefaultPassword(\"password\") = "
      + c8.existingIsDefaultPassword("password")
      + " | score(\"Abc12345\") = "
      + c8.score("Abc12345"));

    // Case 9
    Case9InventoryService c9 = new Case9InventoryService();
    c9.addStock("item-1", 5);
    System.out.println("[Case9InventoryService] stock item-1 = "
      + c9.getItems().get("item-1"));

    // Case 10
    Case10BookingService c10 = new Case10BookingService();
    int[][] slots = {{10, 12}};
    System.out.println("[Case10BookingService] canBook([[10,12]], 13, 15) = "
      + c10.canBook(slots, 13, 15));

    // Case 11
    Case11TaxService c11 = new Case11TaxService();
    System.out.println("[Case11TaxService] existingVatLabel(100) = "
      + " | computeVat(100, 0.2) = "
      + c11.computeVat(100.0, 0.2));

    // Case 12
    Case12PromotionService c12 = new Case12PromotionService();
    System.out.println("[Case12PromotionService] existingIsPromoDay(\"WEDNESDAY\") = "
      + c12.existingIsPromoDay("WEDNESDAY")
      + " | applyPromo(120, \"FREE\") = "
      + c12.applyPromo(120.0, "FREE"));

    // Case 13
    Case13EmailValidatorService c13 = new Case13EmailValidatorService();
    System.out.println("[Case13EmailValidatorService] existingLooksValid(\"test@example.com\") = "
      + c13.existingLooksValid("test@example.com")
      + " | isCorporateEmail(\"user@company.com\") = "
      + c13.isCorporateEmail("user@company.com"));

    // Case 14
    Case14OrderStatusService c14 = new Case14OrderStatusService();
    System.out.println("[Case14OrderStatusService] existingStatusLabel(\"CREATED\") = "
      + c14.existingStatusLabel("CREATED")
      + " | nextStatus(\"CREATED\") = "
      + c14.nextStatus("CREATED"));

    // Case 15
    Case15CurrencyConverterService c15 = new Case15CurrencyConverterService();
    System.out.println("[Case15CurrencyConverterService] existingEuroToDollar(10) = "
      + c15.existingEuroToDollar(10.0)
      + " | convert(10, 1.2) = "
      + c15.convert(10.0, 1.2));

    System.out.println("--------------------------------------------------");
    System.out.println("Fin de la démonstration. Implémentez / corrigez les méthodes et ajoutez des tests !");
  }
}

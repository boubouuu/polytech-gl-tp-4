package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Test minimal pour exercer la méthode main.
 * L'objectif est simplement de vérifier que l'application démarre
 * sans lever d'exception, ce qui suffit à couvrir la classe App
 * dans les rapports Jacoco / Sonar.
 */


public class Case1ServiceTest {
  @Test
  void CalculateDiscountedPrice_ShouldThrow_ErrorRate() {
    Case1DiscountService case1 = new Case1DiscountService();
    assertThrows(IllegalArgumentException.class, () -> case1.calculateDiscountedPrice(1, -1.0));
    assertThrows(IllegalArgumentException.class, () -> case1.calculateDiscountedPrice(1, 2.0));
  }

  @Test
  void CalculateDiscountedPrice_ShouldThrow_ErrorAmount() {
    Case1DiscountService case1 = new Case1DiscountService();
    assertThrows(IllegalArgumentException.class, () -> case1.calculateDiscountedPrice(-1, 0.2));
  }

  @Test
  void CalculateDiscountedPrice_DiscountPrice() {
    Case1DiscountService case1 = new Case1DiscountService();
    assertEquals(1, case1.calculateDiscountedPrice(2, 0.5));
  }

  @Test
  void CalculateDiscountedPrice_LabelEmpty() {
    Case1DiscountService case1 = new Case1DiscountService();
    assertEquals("DISCOUNT", case1.existingDiscountLabel(""));
  }

  @Test
  void CalculateDiscountedPrice_LabelNotEmpty() {
    Case1DiscountService case1 = new Case1DiscountService();
    assertEquals("DISCOUNT-TEST", case1.existingDiscountLabel("TEST"));
  }
}


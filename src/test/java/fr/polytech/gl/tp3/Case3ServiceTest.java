package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Test minimal pour exercer la méthode main.
 * L'objectif est simplement de vérifier que l'application démarre
 * sans lever d'exception, ce qui suffit à couvrir la classe App
 * dans les rapports Jacoco / Sonar.
 */


public class Case3ServiceTest {
  @Test
  void ComputeShippingCost_ShouldThrowError() {
    Case3ShippingCostService case3 = new Case3ShippingCostService();
    assertThrows(IllegalArgumentException.class, () -> case3.computeShippingCost(-1.0, false));
  }

  @Test
  void ComputeShippingCost_WithoutExpress() {
    Case3ShippingCostService case3 = new Case3ShippingCostService();
    assertEquals(20.0, case3.computeShippingCost(15, false));
  }

  @Test
  void ComputeShippingCost_WithExpress() {
    Case3ShippingCostService case3 = new Case3ShippingCostService();
    assertEquals(30.0, case3.computeShippingCost(15, true));
  }
}


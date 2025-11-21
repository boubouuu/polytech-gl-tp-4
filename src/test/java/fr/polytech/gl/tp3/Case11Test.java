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
public class Case11Test {

  Case11TaxService service = new Case11TaxService();

  @Test
  void testComputeVat() {
    assertEquals(-1, service.computeVat(-1, 15));
    assertEquals(-1, service.computeVat(15, -1));
    assertEquals(0, service.computeVat(0, 12));
    assertEquals(0, service.computeVat(12, 0));
    assertEquals(100, service.computeVat(10, 10));
    assertEquals(-1, service.computeVat(-1, -1));
  }
}

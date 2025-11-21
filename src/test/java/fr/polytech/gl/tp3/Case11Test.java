package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Case11Test {
  final Case11TaxService service = new Case11TaxService();

  @Test
  void nullAmount() {
    assertEquals(0, service.computeVat(0, 20 / 100));
  }

  @Test
  void nullRate() {
    assertEquals(0, service.computeVat(100, 0));
  }

  @Test
  void normalCase() {
    assertEquals(20, service.computeVat(100, 20 / 100));
  }

  @Test
  void largeCase() {
    assertEquals(5000000, service.computeVat(10000000, 50 / 100));
  }

  @Test
  void negativeAmount() {
    assertThrows(IllegalArgumentException.class, () -> service.computeVat(-100, 20 / 100));
  }

  @Test
  void negativeRate() {
    assertThrows(IllegalArgumentException.class, () -> service.computeVat(100, -20 / 100));
  }
}

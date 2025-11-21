package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Case11Test {
  final Case11TaxService service = new Case11TaxService();

  @Test
  void nullAmount() {
    assertEquals(0, service.computeVat(0, .2), 0.001);
  }

  @Test
  void nullRate() {
    assertEquals(0, service.computeVat(100, 0), 0.001);
  }

  @Test
  void normalCase() {
    assertEquals(20, service.computeVat(100, .2), 0.001);
  }

  @Test
  void largeCase() {
    assertEquals(1_000_000, service.computeVat(5_000_000, .2), 0.001);
  }

  @Test
  void negativeAmount() {
    assertThrows(IllegalArgumentException.class, () -> service.computeVat(-100, .2));
  }

  @Test
  void negativeRate() {
    assertThrows(IllegalArgumentException.class, () -> service.computeVat(100, -.2));
  }
}

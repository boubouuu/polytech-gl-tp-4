package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Case10Test {
  final Case10BookingService service = new Case10BookingService();
  final int[][] baseSlots = { { 10, 12 } };

  @Test
  void entirelyBefore() {
    assertTrue(service.canBook(baseSlots, 1, 4));
  }

  @Test
  void entirelyAfter() {
    assertTrue(service.canBook(baseSlots, 14, 16));
  }

  @Test
  void overlapStart() {
    assertFalse(service.canBook(baseSlots, 11, 16));
  }

  @Test
  void overlapEnd() {
    assertFalse(service.canBook(baseSlots, 8, 11));
  }

  @Test
  void insideExisting() {
    assertFalse(service.canBook(baseSlots, 10, 12));
  }

  @Test
  void surroundingExisting() {
    assertFalse(service.canBook(baseSlots, 8, 14));
  }
}

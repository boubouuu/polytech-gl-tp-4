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


public class Case4ServiceTest {
  @Test
  void ExistingFormat_ShouldThrowError_WithId() {
    Case4InvoiceFormatterService case4 = new Case4InvoiceFormatterService();
    assertThrows(IllegalArgumentException.class, () -> case4.formatInvoiceNumber("TEST", -1));
  }

  @Test
  void ExistingFormat_ShouldThrowError_WithPrefix() {
    Case4InvoiceFormatterService case4 = new Case4InvoiceFormatterService();
    assertThrows(IllegalArgumentException.class, () -> case4.formatInvoiceNumber("", 10));
  }

  @Test
  void ComputeShippingCost_NewFormatVoiceNumber() {
    Case4InvoiceFormatterService case4 = new Case4InvoiceFormatterService();
    assertEquals("TEST-002ID", case4.formatInvoiceNumber("TEST", 2));
  }

  @Test
  void ComputeShippingCost_NewExistingFormat() {
    Case4InvoiceFormatterService case4 = new Case4InvoiceFormatterService();
    assertEquals("TestL1\nTestL2", case4.existingFormat(new String[]{"TestL1", "TestL2"}));
  }
}


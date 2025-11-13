package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/*
 * Test minimal pour exercer la méthode main.
 * L'objectif est simplement de vérifier que l'application démarre
 * sans lever d'exception, ce qui suffit à couvrir la classe App
 * dans les rapports Jacoco / Sonar.
 */
public class AppTest {

  @Test
  void main_shouldRunWithoutException() {
    assertDoesNotThrow(() -> App.main(new String[0]));
  }
}

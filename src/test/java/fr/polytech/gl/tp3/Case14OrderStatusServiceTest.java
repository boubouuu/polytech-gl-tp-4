package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Test minimal pour exercer le case 14.
 * L'objectif est simplement de vérifier que l'application démarre
 * sans lever d'exception, ce qui suffit à couvrir la classe App
 * dans les rapports Jacoco / Sonar.
 */

public class Case14OrderStatusServiceTest {

    Case14OrderStatusService service = new Case14OrderStatusService();

    @Test
    void testExistingStatusLabel(){
        assertEquals("Order created", service.existingStatusLabel("CREATED"));
        assertEquals("Order paid", service.existingStatusLabel("PAID"));
        assertEquals("Order shipped", service.existingStatusLabel("SHIPPED"));
        assertEquals("Order delivered", service.existingStatusLabel("DELIVERED"));
        assertEquals("Unknown", service.existingStatusLabel("INVALID_STATUS"));
    }

    @Test
    void testNextStatus() {
        assertEquals("PAID", service.nextStatus("CREATED"));
        assertEquals("SHIPPED", service.nextStatus("PAID"));
        assertEquals("DELIVERED", service.nextStatus("SHIPPED"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            service.nextStatus("INVALID_STATUS");
        });
    }
}
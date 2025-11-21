package fr.polytech.gl.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class Case3ShippingCostServiceTest {

    @Test
    void testCalculateShippingCostIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            Case3ShippingCostService service = new Case3ShippingCostService();
            service.computeShippingCost(0, false);
        });
    }

    @Test
    void testCalculateShippingCost() {
        Case3ShippingCostService service = new Case3ShippingCostService();
        double cost1 = service.computeShippingCost(2.5, false);
        assertEquals(7.5, cost1);
    }
}

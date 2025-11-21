package fr.polytech.gl.tp3;

/*
 * Case 14 : statut de commande.
 * Tâches :
 * - Corriger l'utilisation de constantes en dur dans existingStatusLabel().
 * - Implémenter nextStatus(current) :
 *      - "CREATED" -> "PAID"
 *      - "PAID" -> "SHIPPED"
 *      - "SHIPPED" -> "DELIVERED"
 *      - pour tout autre, IllegalArgumentException
 * - Écrire au moins un test unitaire pour nextStatus.
 */
public class Case14OrderStatusService {

    private static final String CREATED = "CREATED";
    private static final String PAID = "PAID";
    private static final String SHIPPED = "SHIPPED";
    private static final String DELIVERED = "DELIVERED";

    public String existingStatusLabel(String status) {
        switch (status) {
            case CREATED:
                return "Order created";
            case PAID:
                return "Order paid";
            case SHIPPED:
                return "Order shipped";
            case DELIVERED:
                return "Order delivered";
            default:
                return "Unknown";
        }
    }

    public String nextStatus(String current) {
        switch (current) {
            case CREATED:
                return PAID;
            case PAID:
                return SHIPPED;
            case SHIPPED:
                return DELIVERED;
            default:
                throw new IllegalArgumentException("Invalid status: " + current);
        }
    }
}

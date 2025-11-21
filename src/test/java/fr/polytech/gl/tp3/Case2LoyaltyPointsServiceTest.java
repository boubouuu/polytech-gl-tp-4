package fr.polytech.gl.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Case2LoyaltyPointsServiceTest {

  Case2LoyaltyPointsService service = new Case2LoyaltyPointsService();

  @Test
  void existingLevelNameValue(){
    assertEquals("BRONZE", service.existingLevelName(1));
    assertEquals("SILVER", service.existingLevelName(101) );
     assertEquals("GOLD", service.existingLevelName(201) );
  }
  @Test
  void computeEarnedPoints(){
    assertEquals(10, service.computeEarnedPoints(49));
    assertEquals(20, service.computeEarnedPoints(99));
    assertEquals(50, service.computeEarnedPoints(101));
  }
}

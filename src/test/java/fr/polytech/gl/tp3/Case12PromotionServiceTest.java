package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Case12PromotionServiceTest {
  @Test
  void Case12PromotionCodeFree() throws Exception {
    Case12PromotionService c12free = new Case12PromotionService();
    double result=c12free.applyPromo(101,"FREE");
    assertEquals(0, result);
  }
  @Test
  void Case12PromotionCodeHalf() throws Exception {
    Case12PromotionService c12half = new Case12PromotionService();
    double result= c12half.applyPromo(101,"HALF");
    assertEquals((double) 101 /2, result);
  }
  @Test
  void Case12PromotionCodeNotFree() {
    Case12PromotionService c12notfree = new Case12PromotionService();
    double result = c12notfree.applyPromo(99,"FREE");
    assertEquals(99, result);
  }
}

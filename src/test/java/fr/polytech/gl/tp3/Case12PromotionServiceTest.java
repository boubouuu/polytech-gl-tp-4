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
  void Case12PromotionCodeHalfbis() throws Exception {
    Case12PromotionService c12halfbis = new Case12PromotionService();
    double result= c12halfbis.applyPromo(11,"HALF");
    assertEquals((double) 11/2 , result);
  }
  @Test
  void case12PromotionCodeHalfTer() throws Exception {
    Case12PromotionService c12halfter = new Case12PromotionService();
    double result= c12halfter.applyPromo(100,"HALF");
    assertEquals((double) 100/2 , result);
  }
  @Test
  void case12PromotionPasDeCode() throws Exception {
    Case12PromotionService c12pasde = new Case12PromotionService();
    double result= c12pasde.applyPromo(101,"");
    assertEquals((double) 101, result);
  }
  @Test
  void Case12PromotionCodeNotFree() {
    Case12PromotionService c12notfree = new Case12PromotionService();
    double result = c12notfree.applyPromo(99,"FREE");
    assertEquals(99, result);
  }
  @Test
  void Case12PromotionServiceTest() throws Exception {
    Case12PromotionService c12 = new Case12PromotionService();
    boolean result = c12.existingIsPromoDay("Monday");
    assertEquals(false, result);
  }
  @Test
  void Case12PromotionServiceTest2() throws Exception {
    Case12PromotionService c12 = new Case12PromotionService();
    boolean result = c12.existingIsPromoDay("");
    assertEquals(false, result);
  }
  @Test
  void Case12PromotionServiceTest3() throws Exception {
    Case12PromotionService c12 = new Case12PromotionService();
    boolean result = c12.existingIsPromoDay("WEDNESDAY");
    assertEquals(true, result);
  }
}

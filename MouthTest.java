import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MouthTest{
  Mouth mouth;
  Tooth tooth;

  @Before
  public void before(){
    mouth = new Mouth("A Mouth");
    tooth = new Tooth();
  }

  @Test
  public void hasName(){
    assertEquals("A Mouth", mouth.getName());
  }

  @Test
  public void noTeethAtStart(){
    assertEquals(0, mouth.toothCount());
  }

  @Test
  public void canGrowTeeth(){
    mouth.growTooth(tooth);
    assertEquals(1, mouth.toothCount());
  }

  @Test
  public void mouthHasRightNumberOfTeeth(){
    for (int i = 0; i < 32 ; i++){
      mouth.growTooth(tooth);
    }
    assertEquals(true, mouth.fullCompliment());
  }

  @Test 
  public void cantGrowExtras(){
    for(int i = 0; i < 40; i++) mouth.growTooth(tooth);
      assertEquals(32, mouth.toothCount());
  }
  
  @Test
  public void dentalMishapDestroysTeeth(){
    mouth.growTooth(tooth);
    mouth.dentalMishap();
    assertEquals(0, mouth.toothCount());
  } 

  // @Test
  // public void canLoseTooth(){
  //   mouth.growTooth(tooth);
  //   mouth.loseTooth(tooth);
  //   assertEquals(0, mouth.toothCount());
  // }

}
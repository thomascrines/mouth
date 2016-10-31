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
  public void cantGrowTooMany(){
    for (int i = 0; i < 32 ; i++){
      mouth.growTooth(tooth);
    }
    assertEquals(true, mouth.fullCompliment());
  }

}
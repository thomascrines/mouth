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
    assertEquals("A Mouth", mouth.getName)
  }
}
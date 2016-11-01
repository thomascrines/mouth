import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MouthTest{
  Mouth mouth;
  Tooth tooth;
  Incisor incisor;
  Canine canine;
  Premolar premolar;
  Molar molar;
  WisdomTooth wisdomtooth;

  @Before
  public void before(){
    mouth = new Mouth("A Mouth");
    incisor = new Incisor();
    canine = new Canine();
    premolar = new Premolar();
    molar = new Molar();
    wisdomtooth = new WisdomTooth();
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
  public void dentalMishapDestroysTeeth(){
    mouth.growTooth(tooth);
    mouth.dentalMishap();
    assertEquals(0, mouth.toothCount());
  } 

  @Test
  public void canLoseTooth(){
    mouth.growTooth(tooth);
    mouth.removeTooth();
    assertEquals(0, mouth.toothCount());
  }

  @Test void healthCanGoDown(){
    incisor.drinkCoke();
    assertEquals(80, incisor.health());
  }

}
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
    mouth.growTooth(incisor);
    assertEquals(1, mouth.toothCount());
  }
  
  @Test
  public void dentalMishapDestroysTeeth(){
    mouth.growTooth(incisor);
    mouth.growTooth(canine);
    mouth.growTooth(premolar);
    mouth.growTooth(molar);
    mouth.growTooth(wisdomtooth);
    mouth.dentalMishap();
    assertEquals(0, mouth.toothCount());
  } 

  @Test
  public void canLoseTooth(){
    mouth.growTooth(incisor);
    mouth.growTooth(canine);
    mouth.removeTooth();
    assertEquals(1, mouth.toothCount());
  }

  // @Test void healthCanGoDown(){
  //   incisor.drinkCola();
  //   assertEquals(80, incisor.health());
  // }

  // @Test
  // public void canDescribeFunction(Incisor incisor){
  //   assertEquals("My function is to bite.", incisor.describeFunction());
  // }

}
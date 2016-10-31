public class Mouth{
  private String name;
  private Tooth[] gums;

  public Mouth(String name){
    this.name = name;
    this.gums = new Tooth[32];
  }

  public String getName(){
    return this.name;
  }

  public int toothCount(){
    int counter = 0;
    for (Tooth tooth : gums) {
      if (tooth != null){
        counter ++;
      }
    }
    return counter;
  }

  public void growTooth(Tooth tooth) {
    int teeth = toothCount();
    gums[teeth] = tooth;
  }

  public boolean fullCompliment(){
    return toothCount() == gums.length;
  }

}
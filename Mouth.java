import java.util.*;

public class Mouth {

  private String name;
  private ArrayList<Tooth> gums;

  public Mouth(String name){
    this.name = name;
    this.gums = new ArrayList<Tooth>();
  }

  public String getName(){
    return this.name;
  }

  public int toothCount(){
    return this.gums.size();
  }

  public void growTooth(Tooth tooth) {
    this.gums.add(tooth);
  }

  public void dentalMishap(){
    this.gums.clear();
  }

  public Tooth removeTooth(){
    if (toothCount() > 0) {
      return gums.remove(0);
    }
    return null;
  }

  public int drinkCola(){
     for ( Tooth tooth : gums ) {
        (tooth.health() -= 20);
    }
  }
  

}
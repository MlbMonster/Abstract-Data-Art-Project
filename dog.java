import org.code.theater.*;
import org.code.media.*;

public class dog{
private String name; // name of dog
  private String bg; // breed of dog
  private String bf; // reason for breeding
  private int mina; // min age
  private int maxa; // max age
  private int minh; // min height
  private int maxh; // max height
  private String temp; // temperament of dogs 
  
//parameterized constructor 
  public dog(String name, String bg, String bf, int mina, int maxa, int minh, int maxh, String temp){
    this.name = name;
    this.bg = bg;
    this.bf = bf;
    this.mina = mina;
    this.maxa = maxa;
    this.minh = minh;
    this.maxh = maxh;
    this.temp = temp;
  }
// getter methods
  public String getName(){
    return name; 
  }
    public String getBg(){
    return bg; 
  }
  public String getBf(){
    return bf; 
  }
  public int getMina(){
    return mina; 
  }
    public int getMaxa(){
    return maxa; 
  } 
  public int getMinh(){
    return minh; 
  }
    public int getMaxh(){
    return maxh; 
  }
  public String getTemp(){
    return temp; 
  }

  // to String method to be printed out
  public String toString(){
    return "Dog Name: " + name + "\n" +
           "Breed Group: " + bg + "\n" +
           "Bred For: " + bf + "\n" +
           "Min Lifespan: " + mina + " years\n" +
           "Max Lifespan: " + maxa + " years\n" +
           "Min Height: " + minh + " inches\n" +
           "Max Height: " + maxh + " inches\n" +
           "Temperament: " + temp;
  }
    public String toStringName(){
    return "Dog Name: " + name;
  }
      public String toStringBg(){
    return "Breed Group: " + bg;
  }
      public String toStringbf(){
    return "Bred For: " + bf;
  }
  public String toStringMina(){
    return "Min Lifespan: " + mina + "years.";
  }
    public String toStringMaxa(){
    return "Max Lifespan: " + maxa + "years.";
  }
    public String toStringMinh(){
    return "Min Height: " + minh;
  }
    public String toStringMaxh(){
    return "max Height: " + maxh;
  }
      public String toStringTemp(){
    return "Temperament: " + temp; 
  }
}
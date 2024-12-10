import org.code.theater.*;
import org.code.media.*;

public class DataScene extends Scene {
private dog[] dog; // 1D array of dogs

  public DataScene(){
  dog = createDog();
  }
  
// returns a 1D array of a Dog Object
public dog[] createDog(){
String[] nameArray = FileReader.toStringArray("dogname.txt");
String[] groupArray = FileReader.toStringArray("breedgroup.txt");
String[] forArray = FileReader.toStringArray("bredfor.txt");
int[] minaArray = FileReader.toIntArray("minlifespan.txt");
int[] maxaArray = FileReader.toIntArray("maxlifespan.txt");
int[] minhArray = FileReader.toIntArray("minheight.txt");
int[] maxhArray = FileReader.toIntArray("maxheight.txt");
String[] tempArray = FileReader.toStringArray("temperment.txt");

dog[] dogArray = new dog[nameArray.length];
  for(int i = 0; i< dogArray.length; i++){
    dogArray[i] = new dog(nameArray[i], groupArray[i], forArray[i], minaArray[i], maxaArray[i], minhArray[i], maxhArray[i], tempArray[i]);
  }
return dogArray;
}

  // Creates my scene 
  public void drawScene(){
 // Select a random dog
    int randomIndex = (int) (Math.random() * dog.length); // Get a random index
    dog d = dog[randomIndex]; // Select the random dog
     // Generate a random height between min and max height
    int randomHeight = d.getMinh() + (int) (Math.random() * (d.getMaxh() - d.getMinh() + 1));

    clear("white"); // makes white background
   playSound("drumroll.wav"); // plays drumroll
    pause(5);
// sorts into large, medium, and small dogs
if(d.getMinh() > 15 && d.getMinh() <= 22){
  playSound("midDog.wav"); // plays a medium size dog sound effect
  drawImage("dog.png", 150, 50, 100);
  setTextStyle(Font.SERIF, FontStyle.NORMAL);
} else if (d.getMinh() <= 15){
  playSound("littleDog.wav"); // plays a little size dog sound effect
  drawImage("dog.png", 175, 75, 50);
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
} else if (d.getMinh() > 22){
  playSound("largeDog.wav"); // plays a large size dog sound effect
  drawImage("dog.png", 125, 25, 150);
  setTextStyle(Font.SERIF, FontStyle.BOLD);
}
drawText(d.toStringName(), 20, 200);
drawText(d.toStringBg(), 20, 225);
drawText(d.toStringbf(), 20, 250);
drawText(d.toStringMina(), 20, 275);
drawText(d.toStringMaxa(), 20, 300);
drawText(d.toStringMinh(), 20, 325);
drawText(d.toStringMaxh(), 20, 350);
setTextHeight(10);
drawText(d.toStringTemp(), 20, 365);
System.out.println(d);
  }
}
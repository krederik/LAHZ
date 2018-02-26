public class Snake {

int length = 0;
String fangs = "";
String colour = "";
String dangerous = "";
String name = "";
String shape = "";
int age = 0;
int weight = 0;
String type = "";
String mood = "";
String sound = "";

public Snake(int length, String fangs, String colour, String dangerous, String name, String shape, int age, int weight, String type, String mood, String sounnd){
   this.length = length;
   this.fangs = fangs;
   this.colour = colour;
   this.dangerous = dangerous;
   this.name = name;
   this.shape = shape;
   this.age = age;
   this.weight = weight;
   this.type = type;
   this.mood = mood;
   this.sound = sound;

}


public void snakeInfo(){
   System.out.println("Length:\t\t" + length + "cm");
   System.out.println("Fangs:\t\t" + fangs);
   System.out.println("Colour:\t\t" + colour);
   System.out.println("Dangerous:\t" + dangerous);
   System.out.println("Name:\t\t\t" + name);
   System.out.println("Shape:\t\t" + shape);
   System.out.println("Age:\t\t\t" + age + " years");
   System.out.println("Weight:\t\t" + weight + "g");
   System.out.println("Type:\t\t\t" + type);
   System.out.println("Mood:\t\t\t" + mood);
   System.out.println("Sound:\t\t" + sound + "\n");
   
   
}
}
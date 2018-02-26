public class Bunny {

   private String name;
   private String colour;
   private String fur;
   private int weight = 0;
   private String personality;
   private int age = 0;
   private String taste;
   private int x = 0;
   private int y = 0;


public Bunny (String name, String colour, String fur, int weight, String personality, int age, String taste, int x, int y){
   this.name = name;
   this.colour = colour;
   this.fur = fur;
   this.weight = weight;
   this.personality = personality;
   this.age = age;
   this.taste = taste;
   this.x = x;
   this.y = y;
}

public void tell(){
   System.out.println("I am " + name + " the rabbit. I am a " + colour + ", " + fur + " rabbit, with a " + personality + " personality");
   System.out.println("The snake wants to eat me because im " + taste + " but we wont let him, won't we? Right now i am on sqaure " + x + ", " + y + " don't let the snake stand next to me.");
}

public void setX(int x){
   this.x = x;   
   }
   
public void setY(int y){
   this.y = y;  
   }

public void bunnyInfo(){
   System.out.println("Name:\t\t\t" + name);
   System.out.println("Colour:\t\t" + colour);
   System.out.println("Fur:\t\t\t" + fur);
   System.out.println("Weight:\t\t" + weight + "kg" + "\n");
   System.out.println("Location:\t" + x + ", " + y);
   
}
}
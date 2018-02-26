public class Arena{

String size = "";
String coordinates = "";
String colour = "";
String name = "";
String type = "";

public Arena(String size, String coordinates, String colour, String name, String type){
   this.size = size;
   this.coordinates = coordinates;
   this.colour = colour;
   this.name = name;
   this.type = type;

}

public void arenaInfo(){
   System.out.println("Size:\t\t\t" + size);
   System.out.println("Coordinates:" + coordinates);
   System.out.println("Colour:\t\t" + colour);
   System.out.println("Name:\t\t\t" + name);
   System.out.println("Type:\t\t\t" + type);


}



}
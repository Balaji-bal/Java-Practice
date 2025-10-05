
class Construct_Super{
    int Age;
    String Name;

public Construct_Super(){

    System.out.println("Inside parent default construct");
}

public Construct_Super(int Age,String name){

    System.out.println("Inside parent arg  construct");
}

}

class Construct extends Construct_Super{

int Age;
String Name;

    public Construct()  // by default every class has one constructoe with no arguments
    {
            super(2,"Balaji");
           Age=0;
           Name="";
         
           System.out.println("Inside constructor");
    }
    public Construct(int Age,String Name){
       super();
                  System.out.println("Inside constructor with args");

    }
}


public class Demo {
    
    public static void main(String a[]){
    
    Construct obj=new Construct();

    }
}


class staticUse{

    int price;
    String brand;
    static String name;
    //making name common to all Objects

    static{
        name="Smart_Phone";
        System.out.println("inside static block:name:" +name);
    }
// we can use Constructor to instanciate the class varaiables
    public staticUse(){
             price=0;
             brand="";
                     System.out.println("inside constructor");

             //name="Phone";
    }
    public void show(){
     System.out.println("Mobile name:"+name+ "\nbrand:"+brand+"\nprice:"+price);


    }
    public static void show1(staticUse obj){
    System.out.println(" Inside static Method \n Mobile name:"+name+ "\nbrand:"+obj.brand+"\nprice:"+obj.price);
    //you cannot use non static variables inside static method we need to use static variables only or else pass the object to the staic method

    }
}



public class Demo2{
    public static void main(String a[]) throws Exception{
           //staticUse.name="MobilePhone";
           //sttaic varaibles should be called using class rather than objects
           // we have different space for lall static variables in JVM
           Class.forName("staticUse");
//    staticUse aob=new staticUse();
//    //if we do not create an object then Staic block will also not execute as it is not loading class loader.
//    // if we want to load classloader(this is where in JVM we will have static blocks ) then we can use Class class and load the class loader by using forName and instanciate the class

//    aob.brand="Apple";
//    aob.price=50000;
  staticUse obj=new staticUse();
   obj.brand="Pixel";
   obj.price=30000;
   //obj.show();
// staticUse.name="MobilePhone";

//    aob.show();

   // when we declare a static variable it is attached to the class not the object so whatever the value given to static varaible from obj will override the previous valu and is attached to class
  // we can pass the object to the static method as input to access object properties or variables or methods
   staticUse.show1( obj);

    }
}


class Encap{

    private int age;
    private String name;
    //private variables are accessed only inside the class that declared th private variables not outside of the class
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        //this refers to the object that this method is getting called from and so it assigns to that property of the object
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}

public class Demo {
    public static void main(String args[]){
        Encap obj=new Encap();
       // obj.age=20;
        //obj.name="Balaji";
        // for above two lines we will be having error saying name is not avaialable because they are private ones and are encapsulated
        // in order to access them we need to make a request to them by methods so methods will bind the data of proivate varaibles 
        // these are called getters and setters 
      obj.getAge();
      obj.setAge(20);
      obj.setName("balaji");
      obj.getName();
      System.out.println(obj.getAge()+" "+ obj.getName());

    }
    
}

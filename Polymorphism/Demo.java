//package Polymorphism;

 class A{
    public void show(){
        System.out.println("in Class A");
    }

}
 class B extends A{
    public void show(){
        System.out.println("in Class B");
    }

}
 class C extends B{
 public void show(){
        System.out.println("in Class C");
    }
    public void show2(){
        System.out.println("in Class C");
    }
}



public class Demo {
    public static void main(String a[]){
    A obj=new A();
    obj.show();
    obj=new B();
    obj.show();
    obj=new C();
    obj.show();
    
    }
}

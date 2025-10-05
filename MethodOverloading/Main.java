import Inheritance.Demo;

class Demo{
    public void sayHello(){
        System.out.println("Hello");
    }

    public boolean isnumgrethan10(int num){
        if(num>10){
            return true;
        }
        return false;
    }
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public int add(int num1,byte num2){
        return num1+num2;
    }
    public double add(int num1,double num2){
        return num1+num2;
    }
}

public class Main{
    public static void main(String args[]){

    Demo obj=new Demo();
    //obj.sayHello();
    double sumresult=obj.add(10,2);
    System.out.println(sumresult);

    }
}
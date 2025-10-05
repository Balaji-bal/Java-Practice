
public class AdvCalc extends Calculator{
    
    public int Multiply(int num1,int num2){
        return num1*num2;
    }
    public int div(int num1,int num2){
        return num1%num2;
    }

    public int add(int a,int b){//method Overriding 
        return a+b+2;
    }

}

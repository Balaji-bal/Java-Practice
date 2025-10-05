public class Demo {
    public static void main(String[] args){

      
        String str="Balaji";
        char[] ch=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
           rev+=ch[i];         

        }
        System.out.println(rev);


    }


}

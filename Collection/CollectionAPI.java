import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

 class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(Student st) {
       return this.age>st.age?1:-1; 
 }
 public String toString(){
    return "Name: "+name+" ;Age:"+age;
 }
 }
public class CollectionAPI{
    public static void main(String[] args){
        Comparator<Student> com=( a,  b) ->  a.age>b.age?1:-1;  //return 1 or -1 based on condition
          
        List<Student> cs=new ArrayList<>();
        cs.add(new Student(21,"Sujith"));
        cs.add(new Student(24,"Balaji"));
        cs.add(new Student(25,"Siva"));
        cs.add(new Student(24,"Revanth"));
        cs.add(new Student(23,"sasi"));

       Collections.sort(cs); // by default works for Integer comparable implements Integer which implements sorted
        // to implement our own sort we can use comparator(interface)
       System.out.println( cs);

        // Set<Integer> se=new TreeSet<>();
        // se.add(12);
        // se.add(40);
        // se.add(12);
        // se.add(14);
        
        //  // System.out.println( se);

        //   Iterator<Integer> it=se.iterator();
        //   while(it.hasNext()){
        //    // System.out.println(it.next());
        //   }


        // Map<String,Integer> stu=new HashMap<>();  //Hashtable can be used if the map is getting accessed by multiple threads as it is synchronized
        // stu.put("Balaji",99);
        // stu.put("Siva",100);
        // stu.put("Sujith",99); 
        // stu.put("Balaji",90);
        // System.out.println(stu.values());
        // for(String s:stu.keySet()){
        //     System.out.println(s+": "+ stu.get(s));
        // }


    }
}

package hash;
import java.util.HashMap;
public class Hash {

    public static void main(String[] args) {
    HashMap<Integer,String> m = new HashMap<>();
    m.put(1,"apple");
    m.put(2,"Banna");
    m.put(3,"Cat");
    for(int i:m.keySet()){ // key
      System.out.print(i);  
    }
    for(String i:m.values()){ // Values
      System.out.println(i);  
    }
    for(int i:m.keySet()){ // both
      System.out.println("key : "+i +" : Values are :"+m.get(i));  
    }
    
    
    // Class as a value
    HashMap<Integer,Student> m1 = new HashMap<>();
    m1.put(1,new Student("maryam"));
    for(int j:m1.keySet()){ // both
      System.out.println("key : "+j);  
      m1.get(j).display();
    }
    }
    
}

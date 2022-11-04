
package recurion;

public class Recurion {

    public static void main(String[] args) {
       Recurion s = new Recurion();
       s.even(1) ; 
    }
    public int even( int N){
        if(N==50){
            
            //System.out.println("Blast off");
            return 0;
        }
        
        else {
         if   (N%2==0){
            System.out.println(N);
        }
        }
        even(N+1);
        return 0;
            
    }
}

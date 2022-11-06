package theoryterminal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class TheoryTerminal {

    public static void main(String[] args)  {
        try {
            FileReader fr = new FileReader("C:\\Users\\Zainab\\Pictures\\Desktop\\inputFile.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            int record=0;
            int female=0;
            int weight=0;
            int a=0;
            while ((line = br.readLine()) != null) {
                String[] spl= line.split("@");
                String gender = spl[0];
                String age= spl[1];
                String race = spl[2];
                String parity = spl[3];
                String bwt = spl[4];
                record++;
                int w = Integer.parseInt(bwt);
                int ag=Integer.parseInt(age);
                
                if(gender.equals("F")){
                   female++; 
                }
               
                if(w<200){
                   weight++;
                    
                }
                
                    
                if(ag<=16 &&(w<2000)  ){
                  a++;    
                }
                  
                    
                
            
            }
            System.out.println("Total records "+record);
            System.out.println("Total female records are "+female);
            System.out.println("Children under 2000 grams "+weight);
            System.out.println ("Record with mother age less than 16 and child weight under 2000 "+a);
    }
        catch(IOException w){
            System.out.println(w);
        }
    
}
}

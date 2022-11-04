
package calculator;
import java.awt.*;
import javax.swing.*;
public class Calculator {

    public void  Test(){
        JFrame m = new JFrame ();
       Container c = m.getContentPane();
       c.setLayout(new BorderLayout());
      
      JLabel L = new JLabel("CALCULATOR");
       JPanel p = new JPanel();
       p.setLayout(new GridLayout(4,4) );
        JTextField a = new JTextField(10);
        JButton b1= new JButton("0");
        JButton b2= new JButton("1");
        JButton b3= new JButton("2");
        JButton b4= new JButton("3");
        JButton b5= new JButton("4");
        JButton b6= new JButton("5");
        JButton b7= new JButton("6");
        JButton b8= new JButton("7");
        JButton b9= new JButton("8");
        JButton b10= new JButton("9");                
        JButton b11= new JButton("+");
        JButton b12= new JButton("-");
        JButton b13= new JButton("x");
        JButton b14= new JButton("%");
        JButton b15= new JButton("=");
        JButton b16= new JButton("DEL");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
       p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        c.add(a ,BorderLayout.NORTH);
        c.add(p,BorderLayout.CENTER);
        c.add(L,BorderLayout.SOUTH);
        m.setSize(200,200);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        
}
    
 public Calculator(){
           Test(); 
        }
    public static void main(String[] args) {
   
     Calculator c = new Calculator();
     
    }
    
}


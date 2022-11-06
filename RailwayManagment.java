package railwayrecord1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;


public class RailwayRecord1 {

    public static void main(String[] args) {
        Run rec= new Run();
       GUI g = new GUI();
    }
    }


package railwayrecord1;

public class train extends RailwayRecord1 {
    String LicenceNumber;
    private String TotalSeats;
    private String AvailableSeats;
    private String bookedSeats;
    private String DepTime;
    private String Destination;
    private String Distance;
    private String stops;
    private String totalPassengers;

     public String getLicNum() {
        return LicenceNumber;
    }

    public train(String LicenceNumber, String TotalSeats, String AvailableSeats, String bookedSeats, String DepTime, String Destination, String Distance, String stops, String totalPassengers) {
        this.LicenceNumber = LicenceNumber;
        this.TotalSeats = TotalSeats;
        this.AvailableSeats = AvailableSeats;
        this.bookedSeats = bookedSeats;
        this.DepTime = DepTime;
        this.Destination = Destination;
        this.Distance = Distance;
        this.stops = stops;
        this.totalPassengers = totalPassengers;
    }
    
  @Override
    public String toString(){
        return(
                "Train licence number: "+LicenceNumber+"\n"+
                "Total number of seats:  "+ TotalSeats+"\n"+
                "Seats Available in the train : "+ AvailableSeats+"\n"+
                "Booked Seats : "+ bookedSeats+"\n"+
                "Time for departure:  "+DepTime +"\n"+
                "Destination of the Train : "+Destination+"\n"+
                "Total Distance coverd in Kilometer : "+Distance+"\n"+
                " Train will stop at  : "+stops +"\n"+
                " Toal passengers travelling in the train  : "+totalPassengers +"\n"+
                "_________________________");
}  

    public String getLicenceNumber() {
        return LicenceNumber;
    }

    public void setLicenceNumber(String LicenceNumber) {
        this.LicenceNumber = LicenceNumber;
    }

    public String getTotalSeats() {
        return TotalSeats;
    }

    public void setTotalSeats(String TotalSeats) {
        this.TotalSeats = TotalSeats;
    }

    public String getAvailableSeats() {
        return AvailableSeats;
    }

    public void setAvailableSeats(String AvailableSeats) {
        this.AvailableSeats = AvailableSeats;
    }

    public String getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(String bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getDepTime() {
        return DepTime;
    }

    public void setDepTime(String DepTime) {
        this.DepTime = DepTime;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String Distance) {
        this.Distance = Distance;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public String getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(String totalPassengers) {
        this.totalPassengers = totalPassengers;
    }
            
}


package railwayrecord1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;

public class Run extends RailwayRecord1 implements ActionListener {

    private ArrayList arr;

    public Run() {
        arr = new ArrayList();
        load();

    }

    public void SaveData() {
        try {
            FileWriter f = new FileWriter("C:\\Users\\Zainab\\Pictures\\Desktop\\RailRecord.txt");
            PrintWriter p = new PrintWriter(f);
            for (int i = 0; i < arr.size(); i++) {
                train s = (train) arr.get(i);
                p.println(s.getLicenceNumber() + "," + s.getTotalSeats() + "," + s.getAvailableSeats() + "," + s.getBookedSeats() + "," + s.getDepTime() + ","
                        + s.getDestination() + "," + s.getDistance() + "," + s.getStops() + "," + s.getTotalPassengers());
            }
            f.close();
            p.close();
        } catch (IOException c) {
            System.out.print(c);
        }
    }

    private void load() {
        try {
            FileReader fr = new FileReader("C:\\Users\\Zainab\\Pictures\\Desktop\\RailRecord.txt");
            BufferedReader br = new BufferedReader(fr);
            String ss = br.readLine();
            while (ss != null) {
                String[] token = ss.split(",");
                String LicenceNumber = token[0];
                String TotalSeats = token[1];
                String AvailableSeats = token[2];
                String bookedSeats = token[3];
                String DepTime = token[4];
                String Destination = token[5];
                String Distance = token[6];
                String stops = token[7];
                String totalPassengers = token[8];
                arr.add(new train(LicenceNumber, TotalSeats, AvailableSeats, bookedSeats, DepTime, Destination, Distance, stops, totalPassengers));
                ss = br.readLine();
            }
            for (int i = 0; i < arr.size(); i++) {
                train s = (train) arr.get(i);

            }
            fr.close();
            br.close();
        } catch (ArrayIndexOutOfBoundsException c) {
            System.out.print(c);
        }
        catch(IOException c){
         System.out.print(c);
        }
    }

    public void add() {
        JFrame AddFrame = new JFrame();
        Container conAdd = AddFrame.getContentPane();

        JTextField Licence = new JTextField();
        JTextField Seats = new JTextField();
        JTextField available = new JTextField();
        JTextField booked = new JTextField();
        JTextField Dep = new JTextField();
        JTextField dest = new JTextField();
        JTextField Dis = new JTextField();
        JTextField stop = new JTextField();
        JTextField totalPass = new JTextField();
        
        JButton Save= new JButton("Save");

        //JtextFeild to String
        String LicenceNumber = Licence.getText();
        String TotalSeats = Seats.getText();
        String AvailableSeats = available.getText();
        String bookedSeats = booked.getText();
        String DepTime = Dep.getText();
        String Destination = dest.getText();
        String Distance = Dis.getText();
        String stops = stop.getText();
        String totalPassengers = totalPass.getText();

        JLabel lic = new JLabel("Enter License Number");
        JLabel seat = new JLabel("Enter Total number of seats");
        JLabel ava = new JLabel("Enter Available Seats");
        JLabel book = new JLabel("Enter Booked Seats");
        JLabel De = new JLabel("Enter Departure Time");
        JLabel di = new JLabel("Enter Destination");
        JLabel dis = new JLabel("Enter Distance");
        JLabel stp = new JLabel("Enter total Stops");
        JLabel top = new JLabel("Enter Total Number of Passengers");
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9, 1));
        p.add(lic);
        p.add(Licence);
        p.add(seat);
        p.add(Seats);
        p.add(ava);
        p.add(available);
        p.add(book);
        p.add(booked);
        p.add(De);
        p.add(Dep);
        p.add(di);
        p.add(dest);
        p.add(dis);
        p.add(Dis);
        p.add(stp);
        p.add(stop);
        p.add(top);
        p.add(totalPass);
        AddFrame.setLayout(new BorderLayout());
        conAdd.add(p,BorderLayout.NORTH);
        conAdd.add(Save ,BorderLayout.SOUTH);
        
        Save.addActionListener(this);
        AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AddFrame.setVisible(true);
        AddFrame.add(p);
        AddFrame.setSize(400, 400);

        arr.add(new train(LicenceNumber, TotalSeats, AvailableSeats, bookedSeats, DepTime, Destination, Distance, stops, totalPassengers));
    } 
    @Override
    public void actionPerformed(ActionEvent ae){
        SaveData();
        System.exit(0);
    }

    public void Search() {
        JFrame Frame = new JFrame();
        Container conAdd = Frame.getContentPane();
        JPanel p = new JPanel();
        JTextField lic = new JTextField(20);
        JLabel Licence = new JLabel("Enter ID number of Train ");
        String LicenceNumber=lic.getText();
        p.add(Licence);
        p.add(lic);
        Frame.add(p);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
        
        Frame.setSize(400, 200);
        for (int i = 0; i < arr.size(); i++) {
            train s = (train) arr.get(i);
            if (LicenceNumber.equals(s.getLicNum()));
            {
                JOptionPane.showMessageDialog(null, arr.get(i).toString());
                break;
            }
        }
    }

    public void Delete() {
        String LicenceNumber = JOptionPane.showInputDialog("Enter Licence Number of the train whose data you wish to remove  ");
        for (int i = 0; i < arr.size(); i++) {
            train s = (train) arr.get(i);
            if (LicenceNumber.equals(s.getLicNum()));
            {
                arr.remove(s);
                JOptionPane.showMessageDialog(null, "deleted record of " + s.toString());
                break;
            }
        }
    }

    public void ShowAll() {
        String a = "Total record are " + arr.size() + "\n";
        for (int i = 0; i < arr.size(); i++) {
            train t = (train) arr.get(i);
            a = a + t.toString();
            JOptionPane.showMessageDialog(null, a);

        }
    }

    public void modify() {
        String LicenceNumber = JOptionPane.showInputDialog("Enter  Licence Number of Train whose data you wantto modify ");
        for (int i = 0; i < arr.size(); i++) {
            train t = (train) arr.get(i);
            if (LicenceNumber.equals(t.getLicNum())) {
                JOptionPane.showMessageDialog(null, "deleted record of " + t.toString());
                arr.remove(t);
            }
            String ask = JOptionPane.showInputDialog("Enter 1 to change seats ");
        }
        String TotalSeats = JOptionPane.showInputDialog("Enter the total number of seats in the train ");
        String AvailableSeats = JOptionPane.showInputDialog("Enter the number of seats available");
        String bookedSeats = JOptionPane.showInputDialog("Enterthe number of reserved seats ");
        String DepTime = JOptionPane.showInputDialog("Enter the exact time the train is expected to leave");
        String Destination = JOptionPane.showInputDialog("Where is the train headed to");
        String Distance = JOptionPane.showInputDialog("total Distance train will travel ");
        String stops = JOptionPane.showInputDialog("where will the train stop for few minutes ");
        String totalPassengers = JOptionPane.showInputDialog("Total passengers traveling");

        arr.add(new train(LicenceNumber, TotalSeats, AvailableSeats, bookedSeats, DepTime, Destination, Distance, stops, totalPassengers));

    }




package railwayrecord1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI extends Run implements ActionListener {

    public GUI() {
        initGUI();
    }
    JFrame frame;
    JButton b1, b2, b3, b4, b5, b6;
    JPanel p;
    JLabel lab;

    public void initGUI() {
        frame = new JFrame("Railway Record Managment");
        b1 = new JButton("Add ");
        b2 = new JButton("Search");
        b3 = new JButton("Delete");
        b4 = new JButton("Modify data");
        b5 = new JButton("Showall");
        b6 = new JButton("exit");

        lab = new JLabel("Railway Record Managment", SwingConstants.CENTER);

        p = new JPanel(new GridLayout(3, 3));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);

        Container con = frame.getContentPane();
        con.setLayout(new BorderLayout());

        con.add(lab, BorderLayout.NORTH);

        con.add(p, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            add();
        }
        if (ae.getSource() == b2) {
            Search();
        }
        if (ae.getSource() == b3) {
            Delete();
        }

        if (ae.getSource() == b4) {
            modify();
        }
        if (ae.getSource() == b5) {
            ShowAll();

        }
        if (ae.getSource() == b6) {
            SaveData();
            System.exit(0);

        }

    }

}

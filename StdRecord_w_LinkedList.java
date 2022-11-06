public class StudentRecord {

    class Student {

        String Name, Uni, Batch, Department;
        double GPA;
        int fees, Roll_No, Age;
        Student next;

        public Student(String Name, int Age, int Roll_No, String Uni, String Batch, String Department, double GPA, int fees) {
            this.Name = Name;
            this.Age = Age;
            this.Roll_No = Roll_No;
            this.Uni = Uni;
            this.Batch = Batch;
            this.Department = Department;
            this.GPA = GPA;
            this.fees = fees;
        }

    }
    Student head = null;
    Student tail = null;

    //Add Function 
    public void add(String Name, int Age, int Roll_No, String Uni, String Batch, String Department, double GPA, int fees) {
        Student std = new Student(Name, Age, Roll_No, Uni, Batch, Department, GPA, fees);
        if (head == null) {
            head = std;
            tail = std;

        } else {
            tail.next = std;
            tail = std;
        }
    }

    public void display() {
        Student temp = head;
        if (temp == null) {
            System.out.println("LIst is empty");
        } else {
            while (temp != null) {
                System.out.println("Student Name          =" + temp.Name);
                System.out.println("Student Roll Number   =" + temp.Roll_No);
                System.out.println("Student Age           =  " + temp.Age);
                System.out.println("Student Batch         = " + temp.Batch);
                System.out.println("Student Department    =" + temp.Department);
                System.out.println("Student  GPA          =" + temp.GPA);
                System.out.println("Student Fees          =" + temp.fees);
                System.out.println("Student Universty     = " + temp.Uni);
                System.out.println("_______________________");
                temp = temp.next;
            }
        }
    }

    public void Search() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  Registration Number ");
        int RollNum = s.nextInt();
        Student temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                if (temp.Roll_No == RollNum) {
                    System.out.println("Student Name " + temp.Name);
                    System.out.println("Student Roll Number " + temp.GPA);
                    System.out.println("Student Age " + temp.Age);
                    System.out.println("Student Batch " + temp.Batch);
                    System.out.println("Student Department " + temp.Department);
                    System.out.println("Student  GPA" + temp.GPA);
                    System.out.println("Student Fees " + temp.fees);
                    System.out.println("Student Universty " + temp.Uni);
                    System.out.println("_______________________");
                    temp = temp.next;
                } else {
                    System.out.println("No Data Found !");
                    System.out.println("_______________");
                }
            }
        }

    }

    public void Highest_GPA() {
        Student temp = head;
        double Highest = head.GPA;
        Student current = temp;
        if (head == null) {
            System.out.println("Record empty");
        } else {
            while (temp != null) {
                if (temp.GPA > Highest) {
                    Highest = temp.GPA;
                    current = temp;
                }
                temp = temp.next;
            }

        }
        System.out.println(" ");
        System.out.println("Record Of Student with HIghest GPA");
        System.out.println("___________________________________");
        System.out.println("Student Name " + current.Name);
        System.out.println("Student Roll Number " + current.Roll_No);
        System.out.println("Student Age " + current.Age);
        System.out.println("Student Batch " + current.Batch);
        System.out.println("Student Department " + current.Department);
        System.out.println("Student  GPA" + current.GPA);
        System.out.println("Student Fees " + current.fees);
        System.out.println("Student Universty " + current.Uni);
        System.out.println("_______________________");

    }

    public void Total_Record() {
        Student temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        System.out.println("Total Records are  =" + size);

    }

    public void delete() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Full Registration Number to delete Record ");
        int RollNum = s.nextInt();
        Student p = head;
        Student q = head.next;

        while (q.Roll_No != RollNum && q.next != null) {
            p = p.next;
            q = q.next;
        }
        if (q.Roll_No == RollNum) {
            p.next = q.next;

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentRecord stud = new StudentRecord();

        while (true) {
            System.out.println("------MENU------");
            System.out.println("----------------");
                    System.out.println("Enter 1 to add Record " + "\n"
                + "Enter 2 to Search " + "\n"
                + "Enter 3 for highest GPA" + "\n"
                + "Enter 4 to Show Size of Record" + "\n"
                + "Enter 5 to Delete Record" + "\n"
                + "Enter 6 to Display" + "\n"
                + "Enter 0 to exit");
            System.out.println("_________________");
        int input = s.nextInt();
            switch (input) {
                case 1:
                    String nam,
                     uni,
                     Batch,
                     Dep;
                    int roll,
                     age,
                     fees;
                    double gpa;
                    System.out.println("");
                    System.out.println("RECORD INSERTION");
                    System.out.println("__________________");
                    System.out.println("Enter Name");
                    nam = s.next();
                    System.out.println("Enter Roll Number");
                    roll = s.nextInt();
                    System.out.println("Enter GPA");
                    gpa = s.nextDouble();
                    System.out.println("Enter Age");
                    age = s.nextInt();

                    System.out.println("Enter Batch");
                    Batch = s.next();
                    System.out.println("Enter Department");
                    Dep = s.next();
                    System.out.println("Enter Fees");
                    fees = s.nextInt();
                    System.out.println("Enter Universty");
                    uni = s.next();

                    stud.add(nam, age, roll, uni, Batch, Dep, gpa, fees);
                    break;
                case 2:
                    stud.Search();
                    break;
                case 3:
                    stud.Highest_GPA();
                    break;
                case 4 :
                    stud.Total_Record();
                    break;
                case 5 :
                    stud.delete();
                    break;
                case 6 :
                    System.out.println("________________________");
                    System.out.println("STUDENT RECORD MANAGMENT");
                    System.out.println("________________________");
                    stud.display();
                    break;
                case 0:
                    System.exit(0);
                     break;
                default:
                    System.out.println("INVALID INPUT ");
                            

            }
        }
    }

}




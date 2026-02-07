import java.util.Scanner;

class Student {
   

    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    
    // TODO: Create a method or use direct access to print details in the required format

	String name;
    int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

public class StudentClass {
    
        
        // TODO: Read name1
        // TODO: Read rollNo1
        // Hint: Handle the newline consumption if using nextLine() after nextInt()
        
        // TODO: Read name2
        // TODO: Read rollNo2
        
        // TODO: Create two Student objects
        
        // TODO: Print details for both students

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        int roll1 = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        String name2 = sc.nextLine();
        int roll2 = sc.nextInt();
        Student s1 = new Student(name1, roll1);
        Student s2 = new Student(name2, roll2);

        s1.display();
        s2.display();

        sc.close();
    }  
    
}

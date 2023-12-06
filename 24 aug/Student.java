
//WAP to search given student name is available in the list of student name using String array
import java.util.Scanner;   //package declared

class Student { // class declared
    public static void main(String args[]) {
        String[] Name = new String[10]; // String Array declared
        String check; // Variables declared
        int count = 0;
        Scanner sc = new Scanner(System.in); // Scanner object declared
        System.out.println("Enter the student's name"); // asking input to enter the student's name

        // using loop to store the students's name
        for (int i = 0; i < 10; i++) {
            Name[i] = sc.nextLine();

        }
        // asking input to check  the student name is in the list or not
        System.out.println("Enter the student name you want to check is in the list or not"); 
                                                                                            
        check = sc.next();

        // Using loop to check the input enter name is on the list or not
        for (int i = 0; i < 10; i++) {
            if (Name[i].equals(check)) // if input entered name is present on the list then this condition becomes true
            {
                count++; // it counts the index position of the student
            }

        }
        if (count > 0) // If condition becomes true then this line will print
        {

            System.out.println("The person name: " + check + "is in the list \n its position is : " + count + "Position");
        } else // otherwise this line will print
        {
            System.out.println("The person name is not in the list");
        }
    }
}

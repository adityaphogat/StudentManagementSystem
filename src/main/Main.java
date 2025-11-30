package main;

import java.util.Scanner;
import service.StudentManager;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      StudentManager var1 = new StudentManager();
      Scanner var2 = new Scanner(System.in);
      System.out.println("Initializing System...");
      var1.loadFromFile();

      while(true) {
         System.out.println("\n===== KRMU Student Menu =====\n");
         System.out.println("1. Add Student");
         System.out.println("2. View All Students");
         System.out.println("3. Search by Name");
         System.out.println("4. Delete by Name");
         System.out.println("5. Sort by Marks");
         System.out.println("6. Save and Exit");
         System.out.print("\nEnter choice: ");
         switch (var2.nextLine()) {
            case "1":
               var1.addStudent();
               break;
            case "2":
               var1.viewAllStudents();
               break;
            case "3":
               var1.searchStudent();
               break;
            case "4":
               var1.deleteStudent();
               break;
            case "5":
               var1.sortStudentsByMarks();
               break;
            case "6":
               var1.saveToFile();
               System.out.println("\nExiting application. Goodbye!");
               var2.close();
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice. Please enter 1-6.");
         }
      }
   }
}
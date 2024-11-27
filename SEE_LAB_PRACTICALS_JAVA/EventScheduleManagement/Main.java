import java.util.*;

/**
 * This class is the main class.
 * @author Gaurav B. Dichwalkar
 * @version 1.0

 */

public class Main {
    public static void main(String[] args){
        EventManagement obj = new EventManagement();
        int choice;
        Scanner inp = new Scanner(System.in);


        do{
            System.out.println("*******************************************************************************");
            System.out.println("                        Event Management System");
            System.out.println("*******************************************************************************");
            System.out.println();

            while (true) {
                try {
                    System.out.println("1 - Enter the event schedule.");
                    System.out.println("2 - Display event schedule.");
                    choice = inp.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input must be integer");
                    inp.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    obj.insert();
                    break;

                case 2:
                    obj.display();
                    break;

                case 3:
                    choice = 0;
                    break;
            
                default:
                    System.out.println("Invalid Input. Input must be from the menu.");
                    break;
            }
        } while(choice!=0);

    }
}

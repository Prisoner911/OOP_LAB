import java.util.*;

/**
 * This class manages the insertion and displaying of the event scheduling in the list.
 * @author Gaurav B. Dichwalkar
 * @version 1.0
 */

public class EventManagement extends Event {

    /**
     * A constructor which passes empty values to the super class.
     */
    public EventManagement(){
        /**
         * super method used to pass empty values to the super class.
         */
        super ("", "", "", "", "", "","");
    }


    /**
     * A list which stores the objects of Event class.
     */
    public List<Event> eveList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    /**
     * Insert method to insert timings of events and other details.
     */
    public void insert(){
        String date, eventName, tutorialTime, recessTime, papersTime, workshopTime, workshop_2Time; 
        /**
         * Try catch block is used with while loop so that any excetions can be handled.
         */
        
        while (true) {
            try {
                System.out.println("Enter date : ");
                date = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();

            }
        }

        while (true) {
            try {
                System.out.println("Enter event name: ");
                eventName = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();

            }
        }

        while (true) {
            try {
                System.out.println("Enter tutorial Time : ");
                tutorialTime = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();

            }
        }

        while (true) {
            try {
                System.out.println("Enter recess time/ poster presentation time (Poster Presentations may be held during recess) : ");
                recessTime = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();

            }
        }

        while (true) {
            try {
                System.out.println("Enter paper presentation time : ");
                papersTime = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();

            }
        }

        while (true) {
            try {
                System.out.println("Enter workshop 1 Time : ");
                workshopTime = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();

            }
        }

        while (true) {
            try {
                System.out.println("Enter workshop 2 Time : (If there is no second workshop, then enter none)");
                workshop_2Time = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();

            }
        }

        /**
         * Making the object of Event class and passing the values in that object.
         */
        Event<String> obj = new Event<>(date, eventName, tutorialTime, recessTime, papersTime, workshopTime, workshop_2Time);

        /**
         * add method for list. Adds the obj to the list.
         */
        eveList.add(obj);
        
        
    }


    /**
     * Display method to display the events for the day.
     * Takes input a date and shows all the schedule of that day.
     */
    public void display(){
        String date;
        int flag = 1;

        /**
         * try catch block with while loop to ensure exceptions are handled properly.
         */
        while (true) {
            try {
                System.out.println("Enter the date to display the schedule for that day : ");
                date = input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }

        /**
         * for each loop to iterate through the list.
         */

        for (Event event : eveList) {
            if(event.date.equals(date) && event.eventName.equals("ICON")){
                System.out.println("************************************************************************************************************************");
                System.out.println("                                        " + event.eventName);
                System.out.println("************************************************************************************************************************");
                System.out.println("  Time                      -----           Event ");
                 System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.tutorialTime + "         ----- " + "Tutorials - 1 tutorial per hour");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.recessTime + "           ----- " + "Recess/Poster Presentations - 10 posters - 1 poster per 6 minutes (1 hour recess)");
                 System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.papersTime + "           ----- " + "Papers Presentation - 6 Papers in 3 hours. 1 paper per 20 minutes");
                 System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.workshopTime + "         ----- " + "Workshop");
                System.out.println("*************************************************************************************************************************");
                System.out.println("                                            END" );
                System.out.println("*************************************************************************************************************************");
            }

            else if(event.date.equals(date) && (event.date.equals("18/12/2024") || event.date.equals("18/12/24")) && event.eventName.equals("FIRE")){
                System.out.println("************************************************************************************************************************");
                System.out.println("                                        " + event.eventName);
                System.out.println("************************************************************************************************************************");
                System.out.println("  Time                      -----           Event ");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.workshopTime + "         ----- " + "Workshop 1");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.recessTime + "           ----- " + "Recess");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.workshop_2Time + "         ----- " + "Workshop 2");
                System.out.println("*************************************************************************************************************************");
                System.out.println("                                            END" );
                System.out.println("*************************************************************************************************************************");


            }
            
            else if(event.date.equals(date) && event.eventName.equals("FIRE")){
                System.out.println("***********************************************************************************************************************");
                System.out.println("                                        " + event.eventName);
                System.out.println("***********************************************************************************************************************");
                System.out.println(event.papersTime + "           -----   Papers Presentation - 6 Papers in 3 hours. 1 paper per 30 minutes");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.recessTime + "           -----  + Recess");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                // used same as recess time as I have assigned same amount of time as recess time for poster presentaions.
                System.out.println(event.recessTime + "         ----- Poster Presentations - 5 poster presentations - 1 poster per 12 minutes (1 hour recess)");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(event.workshopTime + "         -----  Workshop");
                System.out.println("*************************************************************************************************************************");
                System.out.println("                                            END" );
                System.out.println("*************************************************************************************************************************");                   
            }

            else{
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("Event not found");
        }

    }
}

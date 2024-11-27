/**
 * This class acts like a custom data type which stores different atrributes of the event.
 * This class is using Generics.
 * @author Gaurav B. Dichwalkar
 * @version 1.0


 */


public class Event<T> {

    /**
     * Date of the event
     */
    public T date;
    /**
     *  Name of the conference
     */
    public T eventName;
    /**
     * Tutorial Time
     */
    public T tutorialTime;
    /**
     *  Recess Time as well as poster presentation time
     */
    public T recessTime; 
    /**
     *  Paper presentation Time
     */
    public T papersTime; 
    /**
     * Workshop time
     */
    public T workshopTime; 
    /**
     *  2nd workshop time if there is any to be held.
     */
    public T workshop_2Time;


    /**
     * A constructor that assigns values to the attributes of this class.
     * @param date Date of the event
     * @param eventName Name of the conference
     * @param tutorialTime Tutorial Time
     * @param recessTime Recess Time as well as poster presentation time
     * @param papersTime Paper presentation Time
     * @param workshopTime Workshop time
     * @param workshop_2Time 2nd workshop time if there is any to be held.
     */
    public Event(T date, T eventName, T tutorialTime, T recessTime, T papersTime, T workshopTime,T workshop_2Time){
        this.date = date;
        this.eventName = eventName;
        this.tutorialTime = tutorialTime;
        this.recessTime = recessTime;
        this.papersTime = papersTime;
        this.workshopTime = workshopTime;
        this.workshop_2Time = workshop_2Time;
    }
}
/*
 * Class: Bagger.java
 * impute the bagger name, bagger start time, is bagger a minor, bagger break time. Using military time.
 */

public class Bagger {

    // Instance variables
    private String name;
    private boolean IsMinor;
    private int StartTime;
    private int BreakTime; 

    // Static variable to count total number of Bagger instances
    public static int totalBaggers;

    // Constructor
    Bagger(String name, boolean IsMinor, int StartTime, int BreakTime){

        this.name = name;
        this.IsMinor = IsMinor;
        this.StartTime = StartTime;
        this.BreakTime = BreakTime;

        // Increment the total number of baggers whenever a new object is created
        totalBaggers++;
    }

    // Getter methods
    public String getName(){
        return name; 
    }

    public boolean getIsMinor(){
        return IsMinor;
    }

    public int getStartTime(){
        return StartTime;
    }

    public int getBreakTime(){
        return BreakTime; 
    }
}
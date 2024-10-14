/*
 * Class: Bagger.java
 * impute the bagger name, bagger start time, is bagger a minor, bagger break time. Using military time.
 */

public class Bagger {

    private String name;
    private boolean IsMinor;
    private int StartTime;
    private int BreakTime; 
    public static int totalBaggers;

    Bagger(String name, boolean IsMinor, int StartTime, int BreakTime){

        this.name = name;
        this.IsMinor = IsMinor;
        this.StartTime = StartTime;
        this.BreakTime = BreakTime;

        totalBaggers++;
    }

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
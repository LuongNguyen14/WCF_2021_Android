package com.example.wcf.models;

//this class is object of the activity
public class DayActivity {
    String activityName, description,timeFrom,timeTo;

    public DayActivity(String activityName, String description, String timeFrom, String timeTo) {
        this.activityName = activityName;
        this.description = description;
        this.timeFrom=timeFrom;
        this.timeTo = timeTo;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getDescription() {
        return description;
    }
    public  String getTimeFrom(){
        return timeFrom;
    }
    public String getTimeTo() { return timeTo; }
}


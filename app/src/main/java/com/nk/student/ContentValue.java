package com.nk.student;



public class ContentValue {
    private String activityName;
    private Class className;

    public ContentValue(String activityName, Class className) {
        this.activityName = activityName;
        this.className = className;
    }

    public String getActivityName() {
        return activityName;
    }

    public Class getClassName() {
        return className;
    }

}

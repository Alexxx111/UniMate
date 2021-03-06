package com.unimate.model;

/**
 * Created by Hans Vader on 01.11.2016.
 */
public class Event {

    private String name, description, location, modulSymbol, modulName, modulID;
    private int memberCount, startHour, startMinute, endHour, endMinute, modulCp, modulSemester;
    private double latitude, longitude;

    public Event() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getModulSymbol() {
        return modulSymbol;
    }

    public void setModulSymbol(String modulSymbol) {
        this.modulSymbol = modulSymbol;
    }

    public String getModulName() {
        return modulName;
    }

    public void setModulName(String modulName) {
        this.modulName = modulName;
    }

    public int getModulCp() {
        return modulCp;
    }

    public void setModulCp(int modulCp) {
        this.modulCp = modulCp;
    }

    public int getModulSemester() {
        return modulSemester;
    }

    public void setModulSemester(int modulSemester) {
        this.modulSemester = modulSemester;
    }

    public String getModulID() {
        return modulID;
    }

    public void setModulID(String id) {
        this.modulID = id;
    }
}

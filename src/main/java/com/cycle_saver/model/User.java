package com.cycle_saver.model;

import java.util.ArrayList;

public class User {

    private int id;
    private int athleteId;
    private String token;
    private ArrayList<Journey> journeys;
    private int totalSavings;

    public User (int id) {
        this.id = id;
    }

    //TODO Remove this
    public User(int athleteId, String token) {
        this.athleteId = athleteId;
        this.token = token;
        this.journeys = new ArrayList<Journey>();
    }

    public int getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(int athleteId) {
        this.athleteId = athleteId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ArrayList<Journey> getJourneys() {
        return journeys;
    }

    public void addJourney(Journey journey) {
        this.journeys.add(journey);
    }

    public void setJourneys(ArrayList<Journey> journeys) {
        this.journeys = journeys;
    }

    public int getTotalSavings() {
        return totalSavings;
    }

    public void setTotalSavings(int totalSavings) {
        this.totalSavings = totalSavings;
    }

    public void calculateTotalSavings() {
        this.journeys.forEach(journey -> this.totalSavings =+ journey.getTotalCost());
    }
}

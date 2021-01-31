package com.marcobehler;

import java.util.List;

public class Potus {
    private String firstName;
    private String lastName;
    private int electionYear;
    private String party;
    private List<Wife> wife;

    public Potus(String firstName,String lastName, int electionYear, String party){
        this.electionYear = electionYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
    }
    public Potus(String firstName, String lastName, int electionYear, String party, List<Wife> wife){
        this.electionYear = electionYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
        this.wife = wife;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getElectionYear() {
        return electionYear;
    }

    public String getParty() {
        return party;
    }
    public List<Wife> getWife(){
        return wife;
    }
}

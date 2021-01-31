package streamPotus.comMarcobehler;

import java.util.List;

public class Potus {

    private  String firstName;
    private  String lastName;
    private int electionYear;
    private String party;
    private List<Wife> wife;

    public Potus(String firstName,String lastName, int electionYear, String party){
        this.electionYear = electionYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
    }
    public Potus(String firstName, String lastName, int electionYear,String party,List<Wife> wife){
        this.firstName = firstName;
        this.lastName = lastName;
        this.electionYear = electionYear;
        this.party = party;
        this.wife = wife;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getElectionYear() {
        return electionYear;
    }

    public void setElectionYear(int electionYear) {
        this.electionYear = electionYear;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public List<Wife> getWife() {
        return wife;
    }

    public void setWife(List<Wife> wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Potus{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", electionYear=" + electionYear +
                ", party='" + party + '\'' +
                '}';
    }
}

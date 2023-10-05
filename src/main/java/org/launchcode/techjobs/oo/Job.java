package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job () {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString() {
        String idValue = "ID: " + getId() + "\n";
        String nameValue = "Name: " + (getName() != null && !getName().isEmpty() ? getName() : "Data not available") + "\n";
        String employerValue = "Employer: " + (getEmployer() != null && !getEmployer().toString().isEmpty() ? getEmployer().toString() : "Data not available") + "\n";
        String locationValue = "Location: " + (getLocation() != null && !getLocation().toString().isEmpty() ? getLocation().toString() : "Data not available") + "\n";
        String positionTypeValue = "Position Type: " + (getPositionType() != null && !getPositionType().toString().isEmpty() ? getPositionType().toString() : "Data not available") + "\n";
        String coreCompetencyValue = "Core Competency: " + (getCoreCompetency() != null && !getCoreCompetency().toString().isEmpty() ? getCoreCompetency().toString() : "Data not available");

        return lineSeparator() + idValue + nameValue + employerValue + locationValue + positionTypeValue + coreCompetencyValue + lineSeparator();
    }
}

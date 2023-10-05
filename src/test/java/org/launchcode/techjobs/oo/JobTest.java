package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    // TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job job = new Job("Product tester", employer, location, positionType, coreCompetency);

        String jobString = job.toString();


        assertTrue(jobString.startsWith("\n"));
        assertTrue(jobString.endsWith("\n"));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job job = new Job("Product tester", employer, location, positionType, coreCompetency);


        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals(employer, job.getEmployer());
        assertEquals(location, job.getLocation());
        assertEquals(positionType, job.getPositionType());
        assertEquals(coreCompetency, job.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");


        Job job1 = new Job("Product tester", employer, location, positionType, coreCompetency);
        Job job2 = new Job("Product tester", employer, location, positionType, coreCompetency);


        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job job = new Job("Product tester", employer, location, positionType, coreCompetency);

        // Define the expected output
        String expected = "\n" +
                "ID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" +
                "Employer: " + job.getEmployer() + "\n" +
                "Location: " + job.getLocation() + "\n" +
                "Position Type: " + job.getPositionType() + "\n" +
                "Core Competency: " + job.getCoreCompetency() +
                "\n";
        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        // Create a Job object with an empty name
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job job = new Job("", employer, location, positionType, coreCompetency);


        String expected = "\n" +
                "ID: " + job.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: " + job.getEmployer() + "\n" +
                "Location: " + job.getLocation() + "\n" +
                "Position Type: " + job.getPositionType() + "\n" +
                "Core Competency: " + job.getCoreCompetency() + "\n";

        assertEquals(expected, job.toString());
    }
}

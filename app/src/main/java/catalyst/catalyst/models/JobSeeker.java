package catalyst.catalyst.models;

import java.util.ArrayList;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class JobSeeker extends User {

    private float GPA;
    private String name;
    private String school;
    private ArrayList<String> skills;

    public JobSeeker(String username, int password) {
        super(username, password);
        skills = new ArrayList<String>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public float getGPA() {
        return GPA;
    }


    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }
}

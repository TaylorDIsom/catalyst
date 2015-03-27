package catalyst.catalyst.models;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class Employer extends User {

    private int size;
    private String description;

    public Employer(String username, int password) {
        super(username, password);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

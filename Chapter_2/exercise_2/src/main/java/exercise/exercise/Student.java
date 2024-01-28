package exercise.exercise;

public class Student {

    private String firstName;
    private String lastName;

    public Student (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        firstName = this.firstName;
    }

    public void setLastName(String lastName) {
        lastName = this.lastName;
    }

    @Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}

}

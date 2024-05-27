import javax.naming.Name;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        }
    }

    @Override
    public String toString() {
        if (middleName == null) {
            return firstName + " " + lastName;
        } else return firstName + " " + middleName + " " + lastName;
    }
}

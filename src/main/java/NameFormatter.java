public class NameFormatter {
    private NameFormatter() {
      }

    public static String format(String firstname, String lastname) {
    return lastname + ", " + firstname;
    }

    public static String format(String prefix, String firstName, String middleName,String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;

    }
    //TODO: wrong logic used (how does it know if itsnt firstname, lastname and suffix)
    public static String format(String prefix, String firstName, String lastName) {
        if (prefix.endsWith(".")) {
            return lastName + ", " + prefix + " " + firstName;
        } else {
            // its firstname, lastname  and suffix
            return firstName + ", " + prefix + " " + lastName /*ACTUALLY A SUFFIX NOT A PREFIX */;
            }
        //todo: what if its in firstname, middle name, lastname format
    }
    public static String format(String prefix, String firstName, String middleName, String lastName) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName;
    }

    public static String format(String fullName) {
        String[] nameParts = fullName.split(" ");

        String prefix = nameParts[0];
        String firstName = nameParts[1];
        String middleName = nameParts[2];
        String lastName = nameParts[3];
        String suffix = nameParts[4];
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }
}

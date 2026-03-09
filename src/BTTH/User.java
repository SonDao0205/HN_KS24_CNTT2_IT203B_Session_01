package BTTH;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static User registerUser(String name, String ageStr, String email)
            throws InvalidAgeException, InvalidEmailException {

        int age = Integer.parseInt(ageStr);

        if (age < 18) {
            throw new InvalidAgeException("Tuổi không hợp lệ.");
        }

        if (email == null || !email.contains("@")) {
            throw new InvalidEmailException("Email không hợp lệ.");
        }

        return new User(name, age, email);
    }
}
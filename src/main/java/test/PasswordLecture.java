package test;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordLecture {
    public static void main(String[] args) {
        String plainTextPassword = "somepassword123";

        String hashedPassword = BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());

        System.out.println(hashedPassword);

        boolean passwordsMatch = BCrypt.checkpw("dkjkdja", hashedPassword);
        System.out.println(passwordsMatch);

        boolean passwordMatch1 = BCrypt.checkpw(plainTextPassword, hashedPassword);
        System.out.println(passwordMatch1);

    }

}

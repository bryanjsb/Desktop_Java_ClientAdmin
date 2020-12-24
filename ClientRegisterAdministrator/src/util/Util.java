package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    private static final String REGEXALFANUMERIC = "^[a-zA-Z0-9]+$";

    public static Boolean validateUser(String user) {
        Pattern pattern;
        pattern = Pattern.compile(REGEXALFANUMERIC);
        Matcher matcher = pattern.matcher(user);
        return matcher.matches();
    }

    public static Boolean validatePassword(String pass) {
        PasswordValidator.buildValidator(true, true, true, 4, 10);
        return PasswordValidator.validatePassword(pass);
    }
}

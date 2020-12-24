package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PasswordValidator {

    private static final PasswordValidator INSTANCE = new PasswordValidator();
    private static String pattern = null;
    private static int minLength = 0, maxLength = 0;

    /**
     * No one can make a direct instance
     *
     */
    private PasswordValidator() {
        //do nothing
    }

    /**
     * Force the user to build a validator using this way only
     *
     */
    public static PasswordValidator buildValidator(boolean forceSpecialChar,
            boolean forceCapitalLetter,
            boolean forceNumber,
            int min,
            int max) {
        StringBuilder patternBuilder = new StringBuilder("((?=.*[a-z])");

        if (forceSpecialChar) {
            patternBuilder.append("(?=.*[@#$%])");
        }

        if (forceCapitalLetter) {
            patternBuilder.append("(?=.*[A-Z])");
        }

        if (forceNumber) {
            patternBuilder.append("(?=.*d)");
        }

        minLength = min;
        maxLength = max;
        patternBuilder.append(".{").append(minLength).append(",")
                .append(maxLength).append("})");
        pattern = patternBuilder.toString();

        return INSTANCE;
    }

    /**
     * Here we will validate the password
     *
     */
    public static boolean validatePassword(final String password) {

        try {
            if (password.length() < minLength) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.printf("La contraseña es menor de %d", minLength);
        }

        try {
            if (password.length() > maxLength) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.printf("La contraseña es mayor de %d", maxLength);
        }

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        return m.matches();
    }
}

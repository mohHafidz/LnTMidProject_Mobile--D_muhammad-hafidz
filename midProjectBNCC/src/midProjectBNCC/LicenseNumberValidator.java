package midProjectBNCC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicenseNumberValidator {
    private static final String REGEX = "^[A-Z]\\s\\d{1,4}\\s[A-Z]{1,3}$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public static boolean isValid(String licenseNumber) {
        Matcher matcher = PATTERN.matcher(licenseNumber);
        return matcher.matches();
    }
}

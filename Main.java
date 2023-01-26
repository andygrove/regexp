import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("TEST$");
        String data[] = new String[] { "TEST", "TEST\n", "TEST\u0085", "TEST\u0085\n", "TEST\n\u0085" };
        for (int i = 0; i < data.length; i++) {
            String datum = data[i];
            Matcher m = pattern.matcher(datum);
            System.out.println(m.matches());
        }
    }
}
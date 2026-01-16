package problem.solving.random;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeDecodeStrings {

    public static void main(String[] args) {
        List<String> strs = List.of("neet", "code", "love", "you");
        String result = encode(strs);
        System.out.println(result);
        List<String> decode = decode(result);
        System.out.println(decode);
    }

    public static String encode(List<String> strs) {
        return strs.stream().map(str -> str.length() + "#" + str).collect(Collectors.joining());
    }

    public static List<String> decode(String str) { //5#hello6#world!2##!
        List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            // Find the position of the '#'
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j)); // parse the length  5
            j++; // move past '#'
            strs.add(str.substring(j, j + length)); // extract the actual string  2,2+5    "hello"
            i = j + length; // move to the next encoded string
        }
        return strs;
    }
}

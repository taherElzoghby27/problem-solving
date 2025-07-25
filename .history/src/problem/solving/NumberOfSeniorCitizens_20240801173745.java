package problem.solving;

public class NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            int n1 = details[i].charAt(11) - 48;
            int n2 = details[i].charAt(12) - 48;
            System.out.println(n1+"--------"+n2);
            if (n1 >= 6 && n2 > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details = {"1313579440F2036","2921522980M5644"};
        int c = countSeniors(details);
        System.out.println(c);
    }
}

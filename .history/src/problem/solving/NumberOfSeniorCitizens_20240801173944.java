package problem.solving;

public class NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            int n1 = details[i].charAt(11) - 48;
            int n2 = details[i].charAt(12) - 48;
            if (n1 >= 6 && n2 > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        int c = countSeniors(details);
        System.out.println(c);
    }
}

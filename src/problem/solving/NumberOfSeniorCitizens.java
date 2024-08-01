package problem.solving;

public class NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            int age = getAgeFromDetail(detail);
            if (age > 60) {
                count++;
            }
        }
        return count;
    }

    private static int getAgeFromDetail(String detail) {
        int ageDigit1 = Character.getNumericValue(detail.charAt(11));
        int ageDigit2 = Character.getNumericValue(detail.charAt(12));
        return ageDigit1 * 10 + ageDigit2;
    }

    public static void main(String[] args) {
        String[] details = { "5612624052M0130", "5378802576M6424", "5447619845F0171", "2941701174O9078" };
        int c = countSeniors(details);
        System.out.println(c);
    }
}

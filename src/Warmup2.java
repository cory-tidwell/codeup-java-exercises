public class Warmup2 {
    public static void main(String[] args) {
        new Warmup2("1 2 3 4 -7 5");
    }
    public Warmup2(String num) {
//        int max = Character.getNumericValue(num.charAt(0));
//        int min = Character.getNumericValue(num.charAt(0));

        int max = Integer.parseInt(num.charAt(0)+"");
        for (int i = 1; i < num.length(); i++) {
            int compare = Integer.parseInt(num.charAt(i)+"");
            if (compare > max) {
                max = compare;
            }
        }
//        for (int i = 1; i < num.length(); i++) {
//            int compare = Character.getNumericValue(num.charAt(i));
//            if (max < compare) {
//                max = compare;
//            }
//            if (min >= compare) {
//                min = compare;
//            }
//        }
        System.out.println(max);
//        System.out.println(min);
    }
}

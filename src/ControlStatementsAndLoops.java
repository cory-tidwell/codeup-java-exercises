public class ControlStatementsAndLoops {
    public static void main(String[] args) {
//        double discountPercent;
//        char letter = 'y';
//        boolean isValid = true;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//// Don't do this!
//        // Do this instead
//        boolean confirmation = userInput.equals("y");
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

    }
}

public class ControlFlow {
    public static void main(String[] args) {
        // if-else
        int number = 10;
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("number is zero");
        }

        // switch
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week");
                break;
            case "Friday":
                System.out.println("End of the work week");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day");
        }

        // for loop
        System.out.print("for loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        System.out.print("while loop: ");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // do-while loop
        System.out.print("do-while loop: ");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println();
    }
}

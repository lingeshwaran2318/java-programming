public class Attendance {

    public static void main(String[] args) {

        int att = 75;
        boolean fees = true;

        if (att >= 75 && fees == true) {
            System.out.println("Allowed");
        }
        else if (att < 75) {
            System.out.println("Low Attendance");
        }
        else if (fees == false) {
            System.out.println("Need to Pay Fees");
        }

    }
}
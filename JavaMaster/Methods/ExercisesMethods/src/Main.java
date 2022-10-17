public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        final double oneMillaTokm = 1.609;
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / oneMillaTokm);
        }
    }


    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0.0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || !barking) {
            return false;

        } else {
            if (hourOfDay >= 8 && hourOfDay <= 22) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 != 0)
                return false;
            if (year % 100 != 0)
                return true;
            if (year % 400 == 0)
                return true;

            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        firstNumber = (int) (firstNumber * 1000);
        secondNumber = (int) (secondNumber * 1000);

        if (firstNumber == secondNumber)
            return true;
        return false;

    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        if ((num1 + num2) == num3)
            return true;

        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {

        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19))
            return true;
        return false;
    }

    public static boolean isTeen(int isTeen) {
        if (isTeen >= 13 && isTeen <= 19)
            return true;
        return false;
    }


}
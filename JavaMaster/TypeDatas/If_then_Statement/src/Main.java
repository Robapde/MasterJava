public class Main {
    public static void main(String[] args) {

        boolean isAlien = false;
        if (!isAlien)  // ! == not
            System.out.println("It is  an alien!");


        int topScore = 20;
        if (topScore > 30 && topScore < 100) { //&& == and
            System.out.println("Greater than second top score and less than 100");
        }

        int secondTopScore = 120;
        if ((topScore > 30 && topScore < 100) || secondTopScore > 100) { // || == or
            System.out.println("Greater than second top score and less than 100 || greater ");
        }


        // Ternary Operator
        boolean isCar = false;

        boolean wasCar = !isCar ? true : false;


    }
}
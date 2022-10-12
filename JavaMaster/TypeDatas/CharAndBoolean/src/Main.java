public class Main {
    public static void main(String[] args) {

        char myChar = 'D'; //single character

        char myUnicodeChar = '\u0044'; //004 row 4 column

        System.out.println("My Char: " + myChar);
        System.out.println("My Unicode: " + myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println("My Copyright Char: " + myCopyrightChar);


        String myString = "This is a string";
        System.out.println( "My String: " +  myString);
        myString +=  ", and this is more";
        System.out.println("my new string: " + myString );
        myString +=  " \u00A9 2019";
        System.out.println("my new string 2: " + myString );

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

    }
}
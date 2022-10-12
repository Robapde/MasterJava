public class Main {
    public static void main(String[] args) {

        int myValue = 10000;


        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);



        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;


        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L; // L le indica al compilador que es un long y no un integer ( pasa de la Keyworld )
        System.out.println(bigLongLiteralValue);


        //casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);


        //Challenge

        byte challengeByteValue = 10 ;
        short challengeShortValue = 20;
        int challengeIntValue = 50;
        long challengeLongValue = 50000L + ( 10L * ( challengeByteValue + challengeShortValue + challengeIntValue));
        System.out.println("Result: " + challengeLongValue);
    }
}
public class Main {
    public static void main(String[] args) {


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimun value = " + myMinFloatValue);
        System.out.println("Float maximun value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimun value = " + myMinDoubleValue);
        System.out.println("Double maximun value = " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // 5.00 / 3.00 también se puede escribir así

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);


        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println("Pi: " + pi );
        System.out.println("Another Number: " + anotherNumber);


        //Challenge pounds --> kg

        double convertPoundsToKg = 0.45359237d; // 1 pouns = 0.45359237kg
        double numeberPountsConvert = 200d;

        double resultConvertPoundsToKg = convertPoundsToKg * numeberPountsConvert;

        System.out.println("Se han convertido: " + numeberPountsConvert + " pounds, en: " + resultConvertPoundsToKg + " kg");
    }
}
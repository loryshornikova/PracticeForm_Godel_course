public class Main {
    public static void main (String[] args){

        String str1 = "My group contains";
        int numberOfStudents = 16;
        String str2 = "persons";

        System.out.println(str1 + numberOfStudents + str2);

        int num1 = 8;
        int num2 = 2;
        String str3 = "8+2 = ";

        System.out.println(num1 + num2);
        System.out.println(str3 + (num1+num2));

        int num3 =5;
        String str4 = "5+5 = ";

        System.out.println(num1+num2);
        System.out.println(str4 + (num3+num3));

        int numberForSqrt = 16;
        double sqrt = Math.sqrt(numberForSqrt);
        String str5 = "sqrt(16) = ";
        String str6 = " ";

        System.out.println(sqrt);
        System.out.println(str5 + sqrt);
        System.out.println(str6);

        int num4 = 3;
        int num5 =28;
        int min = Math.min(num4,num5);
        String str7 = "Math.min(3,28) = ";
        int max = Math.max(num4,num5);
        String str8 = "Math.abs (-16) = ";
        int abs = Math.abs(-16);

        System.out.println(str7 + min); //3
        System.out.println(max); //28
        System.out.println(str8+ abs); //16

    }
}

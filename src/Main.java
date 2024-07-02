import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        double m = 0;
        int k = 0;
        String number = String.valueOf(num);
//        for (char i:
//             number.toCharArray()) {
//            m += Double.parseDouble(String.valueOf(i));
//            k++;
//        }
        for( int i = 0; i < number.length(); i++){
            m += Double.parseDouble(String.valueOf(number.charAt(i)));
            k++;
        }
        return m /k;
    }
}

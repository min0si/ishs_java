import java.util.Scanner;

public class PrimeNumber {
    //숫자 하나를 넘겨 받아 해당 숫자가 소수이면 true, 아니면 false
    public static boolean isPrime(int n) {
        if( n<=1 ) {
            return false;
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i=i+1) {
                if(n % i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {111, 977, 1, 2, 53, 1200};
        for(int number : numbers){
            if(isPrime(number)) {
                System.out.println(number+"is a prime number");
            }
            else{
                System.out.println(number + "is not a prime number");
            }
        }

//        for(int i=0; i<6; i++){
//            if(isPrime(numbers[i])){
//                System.out.println(numbers[i]+"is a prime number");
//            }
//            else {
//                System.out.println(numbers[i] + "is not a prime number");
//            }
//
//        }
    }
}


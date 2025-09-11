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
       //System.out.println(Math.sqrt(25.0));
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isPrime(number)){
            System.out.println(number+"is a prime number");
        }
        else{
            System.out.println(number+"is not a prime number");
        }
    }
}


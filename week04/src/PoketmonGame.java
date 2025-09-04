import java.util.Scanner;

class Poketmon {
    //concrete class (can produce object)
    int hp;
        }

public class PoketmonGame {
    public static void main(String[] args) {
        Poketmon pikachu = new Poketmon();
        //Poketmon squirtle = new Poketmon();

        Scanner scanner = new Scanner(System.in);
        System.out.println("체력을 입력하세요 : ");
        pikachu.hp= scanner.nextInt();
        //squirtle.hp=110;
        //System.out.println(pikachu.hp);
        //System.out.println(squirtle.hp);

        if(pikachu.hp>99) {
            System.out.println("피카츄의 체력("+pikachu.hp+")이 여유!");
        }
        else {
            System.out.println("피카츄의 체력("+pikachu.hp+")이 부족!");
        }
    }
}

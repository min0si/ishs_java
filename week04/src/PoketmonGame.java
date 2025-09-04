class Poketmon {
    //concrete class (can produce object)
    int hp;
        }

public class PoketmonGame {
    public static void main(String[] args) {
        Poketmon pikachu = new Poketmon();
        Poketmon squirtle = new Poketmon();
        Poketmon poketmon = new Poketmon();
        pikachu.hp=100;
        squirtle.hp=110;
        System.out.println(pikachu.hp);
        System.out.println(squirtle.hp);
    }
}

public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Pikachu", 10);
        Pokemon p2 = new Pokemon("Charizard", 69);
        System.out.println(p1.level);
    //p1.name = "Pikachu";
     //p1.level = 10;
    p1.attack();
     //Pokemon p2 = new Pokemon();
    // p2.name = "Charizard";
    // p2.level = 69;
      p2.damage();

    }
}


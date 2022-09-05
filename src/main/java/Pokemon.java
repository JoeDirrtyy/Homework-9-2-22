public class Pokemon {

    String name;
    int level;
    Pokemon(){
        level = 1;
    }
    Pokemon(String pName, int pLevel){
       name = pName;
        level = pLevel;
    }
    void attack(){
        System.out.println(name + " Use Thunderbolt!");
    }
    void damage(){
        System.out.println(name + " Its not very effective..");
    }
}

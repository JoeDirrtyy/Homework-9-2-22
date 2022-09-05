package Homework4;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie("Gone with the Stock " , "Tragic " ,  -2);
        Movie two = new Movie("Lost in Cublicle space ", "Comedy ", 5);
        Movie three = new Movie("Byte Club " , "Tragic but ultimately uplifting ",  127);
        one.playIt();
        two.playIt();
        three.playIt();
    }
}

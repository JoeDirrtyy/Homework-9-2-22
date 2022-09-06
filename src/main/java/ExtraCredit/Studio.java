package ExtraCredit;

public class Studio {

        public static void main(String[] args) {

            String[] beyonceSongs = {"Who runs the world", "Halo", "Thick"};
            Artist artist1 = new Artist("Beyonce", "Universal", beyonceSongs);
            artist1.playPlayList(artist1); // playing somngs by artist 1

            System.out.println("====================================");

            String[] poloGSongs = {"RapStar", "Block-Party"};
            Artist artist2 = new Artist("PoloG", "Interscope", poloGSongs);
            artist2.playPlayList(artist2); //playing songs by artist2


        }
    }


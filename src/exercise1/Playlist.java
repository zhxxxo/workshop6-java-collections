public class Playlist {

    public static void main(String[] args) {

        String[] songs = {
            "Bohemian Rhapsody", "Shape of You",
            "Blinding Lights", "Hotel California",
            "Rolling in the Deep", "Bad Guy",
            "Imagine", "Levitating",
            "Stay", "Hey Jude"
        };

        String[] artists = {
            "Queen", "Ed Sheeran", "The Weeknd",
            "Eagles", "Adele", "Billie Eilish",
            "John Lennon", "Dua Lipa",
            "The Kid LAROI", "The Beatles"
        };

        System.out.println("MY 10 FAVOURITE SONGS");
        System.out.println("---------------------");

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i]
                    + " - " + artists[i]);
        }
    }
}

public class PlaylistSorted {

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

        // Bubble sort: compare song titles and swap both
        // arrays, so every song keeps its own artist.
        for (int pass = 0; pass < songs.length - 1; pass++) {
            for (int i = 0; i < songs.length - 1 - pass; i++) {
                String one = songs[i];
                String two = songs[i + 1];
                if (one.compareToIgnoreCase(two) > 0) {
                    songs[i] = two;
                    songs[i + 1] = one;
                    String t = artists[i];
                    artists[i] = artists[i + 1];
                    artists[i + 1] = t;
                }
            }
        }

        System.out.println("MY SONGS IN ALPHABETICAL ORDER");
        System.out.println("------------------------------");

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i]
                    + " - " + artists[i]);
        }
    }
}

public class Boxes {

    private static final int MAX_SIZE = 10;
    private int size;

    // Constructor that accepts the size of the box.
    public Boxes(int size) {
        setSize(size);
    }

    // Sets the size, but never more than MAX_SIZE.
    public void setSize(int size) {
        if (size < 1) {
            this.size = 1;
        } else if (size > MAX_SIZE) {
            this.size = MAX_SIZE;
        } else {
            this.size = size;
        }
    }

    public int getSize() {
        return size;
    }

    // Returns the size as a String, e.g. "10 x 10".
    public String toString() {
        return size + " x " + size;
    }

    // Draws the box on the console.
    public void draw() {

        // Top and bottom lines: size hyphens.
        String line = "";
        for (int i = 0; i < size; i++) {
            line = line + "-";
        }
        System.out.println(line);

        // Middle rows: pipe, spaces, pipe.
        String middle = "|";
        for (int i = 0; i < size - 2; i++) {
            middle = middle + " ";
        }
        middle = middle + "|";
        for (int row = 0; row < size - 2; row++) {
            System.out.println(middle);
        }

        // Bottom line.
        System.out.println(line);
    }
}

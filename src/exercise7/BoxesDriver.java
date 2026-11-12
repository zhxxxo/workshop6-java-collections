public class BoxesDriver {

    public static void main(String[] args) {

        // Create a 5 x 5 box and draw it.
        Boxes box = new Boxes(5);
        System.out.println("Box size: " + box);
        box.draw();

        // Change the size of the same box and draw it again.
        box.setSize(8);
        System.out.println();
        System.out.println("Box size: " + box);
        box.draw();

        // A size above the maximum is capped at 10.
        Boxes big = new Boxes(15);
        System.out.println();
        System.out.println("15 requested -> " + big);
    }
}

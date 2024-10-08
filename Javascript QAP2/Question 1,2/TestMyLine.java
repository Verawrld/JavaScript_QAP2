public class TestMyLine {
    public static void main(String[] args) {
        // Create two MyPoint objects
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);

        // Create a MyLine object using these points
        MyLine line = new MyLine(p1, p2);

        // Test the methods
        System.out.println("Line: " + line.toString());
        System.out.println("Begin point: " + line.getBegin());
        System.out.println("End point: " + line.getEnd());

        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());

        System.out.println(line.toString());

        // Modify points
        line.setBeginXY(2, 3);
        line.setEndXY(6, 8);

        System.out.println("Updated line: " + line.toString());
        System.out.println("Updated length: " + line.getLength());
    }
}

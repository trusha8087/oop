class Point {

    int x;
    int y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
	System.out.println("Enrollment no. 240390107034");
        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(10, 20);
        p2.display();

        Point p3 = new Point(p2);
        p3.display();
    }
}
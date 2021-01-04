public class Main {

    public static void main(String[] args) {
        //Range range1 = new Range(1, 10);
        Range range1 = new Range(9);
        Range range2 = new Range(2, 2);
        System.out.println(range1);
        System.out.println(range2);
        range1 = new Range(1, 2);
        range2 = new Range(3, 4);
        //range1.setEnd(2);
        //range1.setStart(1);
        //range2.setEnd(4);
        //range2.setStart(3);
        System.out.println(range1);
        System.out.println(range2);
        range1 = new Range(6, 2);
        range2 = new Range(3, 5);
        //range1.setStart(6);
        //range2.setEnd(5);
        System.out.println(range1);
        System.out.println(range2);
    }
}

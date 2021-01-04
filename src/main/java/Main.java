public class Main {

    public static void main(String[] args) {
        Range range1 = new Range(1, 10);
        Range range2 = new Range(2, 1);
        System.out.println(range1);
        System.out.println(range2);
       // System.out.println(range1.getStart());
       // System.out.println(range1.getEnd());
       // System.out.println(range2.getStart());
       // System.out.println(range2.getEnd());
        range1.setEnd(2);
        range1.setStart(1);
        range2.setEnd(4);
        range2.setStart(3);
        System.out.println(range1.getStart());
        System.out.println(range1.getEnd());
        System.out.println(range2.getStart());
        System.out.println(range2.getEnd());
        range1.setStart(6);
        range2.setEnd(5);
        System.out.println(range1.getStart());
        System.out.println(range1.getEnd());
        System.out.println(range2.getStart());
        System.out.println(range2.getEnd());
    }
}

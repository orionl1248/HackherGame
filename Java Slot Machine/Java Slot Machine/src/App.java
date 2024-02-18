public class App {
    public static void main(String[] args) throws Exception {
        Slot n = new Slot(80);
        n.move();
        System.out.println(n);
        System.out.println("input");
        System.out.println(n.input);
        System.out.println("constant");
        System.out.println(n.constant);
        System.out.println("output");
        System.out.println(n.output);
    }
}

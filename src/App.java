public class App {
    public static void main(String[] args) throws Exception {
        display("This is my message");
    }
    private static void display(String msg) {
        int length = msg.length();
        String border = "+";
        for (int i = 0; i < length + 2; i++) {
            border += "-";
        }
        border += "+";
        System.out.println(border);
        System.out.println("| " + msg + " |");
        System.out.println(border);
    }
}

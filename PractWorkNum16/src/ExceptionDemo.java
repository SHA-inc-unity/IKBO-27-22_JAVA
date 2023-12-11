public class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        ThrowsDemo truw = new ThrowsDemo();
        try {
            String result = truw.getDetails("");
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        Exception1 ex1 = new Exception1();
        ex1.exceptionDemo();

        Exception2 ex2 = new Exception2();
        ex2.exceptionDemo();
    }
}

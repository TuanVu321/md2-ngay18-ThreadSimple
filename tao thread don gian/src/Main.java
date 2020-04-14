public class Main {
    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator();
        NumberGenerator n2 = new NumberGenerator();
        Runnable target;
        Thread numbergenerator1 = new Thread(n1);
        Thread numbergenerator2 = new Thread(n2);
//        numbergenerator1.setPriority(Thread.MAX_PRIORITY);
//        numbergenerator2.setPriority(Thread.MIN_PRIORITY);
        numbergenerator1.start();
//        try {
//            numbergenerator1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        numbergenerator2.start();

    }
}

package myPackage;

public class Test_Thread extends Thread {
    private String name;

    public Test_Thread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Test_Thread t1 = new Test_Thread("a");
        Test_Thread t2 = new Test_Thread("b");

        t1.run();
        t2.run();
    }
}

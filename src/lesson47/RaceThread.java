package lesson47;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("here");
        }
        System.out.println("bye");

    }


}

package lesson48;

public class Main48 {
    public static void main(String[] args) throws InterruptedException {

//        MyThreadWithInteraption myThreadWithInteraption = new MyThreadWithInteraption();
//
//        myThreadWithInteraption.start();
//
//        MyThreadWithBoolean myThreadWithBoolean = new MyThreadWithBoolean();
//
//        myThreadWithBoolean.start();
//        Thread.sleep(100);  //affected time between start and set off
//        myThreadWithBoolean.setOff(true);
//        Thread.sleep(10000);  //it doesn't affect

//        MyThreadWithNativeInteraption myThreadWithNativeInteraption = new MyThreadWithNativeInteraption();
//
//        myThreadWithNativeInteraption.start();
//        Thread.sleep(1);
//        myThreadWithNativeInteraption.interrupt();

        ModifiedRaceTread modifiedRaceTread = new ModifiedRaceTread("Bob");
        ModifiedRaceTread modifiedRaceTread2 = new ModifiedRaceTread("Tom");
        ModifiedRaceTread modifiedRaceTread3 = new ModifiedRaceTread("Matt");

        modifiedRaceTread.start();
        modifiedRaceTread2.start();
        modifiedRaceTread3.start();

    }
}

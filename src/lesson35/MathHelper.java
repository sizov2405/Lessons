package lesson35;

public class MathHelper {

    public static int divide (int number, int divider) throws Exception{
        if (divider == 0){
            throw new Exception("Divider can't be 0");
        }
        return number / divider;
    }
}

package lesson36;

public class Main36 {
    public static void main(String[] args) {

        char symbol = 'A';
        System.out.println(symbol);

        String letter = "b";
        String string = "Some message";
        System.out.println(string.contains(letter));
        System.out.println("|" + string.charAt(4) + "|");
        System.out.println(string.toUpperCase());
        System.out.println(string.compareToIgnoreCase("Some MESSagee"));

    }
}

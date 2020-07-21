package lesson9.homework;

public class ProductMain {

    public static void main (String [] args) {
        ProductInformer productInformer = new ProductInformer();
        Product apple = new Apple("Green Apple", Quality.GOOD);
        Product cheese = new Cheese("Blue Cheese", Quality.GOOD);
        Product product = new Product();

        Product [] products = {apple,cheese,product};
        productInformer.getInfoAbout(products);

//        productInformer.getInfoAbout(product);
//        productInformer.getInfoAbout(apple);
//        productInformer.getInfoAbout(cheese);


    }

}

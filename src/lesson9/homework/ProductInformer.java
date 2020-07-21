package lesson9.homework;

public class ProductInformer {
    public void getInfoAbout(Product product){
        System.out.println(product.getDefaultDescription() + " with id: " + product.getProductId() + " has quality: " + product.getQuality());
    }

    public void getInfoAbout (Product [] products){
        for (Product entry : products){
            getInfoAbout(entry);
        }
    }


}

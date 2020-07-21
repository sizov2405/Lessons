package lesson9.homework;

public class Product {
    private long productId;
    private String name;
    private Quality quality;
    private static long countID = 1;

    public Product() {
        this.productId = countID;
        countID++;
    }

    public Product(String name, Quality quality) {
        this();
        this.quality = quality;
        this.name = name;
    }

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(int goodQualityProduct, int currentQuality) {
        this.quality = currentQuality >= goodQualityProduct
                ? Quality.GOOD
                : Quality.BAD;
    }

    public String getDefaultDescription (){
        return "Default product";
    }
}

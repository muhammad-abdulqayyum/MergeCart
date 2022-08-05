import java.util.List;

public class LineItem {

    String productKey;
    String productName;
    int quantity;
    List<Address> shippingDetails;

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Address> getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(List<Address> shippingDetails) {
        this.shippingDetails = shippingDetails;
    }
}

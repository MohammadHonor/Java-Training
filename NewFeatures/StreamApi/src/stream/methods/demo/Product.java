package stream.methods.demo;

public class Product {
  String id;
  String product_name;
  double price;

  public Product(String id, String prod, double p) {
    this.id = id;
    this.price = p;
    this.product_name = prod;
  }
  
  @Override
  public String toString() {
    return "Product [ id =" + id +" name ="+ product_name + " price ="+ price + " ]";
  }
}

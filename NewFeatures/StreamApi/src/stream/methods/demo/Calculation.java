package stream.methods.demo;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
  
  private List<Product> pr = new ArrayList<>();
    
  public void addProducts(String id , String name,double price) {
    pr.add(new Product(id, name, price));
  }
  
  public void display() {
    pr.stream().forEach(p -> System.out.println(p));
  }

  public void increasePrice(double price) {
    pr.stream().forEach((p) -> p.price += price);
  }

  public List<Product> modifiedList(String lasName) {
    List<Product> ls = pr.stream().map((p) -> new Product(p.id, p.product_name + lasName, p.price)).toList();
    return ls;
  }
}

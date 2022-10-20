import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();

    public ProductManagement() {
    }

  /*  public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }*/

    public void add(Product p) {
        products.add(p);
    }

    public Product searchById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println(p);
                return p;
            }
        }
        System.out.println("not found id");
        return null;
    }

    public Product searchByName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void remove(int id) {
        Product p = searchById(id);
        if (p != null) {
            products.remove(p);
        } else {
            System.out.println("not found id");
        }
    }

    public void update(int id, Product newProduct) {
        Product p = searchById(id);
        if (p != null) {
            p.setName(newProduct.getName());
            p.setPrice(newProduct.getPrice());
        } else {
            System.out.println("not found id");
        }
    }

    @Override
    public String toString() {
        return products.toString() + "\n";
    }
}

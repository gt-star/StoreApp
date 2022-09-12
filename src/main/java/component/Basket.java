package component;

import Model.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }
    public void add(List<Product> products){
        this.products.addAll(products);
    }
    public List<Product> get(){
        return Collections.unmodifiableList(products);
    }
}

package Service;

import Model.Product;
import component.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Basket basket;
    private final Map<Integer, Product> product;

    public StoreService(Basket basket) {
        this.basket = basket;
        this.product = Map.of(
                1, new Product(1,"Брелок"),
                2, new Product(2,"Монитор"),
                3, new Product(3,"Очки"),
                4, new Product(4,"Наушники")
        );
    }
    public void add(List<Integer> ids) {
        basket.add(ids.stream()
                .map(product::get)
                .filter(Objects::nonNull)
                .collect(Collectors.toList()));
    }
    public List<Product> get() {
        return basket.get();
    }
}

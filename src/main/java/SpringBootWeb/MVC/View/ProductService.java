package SpringBootWeb.MVC.View;

import SpringBootWeb.MVC.Model.Product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"SAMSUG",90000),
            new Product(103,"NOKIA", 40000)
    ));

    public List<Product> getPorduct()
    {
        return products;
    }

    public Product getProductById(int prodId)
    {
        return products.stream().
                filter(p ->p.getProdId()==prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }

}

package SpringBootJPA.MVC.Serivice;



import SpringBootJPA.MVC.Repository.ProductRepo;
import SpringBootJPA.MVC.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{

    @Autowired
    ProductRepo repo;

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"SAMSUG",90000),
            new Product(103,"NOKIA", 40000)
    ));

    public List<Product> getPorduct()
    {
     return   repo.findAll();
    }

    public Product getProductById(int prodId)
    {
      return  repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod)
    {
        repo.save(prod);
    }

    public void update(Product prod)
    {
        repo.save(prod);
    }


    public void remove(int prodId)
    {
       repo.deleteById(prodId);
    }

}

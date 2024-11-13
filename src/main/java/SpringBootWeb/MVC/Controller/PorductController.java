package SpringBootWeb.MVC.Controller;

import SpringBootWeb.MVC.Model.Product;

import SpringBootWeb.MVC.View.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PorductController
{

     @Autowired
     ProductService service;

     @RequestMapping("/products")
     public List<Product> getProducts()
     {
     return service.getPorduct();
     }

     @RequestMapping("/products/{prodId}")
     public Product getProductById(@PathVariable int prodId)
     {
          return service.getProductById(prodId);
     }

     @PostMapping("/products")
     public void addProduct(@RequestBody Product prod)
     {
          System.out.println(prod);
          service.addProduct(prod);
     }


}

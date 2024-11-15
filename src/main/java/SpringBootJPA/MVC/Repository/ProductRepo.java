package SpringBootJPA.MVC.Repository;



import SpringBootJPA.MVC.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>
{

}

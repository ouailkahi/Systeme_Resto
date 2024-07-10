package ma.webcrea.restaurant.system.repository;

import ma.webcrea.restaurant.system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}

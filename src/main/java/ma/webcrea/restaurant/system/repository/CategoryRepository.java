package ma.webcrea.restaurant.system.repository;

import ma.webcrea.restaurant.system.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,String> {
}

package ma.webcrea.restaurant.system.repository;

import ma.webcrea.restaurant.system.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type,String> {
}

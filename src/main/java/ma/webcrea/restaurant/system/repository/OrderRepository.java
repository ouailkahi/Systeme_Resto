package ma.webcrea.restaurant.system.repository;

import ma.webcrea.restaurant.system.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}

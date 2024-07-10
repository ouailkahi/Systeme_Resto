package ma.webcrea.restaurant.system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "types")
public class Type {

    @Id
    private String name;

    @ManyToMany(mappedBy = "types")
    private Set<Product> products = new HashSet<>();
}

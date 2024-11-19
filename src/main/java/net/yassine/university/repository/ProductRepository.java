package net.yassine.university.repository;

import net.yassine.university.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author $ {USER}
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
}

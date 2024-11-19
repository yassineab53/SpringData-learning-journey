package net.yassine.university;

import net.yassine.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.yassine.university.entities.Product;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {
    @Autowired // pour l'injection des depandances
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "Computer", 4300, 3));
        productRepository.save(new Product(null, "Printer", 1200, 4));
        productRepository.save(new Product(null, "Smart Phone", 1300, 7));
    }
}

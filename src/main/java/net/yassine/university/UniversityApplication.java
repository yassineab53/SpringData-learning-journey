package net.yassine.university;

import net.yassine.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.yassine.university.entities.Product;

import java.util.List;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {
    @Autowired // pour l'injection des depandances
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //adding object to database using spring data
        productRepository.save(new Product(null, "Computer", 4300, 3));
        productRepository.save(new Product(null, "Printer", 1200, 4));
        productRepository.save(new Product(null, "Smart Phone", 1300, 7));

        List<Product> products = productRepository.findAll();

        // parcourir ma liste using forEach
        products.forEach(p->{
            System.out.println(p.toString());
        });

        //chercher un element by id

        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("********************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());


    }
}

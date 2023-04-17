/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Entity.Product;
import Service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
    
    Optional<Product> findById(Long id);

    List<Product> findAll();

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByPriceGreaterThanEqual(Double price);

    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);

    void deleteById(Long id);
    
}

package Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	
}

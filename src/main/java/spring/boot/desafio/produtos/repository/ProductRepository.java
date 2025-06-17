package spring.boot.desafio.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.desafio.produtos.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

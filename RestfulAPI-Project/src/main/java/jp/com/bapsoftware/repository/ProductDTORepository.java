package jp.com.bapsoftware.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import jp.com.bapsoftware.dto.ProductDTO;
import jp.com.bapsoftware.entity.Product;

@Repository
public interface ProductDTORepository extends RevisionRepository<Product, Integer, Integer>, JpaRepository<Product, Integer> {

    @Query(name = "getAllProduct", nativeQuery = true)
    List<ProductDTO> getAllProduct();
}

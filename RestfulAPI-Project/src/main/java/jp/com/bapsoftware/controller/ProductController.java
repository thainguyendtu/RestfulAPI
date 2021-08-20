package jp.com.bapsoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.com.bapsoftware.dto.ProductDTO;
import jp.com.bapsoftware.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResponseEntity<?> getAllProduct() {
        List<ProductDTO> listProduct = productService.getAllProduct();

        return new ResponseEntity<List<ProductDTO>>(listProduct, HttpStatus.OK);
    }
}

package jp.com.bapsoftware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.com.bapsoftware.dto.ProductDTO;
import jp.com.bapsoftware.repository.ProductDTORepository;
import jp.com.bapsoftware.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDTORepository productDTORepository;

    @Override
    public List<ProductDTO> getAllProduct() {
        List<ProductDTO> listProduct = productDTORepository.getAllProduct();
        return listProduct;
    }

}

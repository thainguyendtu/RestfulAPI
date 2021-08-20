package jp.com.bapsoftware.service;

import org.springframework.stereotype.Service;

import jp.com.bapsoftware.entity.Category;

@Service
public interface CategoryService {

	Category findById(Integer id);

	Category save(Category category);

}

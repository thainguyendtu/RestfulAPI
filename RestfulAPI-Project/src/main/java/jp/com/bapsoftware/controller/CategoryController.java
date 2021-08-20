package jp.com.bapsoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.com.bapsoftware.entity.Category;
import jp.com.bapsoftware.service.CategoryService;

@RestController
@RequestMapping("/cat")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/findById/{id}")
    @ResponseBody
    public String findByName(@PathVariable("id") int id) {

        if (categoryService.findById(id) != null) {
            System.out.println("has data");
            return categoryService.findById(id).getName();
        } else {
            System.out.println("no data");

            return null;
        }
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String save(@RequestBody Category category) {
        System.out.println("come here");

        if (categoryService.save(category) != null) {
            System.out.println("OK");
            return "OK";
        } else {
            System.out.println("no data");

            return null;
        }
    }

}

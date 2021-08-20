package jp.com.bapsoftware.dto;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import lombok.Getter;
import lombok.Setter;

@Entity
@NamedNativeQuery(name = "getAllProduct",
                    query = "SELECT p.id, p.name, p.description, c.name as categoryName FROM product p INNER JOIN category c "
                            + "ON p.category_id = c.id ", resultSetMapping = "productDTO")
@SqlResultSetMapping(name = "productDTO",
                    classes = @ConstructorResult(
                            targetClass = ProductDTO.class, columns = {
                                    @ColumnResult(name = "id", type = Integer.class),
                                    @ColumnResult(name = "name", type = String.class),
                                    @ColumnResult(name = "description", type = String.class),
                                    @ColumnResult(name = "categoryName", type = String.class) 
                            }))
@Getter
@Setter
public class ProductDTO {

    private Integer id;

    private String name;

    private String description;

    private String categoryName;
}

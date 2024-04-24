package org.example.product.dtos;


import lombok.Getter;
import lombok.Setter;
import org.example.product.models.Product;

@Getter
@Setter
public class FakeStoreDtos {
    public Long id;
    public String title;
    private String image;
    public String description;
    public String category;
    public double price;


    public Product toProduct()
    {
        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setCategory(category);
        return product;
    }
}

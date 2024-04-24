package org.example.product.service;
import org.example.product.dtos.FakeStoreDtos;
import org.example.product.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreService implements ProductService{

    RestTemplate restTemplate;
    public FakeStoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(Long id){
        ResponseEntity<FakeStoreDtos> responseEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + id, FakeStoreDtos.class);

        FakeStoreDtos fakeStoreDtos = responseEntity.getBody();


        Product product = new Product();
        product.setId(fakeStoreDtos.getId());
        product.setTitle(fakeStoreDtos.getTitle());
        product.setDescription(fakeStoreDtos.getDescription());


        return product;
    }

}



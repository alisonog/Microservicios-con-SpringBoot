package com.exampleali.productmicroservices.repository;

import com.exampleali.productmicroservices.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}

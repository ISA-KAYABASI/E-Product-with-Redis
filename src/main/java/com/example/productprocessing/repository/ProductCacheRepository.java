package com.example.productprocessing.repository;

import com.example.productprocessing.entity.ProductCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Repository
public class ProductCacheRepository {

    public static final String HASH_KEY = "ProductCache";
    @Autowired
    private RedisTemplate template;
    public ProductCache save(ProductCache productCache){
        template.opsForHash().put(HASH_KEY,productCache.getId(),productCache);
        template.expire(HASH_KEY,30, TimeUnit.SECONDS);
        return productCache;
    }
    public List<ProductCache> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public ProductCache findProductById(String id){
        return (ProductCache) template.opsForHash().get(HASH_KEY,id);
    }
    public String deleteProduct(String id){
        template.opsForHash().delete(HASH_KEY,id);
        return "product removed from temporary memory !!";
    }

}

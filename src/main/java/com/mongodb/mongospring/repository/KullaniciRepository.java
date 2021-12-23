package com.mongodb.mongospring.repository;

import com.mongodb.mongospring.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface KullaniciRepository extends MongoRepository<Kullanici,String> {


}

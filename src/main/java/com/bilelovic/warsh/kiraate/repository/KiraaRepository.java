package com.bilelovic.warsh.kiraate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.bilelovic.warsh.kiraate.domain.Kiraa;

@Repository
//@RestResource(exported=false)
public interface KiraaRepository extends MongoRepository<Kiraa, String> {

}

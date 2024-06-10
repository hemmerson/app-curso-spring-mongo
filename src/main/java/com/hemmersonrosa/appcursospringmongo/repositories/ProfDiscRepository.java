package com.hemmersonrosa.appcursospringmongo.repositories;

import com.hemmersonrosa.appcursospringmongo.models.ProfDisc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfDiscRepository extends MongoRepository<ProfDisc, String> {
}

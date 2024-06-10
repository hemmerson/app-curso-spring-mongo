package com.hemmersonrosa.appcursospringmongo.repositories;

import com.hemmersonrosa.appcursospringmongo.models.Matricula;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends MongoRepository<Matricula, String> {
}

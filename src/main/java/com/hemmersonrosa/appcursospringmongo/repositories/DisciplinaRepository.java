package com.hemmersonrosa.appcursospringmongo.repositories;

import com.hemmersonrosa.appcursospringmongo.domains.Disciplina;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends MongoRepository<Disciplina, String> {
}

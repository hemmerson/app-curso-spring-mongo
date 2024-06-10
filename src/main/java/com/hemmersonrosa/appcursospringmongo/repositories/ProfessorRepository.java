package com.hemmersonrosa.appcursospringmongo.repositories;

import com.hemmersonrosa.appcursospringmongo.models.Professor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends MongoRepository<Professor, String> {
}

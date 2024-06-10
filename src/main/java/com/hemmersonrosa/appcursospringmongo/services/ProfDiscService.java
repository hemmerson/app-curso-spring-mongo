package com.hemmersonrosa.appcursospringmongo.services;

import com.hemmersonrosa.appcursospringmongo.models.ProfDisc;
import com.hemmersonrosa.appcursospringmongo.repositories.ProfDiscRepository;
import com.hemmersonrosa.appcursospringmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfDiscService {

    @Autowired
    private ProfDiscRepository repository;

    public List<ProfDisc> findAll(){
        return repository.findAll();
    }

    public ProfDisc findById(String id){
        Optional<ProfDisc> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }

    public ProfDisc insert(ProfDisc obj){
        return repository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public ProfDisc update(String id, ProfDisc obj){
        ProfDisc newObj = findById(id);
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(ProfDisc newObj, ProfDisc obj) {
        newObj.setProfessor(obj.getProfessor());
        newObj.setDisciplina(obj.getDisciplina());
        newObj.setAno(obj.getAno());
    }
}

package com.hemmersonrosa.appcursospringmongo.services;

import com.hemmersonrosa.appcursospringmongo.domains.Matricula;
import com.hemmersonrosa.appcursospringmongo.repositories.MatriculaRepository;
import com.hemmersonrosa.appcursospringmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository repository;

    public List<Matricula> findAll(){
        return repository.findAll();
    }

    public Matricula findById(String id){
        Optional<Matricula> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }

    public Matricula insert(Matricula obj){
        return repository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public Matricula update(String id, Matricula obj){
        Matricula newObj = findById(id);
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Matricula newObj, Matricula obj) {
        newObj.setAluno(obj.getAluno());
        newObj.setDisciplina(obj.getDisciplina());
        newObj.setAno(obj.getAno());
    }
}

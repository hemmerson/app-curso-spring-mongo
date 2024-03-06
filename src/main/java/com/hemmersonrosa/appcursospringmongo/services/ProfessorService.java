package com.hemmersonrosa.appcursospringmongo.services;

import com.hemmersonrosa.appcursospringmongo.domains.Professor;
import com.hemmersonrosa.appcursospringmongo.dto.ProfessorDTO;
import com.hemmersonrosa.appcursospringmongo.repositories.ProfessorRepository;
import com.hemmersonrosa.appcursospringmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> findAll(){
        return repository.findAll();
    }

    public Professor findById(String id){
        Optional<Professor> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }

    public Professor insert(Professor obj){
        return repository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public Professor update(Professor obj){
        Professor newObj = findById(obj.getNumero_prof());
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Professor newObj, Professor obj) {
        newObj.setProfnome(obj.getProfnome());
        newObj.setProfrua(obj.getProfrua());
        newObj.setProfcidade(obj.getProfcidade());
    }

    public Professor fromDto(ProfessorDTO objDto){
        return new Professor(objDto.getNumero_prof(), objDto.getProfnome(), objDto.getProfrua(), objDto.getProfcidade());
    }
}

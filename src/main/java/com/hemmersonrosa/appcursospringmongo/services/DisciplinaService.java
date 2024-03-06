package com.hemmersonrosa.appcursospringmongo.services;

import com.hemmersonrosa.appcursospringmongo.domains.Disciplina;
import com.hemmersonrosa.appcursospringmongo.dto.DisciplinaDTO;
import com.hemmersonrosa.appcursospringmongo.repositories.DisciplinaRepository;
import com.hemmersonrosa.appcursospringmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> findAll(){
        return repository.findAll();
    }

    public Disciplina findById(String id){
        Optional<Disciplina> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }

    public Disciplina insert(Disciplina obj){
        return repository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public Disciplina update(Disciplina obj){
        Disciplina newObj = findById(obj.getCodigo_disc());
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Disciplina newObj, Disciplina obj) {
        newObj.setNome_disciplina(obj.getNome_disciplina());
        newObj.setNome_curso(obj.getNome_curso());
        newObj.setQtd_aulas(obj.getQtd_aulas());
    }

    public Disciplina fromDto(DisciplinaDTO objDto){
        return new Disciplina(objDto.getCodigo_disc(), objDto.getNome_disciplina(), objDto.getNome_curso(), objDto.getQtd_aulas());
    }
}

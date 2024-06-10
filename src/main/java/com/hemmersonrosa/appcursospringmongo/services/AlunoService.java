package com.hemmersonrosa.appcursospringmongo.services;

import com.hemmersonrosa.appcursospringmongo.models.Aluno;
import com.hemmersonrosa.appcursospringmongo.dto.AlunoDTO;
import com.hemmersonrosa.appcursospringmongo.repositories.AlunoRepository;
import com.hemmersonrosa.appcursospringmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> findAll(){
        return repository.findAll();
    }

    public Aluno findById(String id){
        Optional<Aluno> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }

    public Aluno insert(Aluno obj){
        return repository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public Aluno update(Aluno obj){
        Aluno newObj = findById(obj.getNumero_aluno());
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Aluno newObj, Aluno obj) {
        newObj.setAlunome(obj.getAlunome());
        newObj.setAlurua(obj.getAlurua());
        newObj.setAlucidade(obj.getAlucidade());
    }

    public Aluno fromDto(AlunoDTO objDto){
        return new Aluno(objDto.getNumero_aluno(), objDto.getAlunome(), objDto.getAlurua(), objDto.getAlucidade());
    }
}

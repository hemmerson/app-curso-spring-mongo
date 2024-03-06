package com.hemmersonrosa.appcursospringmongo.resources;

import com.hemmersonrosa.appcursospringmongo.domains.Aluno;
import com.hemmersonrosa.appcursospringmongo.dto.AlunoDTO;
import com.hemmersonrosa.appcursospringmongo.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<AlunoDTO>> findAll(){
        List<Aluno> list = service.findAll();
        List<AlunoDTO> listDto = list.stream().map(AlunoDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoDTO> findById(@PathVariable String id){
        Aluno obj = service.findById(id);
        return ResponseEntity.ok().body(new AlunoDTO(obj));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody AlunoDTO objDto){
        Aluno obj = service.fromDto(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(obj.getNumero_aluno()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> insert(@RequestBody AlunoDTO objDto, @PathVariable String id){
        Aluno obj = service.fromDto(objDto);
        obj.setNumero_aluno(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }
}

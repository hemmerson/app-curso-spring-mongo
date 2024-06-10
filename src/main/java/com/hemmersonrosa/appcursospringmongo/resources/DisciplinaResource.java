package com.hemmersonrosa.appcursospringmongo.resources;

import com.hemmersonrosa.appcursospringmongo.models.Disciplina;
import com.hemmersonrosa.appcursospringmongo.dto.DisciplinaDTO;
import com.hemmersonrosa.appcursospringmongo.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaResource {

    @Autowired
    private DisciplinaService service;

    @GetMapping
    public ResponseEntity<List<DisciplinaDTO>> findAll(){
        List<Disciplina> list = service.findAll();
        List<DisciplinaDTO> listDto = list.stream().map(DisciplinaDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaDTO> findById(@PathVariable String id){
        Disciplina obj = service.findById(id);
        return ResponseEntity.ok().body(new DisciplinaDTO(obj));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody DisciplinaDTO objDto){
        Disciplina obj = service.fromDto(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(obj.getCodigo_disc()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> insert(@RequestBody DisciplinaDTO objDto, @PathVariable String id){
        Disciplina obj = service.fromDto(objDto);
        obj.setCodigo_disc(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }
}

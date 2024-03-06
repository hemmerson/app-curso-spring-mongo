package com.hemmersonrosa.appcursospringmongo.resources;

import com.hemmersonrosa.appcursospringmongo.domains.Professor;
import com.hemmersonrosa.appcursospringmongo.dto.ProfessorDTO;
import com.hemmersonrosa.appcursospringmongo.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/professores")
public class ProfessorResource {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public ResponseEntity<List<ProfessorDTO>> findAll(){
        List<Professor> list = service.findAll();
        List<ProfessorDTO> listDto = list.stream().map(ProfessorDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfessorDTO> findById(@PathVariable String id){
        Professor obj = service.findById(id);
        return ResponseEntity.ok().body(new ProfessorDTO(obj));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody ProfessorDTO objDto){
        Professor obj = service.fromDto(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(obj.getNumero_prof()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> insert(@RequestBody ProfessorDTO objDto, @PathVariable String id){
        Professor obj = service.fromDto(objDto);
        obj.setNumero_prof(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }
}

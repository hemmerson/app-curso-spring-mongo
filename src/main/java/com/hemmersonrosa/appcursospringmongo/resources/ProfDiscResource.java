package com.hemmersonrosa.appcursospringmongo.resources;

import com.hemmersonrosa.appcursospringmongo.models.ProfDisc;
import com.hemmersonrosa.appcursospringmongo.services.ProfDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/profdiscs")
public class ProfDiscResource {

    @Autowired
    private ProfDiscService service;

    @GetMapping
    public ResponseEntity<List<ProfDisc>> findAll(){
        List<ProfDisc> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfDisc> findById(@PathVariable String id){
        ProfDisc obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody ProfDisc obj){
        ProfDisc newObj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> insert(@RequestBody ProfDisc obj, @PathVariable String id){
        obj = service.update(id, obj);
        return ResponseEntity.noContent().build();
    }
}

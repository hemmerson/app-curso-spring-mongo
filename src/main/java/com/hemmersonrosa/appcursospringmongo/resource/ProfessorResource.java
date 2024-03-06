package com.hemmersonrosa.appcursospringmongo.resource;

import com.hemmersonrosa.appcursospringmongo.domain.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorResource {

    @GetMapping
    public ResponseEntity<List<Professor>> findAll(){
        Professor maria =  new Professor("1","Maria","Rua qualquer", "Cidade Qualquer");
        Professor alex =  new Professor("2","Alex","Rua qualquer", "Cidade Qualquer");
        List<Professor> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,alex));
        return ResponseEntity.ok().body(list);
    }
}

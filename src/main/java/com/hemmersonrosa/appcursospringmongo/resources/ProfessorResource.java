package com.hemmersonrosa.appcursospringmongo.resources;

import com.hemmersonrosa.appcursospringmongo.domains.Professor;
import com.hemmersonrosa.appcursospringmongo.dto.ProfessorDTO;
import com.hemmersonrosa.appcursospringmongo.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/professors")
public class ProfessorResource {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public ResponseEntity<List<ProfessorDTO>> findAll(){
        List<Professor> list = service.findAll();
        List<ProfessorDTO> listDto = list.stream().map(ProfessorDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
}

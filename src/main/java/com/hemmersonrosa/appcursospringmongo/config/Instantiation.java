package com.hemmersonrosa.appcursospringmongo.config;

import com.hemmersonrosa.appcursospringmongo.domains.Aluno;
import com.hemmersonrosa.appcursospringmongo.domains.Professor;
import com.hemmersonrosa.appcursospringmongo.repositories.AlunoRepository;
import com.hemmersonrosa.appcursospringmongo.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void run(String... args) throws Exception {

        // Professor ===================================================================================
        professorRepository.deleteAll();

        Professor thiago = new Professor(null, "Thiago","120","Qualquer");
        Professor maria = new Professor(null, "Maria","120","Qualquer");
        Professor joana = new Professor(null, "Joana","120","Qualquer");
        Professor pedro = new Professor(null, "Pedro","120","Qualquer");
        professorRepository.saveAll(Arrays.asList(thiago, maria, joana, pedro));

        // Aluno =======================================================================================
        alunoRepository.deleteAll();

        Aluno jose = new Aluno( "Thiago","120","Qualquer");
        Aluno cris = new Aluno( "Maria","120","Qualquer");
        Aluno clara = new Aluno( "Joana","120","Qualquer");
        Aluno miguel = new Aluno( "Pedro","120","Qualquer");
        alunoRepository.saveAll(Arrays.asList(jose, cris, clara, miguel));

    }
}

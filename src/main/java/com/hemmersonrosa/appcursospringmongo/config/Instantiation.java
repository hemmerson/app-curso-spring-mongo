package com.hemmersonrosa.appcursospringmongo.config;

import com.hemmersonrosa.appcursospringmongo.domains.Aluno;
import com.hemmersonrosa.appcursospringmongo.domains.Disciplina;
import com.hemmersonrosa.appcursospringmongo.domains.Matricula;
import com.hemmersonrosa.appcursospringmongo.domains.Professor;
import com.hemmersonrosa.appcursospringmongo.repositories.AlunoRepository;
import com.hemmersonrosa.appcursospringmongo.repositories.DisciplinaRepository;
import com.hemmersonrosa.appcursospringmongo.repositories.MatriculaRepository;
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

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private MatriculaRepository matriculaRepository;

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

        // Disciplina ==================================================================================
        disciplinaRepository.deleteAll();

        Disciplina portugues = new Disciplina( "Português","Ensino Médio",4);
        Disciplina biologia = new Disciplina( "Biologia","Ensino Médio",2);
        Disciplina historia = new Disciplina( "História","Ensino Médio",2);
        Disciplina matematica = new Disciplina( "Matemática","Ensino Médio",4);
        disciplinaRepository.saveAll(Arrays.asList(portugues, biologia, historia, matematica));

        // Matricula ===================================================================================
        matriculaRepository.deleteAll();

        Matricula matricula1 = new Matricula( jose,portugues,2024);
        Matricula matricula2 = new Matricula( cris,historia,2023);
        Matricula matricula3 = new Matricula( jose,matematica,2024);
        Matricula matricula4 = new Matricula( miguel,biologia,2023);
        matriculaRepository.saveAll(Arrays.asList(matricula1, matricula2, matricula3, matricula4));

    }
}

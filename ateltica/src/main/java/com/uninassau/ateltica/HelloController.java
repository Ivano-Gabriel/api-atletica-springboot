package com.uninassau.ateltica;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    
    @Autowired
    private AlunoRepository repository;

    @GetMapping("/teste")
    public String darOi() {
        return "Fala mestre! O Megazord da Atletica agora vive na Web!";
    }

   
    @GetMapping("/cadastrar-teste")
    public String cadastrarAlunoFake() {
        
      
        Aluno novoAluno = new Aluno();
        novoAluno.setNome("Ivano Gabriel");
        novoAluno.setMatricula(123456);
        novoAluno.setCurso("Ciências da Computação");
        novoAluno.setEsporte("Futebol");
        novoAluno.setExperiencia("Joga muito, o camisa 10 da T.I.");
        novoAluno.setStatus("PENDENTE");

        repository.save(novoAluno);

        return "Aluno cadastrado com sucesso no banco de dados! Vai lá olhar o MySQL Workbench!";
    }
}
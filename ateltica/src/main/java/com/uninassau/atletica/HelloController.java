package com.uninassau.atletica;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class HelloController {

    private final AlunoRepository repository;

    // Injeção por construtor (Boa prática recomendada pelo spring)
    public HelloController(AlunoRepository repository) {
        this.repository = repository;
    }

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

    // NOVO ENDPOINT: deleta um aluno pelo ID
    @DeleteMapping("/deletar-teste/{id}") // exemplo: /deletar-teste/2 -> deleta o de id=2
    public String deletarAluno(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Aluno com ID " + id + " deletado, o banco de dados foi atualizado.";
        } else {
            return "Erro: Aluno com ID " + id + " não foi encontrado";
        }
    }

    // NOVO ENDPOINT: Listar TODOS os alunos do banco
    @GetMapping("/alunos")
    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    // NOVO ENDPOINT: Buscar apenas UM aluno pelo ID
    @GetMapping("/alunos/{id}")
    public Object buscarPorId(@PathVariable Long id) {
        Optional<Aluno> aluno = repository.findById(id);

        if (aluno.isPresent()) {
            return aluno.get(); // Retorna o aluno encontrado
        } else {
            return "Erro: Aluno com ID " + id + " não encontrado!";
        }
    }
}
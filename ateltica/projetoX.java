    import java.util.Scanner;
    import java.util.ArrayList;
  

    public class projetoX {
        public static void main(String[] args) {
        

        ArrayList <Esporte> quatroEsportes = new ArrayList<Esporte>();
        ArrayList <Aluno> listaAlunos = new ArrayList<Aluno>();    
        ArrayList <Cursos> todosCursos = new ArrayList<Cursos>();

        Scanner ouvido = new Scanner(System.in);
        int geradorDeId = 1; 

        

        // ////////////////////////////////////////////////////

        todosCursos.add(new Cursos("Psicologia"));
        todosCursos.add(new Cursos("Ciências da Computação")); 
        todosCursos.add(new Cursos("Contabilidade"));
        todosCursos.add(new Cursos("Enfermagem"));
        todosCursos.add(new Cursos("Veterinária"));
        todosCursos.add(new Cursos("Direito"));
        todosCursos.add(new Cursos("Fonoaudiologia"));
        todosCursos.add(new Cursos("Arquitetura"));

    // //////////////////////////////////////////////////////

        quatroEsportes.add(new Esporte("futebol", 20, "Futebol é um esporte jogado entre duas equipes de 11 jogadores, com o objetivo de marcar gols. É o esporte mais popular do mundo e exige trabalho em equipe, técnica e estratégia."));

        quatroEsportes.add(new Esporte("volei", 20, "Vôlei é um esporte disputado entre duas equipes separadas por uma rede, onde o objetivo é fazer a bola tocar o chão adversário. Destaca-se pela agilidade, coordenação e cooperação entre os jogadores."));

        quatroEsportes.add(new Esporte("basquete", 20, "Basquete é um esporte em que duas equipes tentam marcar pontos arremessando a bola na cesta adversária. Exige velocidade, precisão, raciocínio rápido e trabalho em equipe."));

        quatroEsportes.add(new Esporte("futebol com as maos", 20, "Handebol é um esporte coletivo jogado com as mãos, em que duas equipes buscam marcar gols na baliza adversária. Combina velocidade, força, estratégia e habilidade nos passes e arremessos."));

    // //////////////////////////////////////////////////////////////////////////////////


            while(true){
                
                System.out.println("----PROJETO ATLETICA <> IVANO GABRIEL----");
                System.out.println("SUA CATEGORIA...");
                System.out.println("Aluno x Adm x sair");
                String respostaPrimeiroWhile = ouvido.nextLine();
                
                if( respostaPrimeiroWhile.equalsIgnoreCase("adm")){
                    while (true){ 
                        System.out.println("-------------------------");
                        System.out.println("ADMINISTRANDO.....");
                        System.out.println("-------------------------");
                        System.out.println(">>(Ler) lista completa - (Editar) nome de aluno - (validar) cadastro de aluno - (Excluir) aluno - (sair) de Adm<< ");

                        String ouvirAdm = ouvido.nextLine();

                        if( ouvirAdm.equalsIgnoreCase("ler")){ 
                        
                            System.out.println("Conferindo lista de alunos cadastrados>>... ");
                                for(int i = 0; i < listaAlunos.size(); i++){ 

                            System.out.println("LISTA ---- ALUNO " + (i+1)+ " -----" );
                            listaAlunos.get(i).mostrarDados();
                                }
                        
                        } 

                        else if( ouvirAdm.equalsIgnoreCase("editar")){
                            
                            System.out.println( "LISTA DE ALUNOS");
                                for (int i = 0; i < listaAlunos.size(); i++){
                                    System.out.println( "-" + listaAlunos.get(i).nome + "-" );
                                }
                            
                            

                            System.out.println("Qual o nome do aluno que quer editar?" );
                            String alterarAluno = ouvido.nextLine();

                                for(int i = 0; i < listaAlunos.size(); i++) { 
                                   
                                    if(listaAlunos.get(i).nome.equalsIgnoreCase(alterarAluno)){
                                        System.out.println("Aluno localizado com sucesso!>>>" );

                                        System.out.println("Como deseja que o nome " + alterarAluno + " seja?  >>" );
                                        String novoNovoAluno = ouvido.nextLine();

                                        listaAlunos.get(i).nome = novoNovoAluno;
                                        break;
                                    }   
                                }
                        }   

                        else if( ouvirAdm.equalsIgnoreCase("validar")){

                            System.out.println( "LISTA DE ALUNOS");
                                for (int i = 0; i < listaAlunos.size(); i++){
                                    System.out.println( "-" + listaAlunos.get(i).nome + "-" );
                                }

                            System.out.println("Vamos para validação...  qual voce quer validar, meu adm?  " );
                            String validation = ouvido.nextLine();
                    
                            for(int i = 0; i < listaAlunos.size(); i++){

                                if(listaAlunos.get(i).nome.equalsIgnoreCase(validation)){
                                    System.out.println("--- FICHA DO ALUNO ---");
                                    listaAlunos.get(i).mostrarDados();

                                    System.out.println("Você deseja APROVAR ou REPROVAR esse aluno? (Digite Aprovar/Reprovar)");                       
                                    String decisao = ouvido.nextLine();
                                    if (decisao.equalsIgnoreCase("aprovar")){
                                        listaAlunos.get(i).status = "Aprovado";
                                        System.out.println(validation + " APROVADO COM SUCESSO!");


                                        String esporteDoAluno = listaAlunos.get(i).esporte;

                                        for (int e = 0; e < quatroEsportes.size(); e ++){
                                            if(quatroEsportes.get(e).nome.equalsIgnoreCase(esporteDoAluno)){

                                                quatroEsportes.get(e).vagas = quatroEsportes.get(e).vagas - 1;
                                                System.out.println("Vaga descontada! Sobraram " + quatroEsportes.get(e).vagas + " vagas no " + esporteDoAluno);

                                                break;
                                            }
                                        }

                                    }
                                
                                }   


                            }

                            
                        
                        }
                        
                        else if( ouvirAdm.equalsIgnoreCase("excluir")){
                            System.out.println( "LISTA DE ALUNOS");
                                for (int i = 0; i < listaAlunos.size(); i++){
                                    System.out.println( "-" + listaAlunos.get(i).nome + "-" );
                                }
                            System.out.println("Digita aqui o nome do ALUNO que vai ser deletado: >");
                            String alunoMaldito = ouvido.nextLine();

                            for ( int i = 0; i < listaAlunos.size(); i++ ) {
                                if(listaAlunos.get(i).nome.equalsIgnoreCase(alunoMaldito)){

                                    listaAlunos.remove(i);

                                    System.out.println("Aluno " +alunoMaldito+ " deletado com sucesso!>");

                                }

                            }
                        }

                        else if( ouvirAdm.equalsIgnoreCase("sair")){
                            System.out.println("Saindo do adm....X");
                            break;
                        }

                        else{
                        System.out.println("vc não digitou uma das 3 opções...faz dnv");
                        }

                    }
                }


                // ALUNO
                
                else if( respostaPrimeiroWhile.equalsIgnoreCase("aluno")){
                    while(true){

                        System.out.println("-------------------------");
                        System.out.println("ALUNO.....");
                        System.out.println("-------------------------");
                        System.out.println("(Cadastrar) seu nome nos jogos - (Ler) lista dos cadastros atuais - (Sair)");
                    
                        String ouvirAluno = ouvido.nextLine();

                        if( ouvirAluno.equalsIgnoreCase("cadastrar")){
                            System.out.println("CADASTRANDO....Qual o seu nome? >  ");
                            Aluno novoAluno = new Aluno();
                            novoAluno.nome = ouvido.nextLine(); 

                            System.out.println("CADASTRANDO...Sua matrícula, >>"+ novoAluno.nome + ": ");
                            novoAluno.matricula = ouvido.nextInt();
                            ouvido.nextLine();
                            novoAluno.id = geradorDeId;



                            System.out.println("Nos informe seu curso, por favor:  >>");

                            for (int i = 0; i < todosCursos.size(); i++) {
                                System.out.println( "-" + todosCursos.get(i).nome);

                            }



                            novoAluno.curso = ouvido.nextLine();


                            System.out.println("PARA QUAL MODALIDADE VOCÊ QUER SE INSCREVER??  >>");
                                
                                for(int i = 0; i < quatroEsportes.size(); i ++){
                                System.out.println("-" + quatroEsportes.get(i).nome + " ( "+ quatroEsportes.get(i).vagas +  " vagas )" );                          
                                
                            }
                                String respostaModalidade = ouvido.nextLine();

                                novoAluno.esporte = respostaModalidade;
                            
                                                            
                                System.out.println("Positivo! >> "+ respostaModalidade+ " << Agora descreva para o nosso adm avaliador o que você sabe fazer: > "+ respostaModalidade);
                                novoAluno.experiencia = ouvido.nextLine();

                                novoAluno.status = "pendente";

                                geradorDeId++;

                                listaAlunos.add(novoAluno);
                                System.out.println("Inscrição enviada pro ADM avaliar!");
                        }

                        else if( ouvirAluno.equalsIgnoreCase("ler")){

                            System.out.println("LISTA DE CADASTRADOS ATUALIZADA>>> ");

                            for(int i = 0; i < listaAlunos.size(); i++){
                                System.out.println("ALUNO ---- " + (i+1)+ "-----" );
                                listaAlunos.get(i).mostrarDados();
                            }
                        } 

                        else if( ouvirAluno.equalsIgnoreCase("sair")){
                        break;
                        }
                        else{
                            System.out.println("vc não digitou uma das 3 opções...faz dnv");
                        }
                    }
                }

                else if( respostaPrimeiroWhile.equalsIgnoreCase("sair")){
                    System.out.println("SAINDO...!");
                    break; 

                }

                else{
                    System.out.println("SO ACEITAMOS AS PALAVRAS CHAVE ( ALUNO - ADM - SAIR ) !");

                }
            
        }
    ouvido.close();
    }

    }       

    class Aluno {
        int id;
        String nome;
        int matricula;
        String esporte;
        String experiencia; 
        String status = "PENDENTE";
        String curso;

        public void mostrarDados() {
            System.out.println("Id: " + id);
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Esporte: " + esporte);
            System.out.println("Experiência: " + experiencia);
            System.out.println("Status: " + status);
            System.out.println("Curso: " + curso);
            System.out.println("-------------------------");
        }
    }

    class Cursos {
        
        String nome;
        
        public Cursos(String nomeRecebido){
            this.nome = nomeRecebido;
        }

        public void mostrarDados() {
        
            System.out.println("Nome: " + nome);
            
            System.out.println("-------------------------");
        }
    }

    class Esporte {
        int id;
        String nome;
        int vagas;
        String descricao = "";

        public Esporte(String nomeRecebido, int vagasRecebidas, String descricaoRecebida){
            this.nome = nomeRecebido;
            this.vagas = vagasRecebidas;
            this.descricao = descricaoRecebida;
        }


        public void mostrarDados() {
            System.out.println("Id: " + id);
            System.out.println("Nome: " + nome);
            System.out.println("Vagas: " + vagas);
            System.out.println("Descrição: " + descricao);
        }
    }
            

        


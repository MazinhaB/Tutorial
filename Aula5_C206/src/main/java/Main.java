public class Main {
    //classe é uma especificação e instância é o objeto completo
    public class Pessoa{ //criação de uma classe (como se fosse uma struct, cria-se um novo tipo)
        String nome;
        int idade;
        public void falar(){
            System.out.println("Boa noite");
        }
    }
    public class Professor extends Pessoa{ //herança, subclasse de pessoa
        public void ministrarAulas(){ //método (como se fosse uma função)
            System.out.println("Aula");
        }
    }
    public class Faculdade{
        public String nome;
        Professor professor; //associação
        Pessoa pessoa;
        public void falar(){
            //so consigo acessar as informações dentro de um método (?)
            pessoa.falar();
            pessoa.nome = "nome";
            professor.falar();
        }
        public void ministrarAulas(){
            professor.ministrarAulas();
        }
    }
    public static void main(String[] args) {
        /*  -- controle de loops --
        for(int i = 0; i < 10; i++)
            if(i == 5)
                break; //força a saida do loop
        for(int i = 0; i < 10; i++)
            if(i == 5)
                continue; //força a parada desse loop e faz voltar aos parâmetros
    */

    }

}
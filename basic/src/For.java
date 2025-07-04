public class For {
    
    public static void main(String[] args){

        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinhos" + carneirinhos);
        }
        System.out.println("João Dormiu");


        String alunos [] = {"Felipe" , "Gilson", "Julia" , "Marcos"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno (" + x + ") é:" + alunos[x]);
        }

        for(String aluno:alunos){
            System.out.println("O aluno é " + aluno);
        }

        //break - interrompe o loop
        //continue - pula uma interação do loop

    }

}

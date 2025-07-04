package candidatura;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Proesso Seletivo:");
        analisarCandidato(1500);
        analisarCandidato(2000);
        analisarCandidato(2100);
    }

    static void analisarCandidato(double salarioPretendido){
            
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO!");
            }
            else if(salarioBase == salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
            }
            else{
                System.out.println("Aguardando Demais Candidatos.");
            }

    }

}

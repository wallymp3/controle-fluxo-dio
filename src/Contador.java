import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        // Coletando os parâmetros do terminal
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // ?? deve ser nextInt() para ler um número inteiro.
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // ?? deve ser nextInt() para ler um número inteiro.
        
        try {
            // Chamando o método de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimindo a mensagem de erro da exceção customizada
            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validando se parametroUm é maior que parametroDois
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calculando a quantidade de iterações
        int contagem = parametroDois - parametroUm;
        
        // Realizando o loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

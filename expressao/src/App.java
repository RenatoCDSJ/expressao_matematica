public class App {
    /*
     * Implemente em JAVA um algoritmo que receba uma expressão matemática e determine se ela 
       está correta ou não em termos de duas operações matemáticas e seus símbolos de agrupamento.
     * Você deve usar a estrutura de dados pilha para resolver o problemaExemplo:
        x+y*(3+z) está correta
        x+y*(3+ está errada
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Início");
        Operacao operacao = new Operacao();
        operacao.addOperacao("10+10-10(10)");
        System.out.println(operacao.operacao());
        System.out.println("Fim");
        
    }
}

//Essa classe irá armazenar a operação em uma pilha e verificar se ela
public class Operacao {
    Lista<Character> lista = new Lista<>();
    String string;
    public void addOperacao(String string){
        this.string = string;
        lista.setCabeca(null);
        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            lista.addPilha(c);
        }
    }
    //função parentese verificar se a quantidade de abre e fecha parênteses está certo
    public boolean parenteses(){
        int p1=0;
        int p2=0;
        No<Character> no = lista.getCabeca();
        //esse while vai passar por todos os nós da lista
        while(no != null){
            if(no.getDado() == '('){
                p1++;
            }else if(no.getDado() == ')'){
                p2++;
            }
            no = no.getProximo();
        }
        if(p1 == p2){
            return true;
        }else{
            return false;
        }
    }
    //Nesse metodo operadores, vai ser verificado se os opeadores então aplicados de forma correta
    public boolean operadores(){
        No<Character> no = lista.getCabeca();
        //esse while vai passar por todos os nós da lista
        while(no != null){
            //evita operadores do mesmo tipo juntos ex: ++, --, **, //
            if(no.getDado() == '*' || no.getDado() == '/' || no.getDado() == '+' || no.getDado() == '-'){
                if(no.getDado() == no.getProximo().getDado()){
                    return false;
                }
            }
            //evita operadores de divisão e multiplicação juntos e soma e subtração juntos
            if(no.getDado() == '*' && no.getProximo().getDado() == '/'){
                return false;
            }else if(no.getDado() == '/' && no.getProximo().getDado() == '*'){
                return false;
            }else if(no.getDado() == '+' && no.getProximo().getDado() == '-'){
                return false;
            }else if(no.getDado() == '-' && no.getProximo().getDado() == '+'){
                return false;
            }
            no = no.getProximo();
        }
        return true;
    }
    //esse metodo operacao pega os metodos parenteses e operadores e se os dois são verdadeiros a operação
    //esta correta(true) caso contrario a operação esta errada(false)
    public String operacao(){
        boolean p = parenteses();
        boolean o = operadores();
        if(p == true && o == true){
            return string + " correta.";
        }else{
            return string + " errada.";
        }
    }
}

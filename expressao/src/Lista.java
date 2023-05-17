//essa classe vai utilizar de nós para fazer um lista encadeada no modelo de um pilha
public class Lista<T> {
    private No<T> cabeca;

    public No<T> getCabeca() {
        return cabeca;
    }

    public void setCabeca(No<T> cabeca) {
        this.cabeca = cabeca;
    }
    public Lista(){
        this.cabeca = null;
    }
    //Metodo addPilha irá adicionar um novo nó que será a cabeça que estará ligado ao proximo no
    public void addPilha(T dado){
        No<T> no = new No<>(dado);
        no.setProximo(cabeca);
        cabeca = no;
    }
    public void rmPilha(){
        cabeca = cabeca.getProximo();
    }
}

package pilha;

public class ED_Pilha {
    
    public Object[] pilha;
    public int posicaoPilha;

    public ED_Pilha(){
        posicaoPilha = -1;
        pilha = new Object[10];
    }
    
    public boolean pilhaVazia(){
        return posicaoPilha == -1;
    }
    
    public int tamanhoPilha(){
        if (pilhaVazia()){
            return 0;
        }
        return posicaoPilha +1;
    }
    
    public void push (Object valor){
        if (posicaoPilha <pilha.length - 1){
            pilha[++posicaoPilha] = valor;
        }
    }
    
    public Object pop(){
        if(pilhaVazia()){
            return null;
        }
        return pilha[posicaoPilha--];
    }
    
    public void imprime(){
//        while(!pilhaVazia()){
//            System.out.println(pop());
//        }
        
        for (int i = 0; i <= posicaoPilha; i++){
            System.out.println(pilha[i]);
        }
    }
    
}

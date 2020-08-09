package View;

public class salvar {
   public int quantidadeAluno;
   public int quantidadeProf;
   public int quantidadetec;
   public String nome;
   public String matricula;
   public String codigo;
   public String cpf;
   public String dataf;
   public String datai;
   public String email;
   public String endereco;
   public String instituicao;
   public String situacao;
   public String telefone;
   public String curso;
   public String salario;
   public String titulacao;
   public String ctps;
   public String area;
   public String piso;
   public boolean pg;
   public boolean teste;
 
   public void lerquantA(){
       int a;
       a=Arquivo.Readint("quantA.txt");
       quantidadeAluno=a;
       String str;
       str=Integer.toString(quantidadeAluno);
       Arquivo.Write("quantA.txt", str);
       System.out.println(quantidadeAluno);
   }
   public void lerquantP(){
       int a;
       a=Arquivo.Readint("quantP.txt");
       quantidadeProf=a;
       String str;
       str=Integer.toString(quantidadeProf);
       Arquivo.Write("quantP.txt", str);
       System.out.println(quantidadeProf);
   }
   public void lerquantT(){
       int a;
       a=Arquivo.Readint("quantT.txt");
       quantidadetec=a;
       String str;
       str=Integer.toString(quantidadetec);
       Arquivo.Write("quantT.txt", str);
       System.out.println(quantidadetec);
   }
   
  public void somaAluno(){
      int a;
      String str;
      a=Arquivo.Readint("quantA.txt");
      quantidadeAluno=a+1;
      str=Integer.toString(quantidadeAluno);
      Arquivo.Write("quantA.txt", str);
  } 
  
  public void gravarAluno(String a,String b){
      String arq;
      arq=a+b;
      String texto;
      texto=nome+";"+matricula+";"+codigo+";"+cpf+";"+dataf+";"+datai+";"+email+";"+endereco+";"+instituicao+";"+situacao+";"+telefone+";"+curso+";"+pg+";";
      Arquivo.Write(arq, texto);
      
  }
  public void gravar(String end,String texto){
      Arquivo.Write(end, texto);
  }
}
    
    


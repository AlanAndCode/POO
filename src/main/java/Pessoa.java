public class Pessoa {
  private String nome;
  private int idade;
  private char sexo;

public String getNome(){
  return nome;
}

public void setNome(String novoNome){
this.nome = novoNome;
}


  public Pessoa(String nome, int idade, char sexo) {
      this.nome = nome;
      this.idade = idade;
      this.sexo = sexo;
  }
public int getIdade(){
return idade;
}

public void setidade(int newIdade){
this.idade = newIdade;
}

public char getSexo( ){
return sexo;
}


public void setSexo(char newSexo){
this.sexo= newSexo;
}

public void fazerAniversario(){
this.idade++;
}
  
}
  

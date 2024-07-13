public class Main {
    /* O objetivo é criar um programa que permita criar pessoas, associar livros a essas pessoas, abrir e folhear os livros, além de exibir os detalhes dos livros. Para isso, você deverá implementar as classes Pessoa, Livro, e a interface Publicacao. Siga as especificações abaixo:
Regras e Restrições
Todas as classes e a interface devem estar em arquivos separados.
Todos os métodos e atributos devem ser implementados conforme descrito.
Utilize boas práticas de programação, incluindo nomes de variáveis e métodos descritivos.
*/
    public static void main(String[] args) {
      Pessoa[] p = new Pessoa[2];
      Livro [] meuLivro = new Livro[2];

      p[0] = new Pessoa("Alice", 30, 'F');
      p[1] = new Pessoa("Bob", 25, 'M');

     
      meuLivro[0] = new Livro("O Alquimista", "Paulo Coelho", 300, p[1]);
      meuLivro[1] = new Livro("1984", "George Orwell", 120, p[0]);
      meuLivro[0].abrir();
      meuLivro[0].folhear(50);
      // Usando toString()
      for (Livro livro : meuLivro) {
          System.out.println(livro.detalhes());
      }
    }
}

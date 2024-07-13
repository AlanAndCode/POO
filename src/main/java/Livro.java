public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    // Implementação dos métodos da interface Publicacao
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
        public void folhear(int pagina) { // Corrigido o método folhear
            if (pagina >= 0 && pagina <= this.totPaginas) {
                this.pagAtual = pagina;
            } else {
                this.pagAtual = 0;
            }
        }
    

    @Override
    public void avancarPag() {
        if (this.aberto && this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto && this.pagAtual > 0) {
            this.pagAtual--;
        }
    }

    @Override
    public int getPaginaAtual() {
        return this.pagAtual;
    }

    // Métodos getter e setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

   
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + "'\n" +
                ", autor='" + autor + "'\n" +
                ", totPaginas=" + totPaginas +  "\n" +
                ", pagAtual=" + pagAtual +  "\n" +
                ", aberto=" + aberto +  "\n" +
                ", leitor=" + leitor.getNome() + "\n" +
                ", idade=" + leitor.getIdade() + "\n" +
                ", sexo=" + leitor.getSexo() + 
                '}';
    }


}

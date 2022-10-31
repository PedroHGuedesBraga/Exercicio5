import java.util.Objects;

public class Eleitor {
    private String nome;
    private String titulo;

    public Eleitor(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Eleitor{" +
                "nome='" + nome + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eleitor eleitor = (Eleitor) o;
        return Objects.equals(nome, eleitor.nome) && Objects.equals(titulo, eleitor.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, titulo);
    }
}

import Execptions.DadosExecption;
import Execptions.TituloExecption;

public interface SistemaEleitoralInterface {

    public void votar(String numTitulo, int numeroVotado) throws TituloExecption;
    public Candidato obterDadosDoCandidato(String nome) throws DadosExecption;
    public int contarVotosParaCandidato(int numero);
    public boolean cadastraCandidato(String nome, int numero, Partido partido);
    public boolean cadastraEleitor(String nome, String titulo);
}

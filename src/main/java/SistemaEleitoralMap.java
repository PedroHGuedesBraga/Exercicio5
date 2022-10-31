import Execptions.DadosExecption;
import Execptions.TituloExecption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemaEleitoralMap implements SistemaEleitoralInterface {
    ArrayList<Voto> votos = new ArrayList<>();
    Map<String,Candidato> candidatosMap = new HashMap<>();
    Map<String,Eleitor> eleitoresMap = new HashMap<>();

    SistemaEleitoralMap(){

    }
    public void votar (String numTitulo, int numeroVotado) throws TituloExecption {
        if(eleitoresMap.containsKey(numTitulo)){
            Voto votado = new Voto(numeroVotado);
            votos.add(votado);
        }
        else{
            throw new TituloExecption("Titulo inexistente");
        }
    }
    public Candidato obterDadosDoCandidato(String nome) throws DadosExecption {
        if(candidatosMap.containsKey(nome)){
            return candidatosMap.get(nome);
        }
        else{
            throw new DadosExecption("Candidato inexistente");
        }

    }
    public int contarVotosParaCandidato(int numero){
        int count = 0;
        for (Voto v : votos){
            if(v.equals(numero)){

                count++;
            }
        }
        return count;
    }
    public boolean cadastraCandidato(String nome,int numero, Partido partido){
        Candidato candidato = new Candidato(nome,numero,partido);
        if (candidatosMap.containsKey(nome)){
            return false;
        }
        else{
            candidatosMap.put(nome,candidato);
        }
        return true;
    }
    public boolean cadastraEleitor(String nome, String titulo){
        Eleitor eleitor = new Eleitor(nome,titulo);
        if(eleitoresMap.containsKey(titulo)){
            return false;
        }
        else {
            eleitoresMap.put(titulo,eleitor);
        }
        return true;
    }
}

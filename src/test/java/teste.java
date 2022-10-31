import Execptions.DadosExecption;
import Execptions.TituloExecption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class teste {
    @Test
    public void testecadastraeleitor() throws TituloExecption, DadosExecption {

SistemaEleitoralMap candidato = new SistemaEleitoralMap();
SistemaEleitoralMap eleitor = new SistemaEleitoralMap();

        //Cadastar dois candidatos
candidato.cadastraCandidato("Joao",13,Partido.PARTIDO1);
assertFalse(candidato.cadastraCandidato("Joao",13,Partido.PARTIDO1));
    //Cadastrar eleitor
        eleitor.cadastraEleitor("Pedro","001");
        //votar
        eleitor.votar("001",13);
        //Obterdados
        candidato.obterDadosDoCandidato("Joao");
        //contar Votos
        candidato.contarVotosParaCandidato(13);


    }



}

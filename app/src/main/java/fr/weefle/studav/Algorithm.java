package fr.weefle.studav;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

    //ici l'algorithme principal
    public List<String> eleves = new ArrayList<>();
    public List<Eleve> elevesob = new ArrayList<>();
    public Eleve eleve;

    public void addEleve(String player, Double note, int coeff){
        if(!eleves.contains(player)) {
            eleve = new Eleve(player);
            eleve.addNote(note);
            eleve.addCoeff(coeff);
            eleves.add(player);
            elevesob.add(this.eleve);
        }else {
            eleve.addNote(note);
            eleve.addCoeff(coeff);
        }
    }

    public void removeEleve(String eleve){
        elevesob.remove(eleve);
        eleves.remove(eleve);
    }

    public Double calcul(Eleve eleve){

        Double cumul = 0.0;
        int totalcoeffs = 0;
        for(int i=0; i<eleve.getNotes().size(); i++){
            cumul += (eleve.getNotes().get(i)*eleve.getCoeffs().get(i));
            totalcoeffs += eleve.getCoeffs().get(i);
        }

        return cumul/totalcoeffs;

    }

}

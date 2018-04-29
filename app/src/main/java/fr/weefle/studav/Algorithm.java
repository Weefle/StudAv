package fr.weefle.studav;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Algorithm {

    //ici l'algorithme principal
    public List<String> eleves = new ArrayList<>();
    public List<Eleve> elevesob = new ArrayList<>();
    public HashMap<Integer, Eleve> list = new HashMap<>();
    public Eleve eleve;
    private static Algorithm instance;
    public static Algorithm get(){
        if(instance == null){
            instance = new Algorithm();
        }
        return instance;
    }

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

    public void removeAll(){
        elevesob.removeAll(elevesob);
        eleves.removeAll(eleves);
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

package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.List;

public class AddDisciplinas {
    private List<Disciplinas> AllDisciplinas;

    private static AddDisciplinas stdregd = null;

    private AddDisciplinas(){
        AllDisciplinas = new ArrayList<Disciplinas>();
    }

    public static AddDisciplinas getInstance() {

		if(stdregd == null) {
			stdregd = new AddDisciplinas();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}

    public boolean add(Disciplinas disciplina) {
        for(Disciplinas percorreDisciplinas : AllDisciplinas){
            if(percorreDisciplinas.getIdDisciplina().equals(disciplina.getIdDisciplina())){
                return false; 
            } 
        }
        AllDisciplinas.add(disciplina);
        return true;
    }

}
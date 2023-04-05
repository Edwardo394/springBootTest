package br.pucrs.engswii.controllers;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;

@RestController
public class DisciplinasRegistrationController{
	boolean adiciona = false;
	@PostMapping("/register/disciplina")
	public DisciplinaRegistrationReply registerDisciplinas(@RequestBody Disciplinas disciplina) {
		System.out.println("In registerDisciplina");
		DisciplinaRegistrationReply disciplinasregreply = new DisciplinaRegistrationReply();     
		adiciona = AddDisciplinas.getInstance().add(disciplina);
		//We are setting the below value just to reply a message back to the caller
		if(adiciona == true) {
		disciplinasregreply.setIdDisciplina(disciplina.getIdDisciplina())
;		disciplinasregreply.setIdTurma(disciplina.getIdTurma());;
		disciplinasregreply.setDescription(disciplina.getDescription());
		disciplinasregreply.setRegistrationStatus("Successful");
		}
		return disciplinasregreply;
	}

}

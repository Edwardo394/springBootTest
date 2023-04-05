package br.pucrs.engswii.beans;

public class DisciplinaRegistrationReply {

	String idTurma;
    String idDisciplina;
    String description;
    String registrationStatus;

	public String getIdTurma() {
        return idTurma;
    }
    public String getIdDisciplina() {
        return idDisciplina;
    }
    public String getDescription() {
        return description;
    }
    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }
    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public void setDescription(String description) {
        this.description = description;
    }
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

}

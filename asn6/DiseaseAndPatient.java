package edu.disease.asn6;

import java.util.List;

import edu.disease.asn3.Disease;

/**
 * This is class called DiseaseAndPatient. It has <List><Disease>,
 * <List><Patient> as its fields.
 * 
 * @author DELL
 *
 */
public class DiseaseAndPatient {
	private List<Disease> diseases;
	private List<Patient> patients;

	/**
	 * This method gives <List> of diseases.
	 * 
	 * @return
	 */
	public List<Disease> getDiseases() {
		return diseases;
	}

	/**
	 * This method is used to set the <List> of diseases.
	 * 
	 * @param diseases
	 */
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	/**
	 * This method gives <List> of patients.
	 * 
	 * @return
	 */
	public List<Patient> getPatients() {
		return patients;
	}

	/**
	 * This method is used to set the <List> of patients.
	 * 
	 * @param patients
	 */
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

}
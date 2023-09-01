package edu.disease.asn3;
/**
 * The {@code DiseaseAndPatient} class represents a container for arrays of Disease and Patient objects.
 * It provides methods to access and modify the arrays.
 */
public class DiseaseAndPatient {
	private Disease[] diseases;
	private Patient[] patients;
	 /**
     * Retrieves the array of Disease objects.
     *
     * @return The array of Disease objects.
     */
	public Disease[] getDiseases() {
		return diseases;
	}
	   /**
     * Sets the array of Disease objects.
     *
     * @param diseases The array of Disease objects to be set.
     */
	public void setDiseases(Disease[] diseases) {
		this.diseases = diseases;
	}
	/**
     * Retrieves the array of Patient objects.
     *
     * @return The array of Patient objects.
     */
	public Patient[] getPatients() {
		return patients;
	}
	/**
     * Sets the array of Patient objects.
     *
     * @param patients The array of Patient objects to be set.
     */
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

}

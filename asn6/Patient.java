package edu.disease.asn6;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Exposure;

/**
 * This is a class called Patient. It has String firstName, lastName,
 * <List><Exposure>, <List><UUID>, UUID patientId as its fields.
 * 
 * @author DELL
 *
 */
public class Patient implements Comparable<Patient>, Serializable {
	/**
	 * This is line of code often found in Java classes that implement the
	 * {@link Serializable} interface. This line is used to assign a version number
	 * (serialVersionUID) to the class to indicate its serialized form's
	 * compatibility with different versions of the class.
	 */
	private static final long serialVersionUID = 1L;
	private String firstName, lastName;
	private List<Exposure> exposures;
	private List<UUID> diseaseIds;
	private UUID patientId;

	/**
	 * This is a constructor, used to initialize the diseaseIds and exposures
	 * <List>.
	 */
	public Patient() {
		diseaseIds = new LinkedList<UUID>();
		exposures = new LinkedList<Exposure>();
	}

	/**
	 * This method is used to add the diseases in the <List><Disease>.
	 * 
	 * @param diseaseId
	 */
	public void addDiseaseId(UUID diseaseId) {
		diseaseIds.add(diseaseId);
	}

	/**
	 * This method is used to add the exposures in the <List><Exposure>.
	 * 
	 * @param exposure
	 */
	public void addExposure(Exposure exposure) {
		exposures.add(exposure);
	}

	/**
	 * This method gives Patient's firstName.
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method is use to set the Patient's firstName.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This method gives Patient's lastName.
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This method is use to set the Patient's lastName.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This method gives patientId.
	 * 
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * This method is used to set the patient Id.
	 * 
	 * @param patientId
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * This method gives the <List> of Exposures.
	 * 
	 * @return
	 */
	public List<Exposure> getExposures() {
		return exposures;
	}

	/**
	 * This method is used to set the <List>Exposures.
	 * 
	 * @param exposures
	 */
	public void setExposures(List<Exposure> exposures) {
		this.exposures = exposures;
	}

	/**
	 * This method gives the <List> of diseaseIds.
	 * 
	 * @return
	 */
	public List<UUID> getDiseaseIds() {
		return diseaseIds;
	}

	/**
	 * This method is used to set the <List>diseaseIds.
	 * 
	 * @param exposures
	 */
	public void setDiseaseIds(List<UUID> diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

	/**
	 * Here we overrided the hashCode method based on the requirement.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Here we overrided the equals method based on the requirement.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	/**
	 * Here we overrided the toString method based on the requirement.
	 */
	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures=" + exposures.toString()
				+ ", diseaseIds=" + diseaseIds.toString() + ", patientId=" + patientId + "]";
	}

	/**
	 * Here we overrided the compareTo method based on the requirement.
	 */
	@Override
	public int compareTo(Patient o) {
		if (o.lastName.compareToIgnoreCase(this.lastName) != 0) {
			return o.lastName.compareToIgnoreCase(this.lastName);
		} else {
			return o.firstName.compareToIgnoreCase(this.firstName);
		}
	}

}
package edu.disease.asn2;

import java.util.Arrays;
import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 * @author DELL
 *
 */
public class Patient implements Comparable<Patient> {
	private String firstName, lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;
	UUID patientId;
	int maxDiseases, maxExposures;
	int index = 0, index1 = 0;

	/**
	 * 
	 * @param maxDiseases
	 * @param maxExposures
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (0 < maxDiseases && 0 < maxExposures) {
			this.maxDiseases = maxDiseases;
			this.maxExposures = maxExposures;
			diseaseIds = new UUID[maxDiseases];
			exposures = new Exposure[maxExposures];
		} else {
			throw new IllegalArgumentException("Enter a number!!");
		}
	}
	
	/**
	 * 
	 * @param diseaseId
	 */
	public void addDiseaseId(UUID diseaseId) {
		if (index < maxDiseases)
			diseaseIds[index++] = diseaseId;
		else
			throw new IndexOutOfBoundsException("Memory Full !!!");

	}
	
	/**
	 * 
	 * @param exposure
	 */
	public void addExposure(Exposure exposure) {
		if (index1 < maxExposures)
			exposures[index1++] = exposure;
		else
			throw new IndexOutOfBoundsException("Memory Full !!!");

	}

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * 
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
	 * 
	 */
	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures="
				+ Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + ", patientId="
				+ patientId + "]";
	}

	/**
	 * 
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

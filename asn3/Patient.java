package edu.disease.asn3;

import java.util.Arrays;

import java.util.UUID;

public class Patient implements Comparable<Patient> {
	private String firstName, lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;
	private UUID patientId;
	int maxDiseases, maxExposures;
	int i = 0, j = 0;

	public Patient(int maxDiseases, int maxExposures) {
		if (i < maxDiseases && i < maxExposures) {
			this.maxDiseases = maxDiseases;
			this.maxExposures = maxExposures;
			diseaseIds = new UUID[maxDiseases];
			exposures = new Exposure[maxExposures];
		} else {
			throw new IllegalArgumentException("Enter a number!!");
		}
	}

	public void addDiseaseId(UUID diseaseId) {
		if (i < maxDiseases)
			diseaseIds[i++] = diseaseId;
		else
			throw new IndexOutOfBoundsException("Memory Full !!!");

	}

	public void addExposure(Exposure exposure) {
		if (j < maxExposures)
			exposures[j++] = exposure;
		else
			throw new IndexOutOfBoundsException("Memory Full !!!");

	}

	public Exposure[] getExposures() {
		return exposures;
	}

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

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

package edu.disease.asn3;

import java.util.List;



import java.util.UUID;





public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;
	int maxDiseases, maxPatients;
	int i = 0, i1 = 0;


	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (0 < maxDiseases && 0 < maxPatients) {
			this.maxDiseases = maxDiseases;
			this.maxPatients = maxPatients;
			diseases = new Disease[maxDiseases];
			patients = new Patient[maxPatients];
		} else {
			throw new IllegalArgumentException("Enter a number");
		}
	}

	
	@Override
	public Disease addDisease(String name, boolean infectious) {
		if (i < maxDiseases) {
			if (infectious) {
				return diseases[i++] = new InfectiousDisease();
			} else {
				return diseases[i++] = new NonInfectiousDisease();
			}
		} else {
			throw new IllegalStateException("No more Disease can be Added !");
		}
	}


	@Override
	public Disease getDisease(UUID diseaseId) {
		for (int i = 0; i < maxDiseases; i++) {
			if ((diseases[i].getDiseaseId()).equals(diseaseId)) {
				return diseases[i];
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (i1 < maxPatients) {
			patients[i1] = new Patient(maxDiseases, maxExposures);
			patients[i1].setFirstName(firstName);
			patients[i1].setLastName(lastName);
			return patients[i1++];
		} else {
			throw new IllegalStateException("No more Patient can be Added to this array !!! ");
		}
	}

	
	@Override
	public Patient getPatient(UUID patientId) {
		for (int i = 0; i < maxPatients; i++) {
			if (patients[i].getPatientId().equals(patientId)) {
				return patients[i];
			}
		}
		return null;
	}


	@Override
	public void addDiseasetoPatient(UUID patientId, UUID diseaseId) {
		Patient patient = getPatient(patientId);
		Disease disease = getDisease(diseaseId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		if (disease == null) {
			throw new IllegalArgumentException("Invalid Disease Id !");
		}
		patient.addDiseaseId(disease.getDiseaseId());
	}

	
	@Override
	public void addExposuretoPatient(UUID patientId, Exposure exposure) {
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		patient.addExposure(exposure);
	}


	@Override
	public Disease[] getDiseases() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Patient[] getPatients() {
		// TODO Auto-generated method stub
		return null;
	}


}

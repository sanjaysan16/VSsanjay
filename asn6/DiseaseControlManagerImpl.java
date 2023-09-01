package edu.disease.asn6;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.*;

/**
 * This is an implementation class of interface{@link DiseaseControlManager}
 * called DiseaseControlManagerImpl. It has <List><Disease>. <List><Patient> as its fields.
 * @author DELL
 *
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private List<Disease> diseases;
	private List<Patient> patients;

	/**
	 * This is a constructor, used to intialize the diseases and patients <List>.
	 */
	public DiseaseControlManagerImpl() {
		diseases = new LinkedList<Disease>();
		patients = new LinkedList<Patient>();
	}

	/**
	 * This method is used to add the diseases in the <List><Disease>.
	 * If it is infectious, it will add InfectiousDisease.
	 * else, it will add NonInfectiousDisease. 
	 */
	@Override
	public List<Disease> addDisease(String name, boolean infectious) {
			if (infectious) {
				diseases.add(new InfectiousDisease());
				return diseases ;
			} else {
				diseases.add(new NonInfectiousDisease());
				return diseases;
			}
	}

	/**
	 * This method gives Disease, if the supplied diseaseId is matched, else it
	 * return <code>null.
	 */
	@Override
	public Disease getDisease(UUID diseaseId) {
		for (Disease disease : diseases) {
			if ((disease.getDiseaseId()).equals(diseaseId)) {
				return disease;
			}
		}
		return null;
	}

	/**
	 * This method is used to add the patients in the <List><Patient>.
	 */
	@Override
	public List<Patient> addPatient(String firstName, String lastName) {
			Patient patient = new Patient();
			patient.setFirstName(firstName);
			patient.setLastName(lastName);
			patients.add(patient);
			return patients;
	}

	/**
	 * This method gives Patient, if the supplied patientId is matched, else it
	 * return <code>null.
	 */
	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient patient : patients) {
			if ((patient.getPatientId()).equals(patientId)) {
				return patient;
			}
		}
		return null;
	}

	/**
	 * This method is used to add disease to the patient. If the patient or disease
	 * is <code>null, it will throw {@link IllegalArgumentException} with
	 * appropriate message.
	 */
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

	/**
	 * This method is used to add exposure to the patient. If the patient or disease
	 * is <code>null, it will throw {@link IllegalArgumentException} with
	 * appropriate message.
	 */
	@Override
	public void addExposuretoPatient(UUID patientId, Exposure exposure) {
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		patient.addExposure(exposure);
	}

	/**
	 * This method gives List of diseases.
	 */
	@Override
	public List<Disease> getDiseases() {
		return diseases;
	}

	/**
	 * This method gives List of patients.
	 */
	@Override
	public List<Patient> getPatients() {
		return patients;
	}
}
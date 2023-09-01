package edu.disease.asn6;

import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;

/**
 * This is an interface called DiseaseControlManager.
 * 
 * @author DELL
 *
 */
public interface DiseaseControlManager {
	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param name
	 * @param infectious
	 * @return
	 */
	public List<Disease> addDisease(String name, boolean infectious);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param diseaseId
	 * @return
	 */
	public Disease getDisease(UUID diseaseId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public List<Patient> addPatient(String firstName, String lastName);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param patientId
	 * @return
	 */
	public Patient getPatient(UUID patientId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param patientId
	 * @param diseaseId
	 */
	public void addDiseasetoPatient(UUID patientId, UUID diseaseId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param patientId
	 * @param exposure
	 */
	public void addExposuretoPatient(UUID patientId, Exposure exposure);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @return
	 */
	public List<Disease> getDiseases();

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @return
	 */
	public List<Patient> getPatients();
}
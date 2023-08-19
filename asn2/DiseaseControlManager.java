package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 * @author DELL
 *
 */
public interface DiseaseControlManager {
	/**
	 * 
	 * @param name
	 * @param infectious
	 * @return
	 */
	public Disease addDisease(String name, boolean infectious);

	/**
	 * 
	 * @param diseaseId
	 * @return
	 */
	public Disease getDisease(UUID diseaseId);

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param maxDiseases
	 * @param maxExposures
	 * @return
	 */
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * 
	 * @param patientId
	 * @return
	 */
	public Patient getPatient(UUID patientId);

	/**
	 * 
	 * @param patientId
	 * @param diseaseId
	 */
	public void addDiseasetoPatient(UUID patientId, UUID diseaseId);

	/**
	 * 
	 * @param patientId
	 * @param exposure
	 */
	public void addExposuretoPatient(UUID patientId, Exposure exposure);
}
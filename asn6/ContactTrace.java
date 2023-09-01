package edu.disease.asn6;

import java.util.List;


import edu.disease.asn3.Exposure;

/**
 * 
 * @author DELL
 *
 */
public class ContactTrace {

	List<Patient> patient;
	Exposure earlyExposure;
	PatientZero pZero;

	/**
	 * 
	 * @param diseaseControlManager
	 */
	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.patient = diseaseControlManager.getPatients();
	}

	/**
	 * 
	 * @param patient
	 * @return
	 */
	public PatientZero findPatientZero(Patient patient) {

		for (Exposure e : patient.getExposures()) {
			if (e.getExposureType().equalsIgnoreCase("D")) {
				if (earlyExposure == null || e.getDateTime().isBefore(earlyExposure.getDateTime())) {
					earlyExposure = e;
				}
			}
		}
		if (earlyExposure != null) {
			for (Patient p1 : this.patient) {
				for (Exposure e : p1.getExposures()) {
					if (e.getExposureType().equalsIgnoreCase("D")) {
						if (e.getDateTime().isBefore(earlyExposure.getDateTime())) {
							earlyExposure = e;
							pZero.setPatient(p1);
							pZero.setExposureDateTime(e.getDateTime());
							pZero.setExposed(true);
							return findPatientZero(p1);
						}
					}
				}
			}
		}
		return pZero;
	}
}
package edu.disease.asn6;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import edu.disease.asn3.Disease;
/**
 * This is a class called DiseaseFileRepository It has String folderPath as its
 * fields.
 * 
 * @author DELL
 */
public class DiseaseFileRepository {

	String folderPath;

	/**
	 * This method {@link Serialize} and saves the supplied disease and patient list
	 * data to two separate files.
	 * 
	 * @param diseases
	 * @param patients
	 * @throws Exception
	 */
	public void save(List<Disease> diseases, List<Patient> patients) throws Exception {
		FileOutputStream disease = new FileOutputStream(folderPath + "\\Disease.dat");
		ObjectOutputStream diseaseOutput = new ObjectOutputStream(disease);
		diseaseOutput.writeObject(diseases);
		diseaseOutput.close();

		FileOutputStream patient = new FileOutputStream(folderPath+"\\Patient.dat");
		ObjectOutputStream patientOutput = new ObjectOutputStream(patient);
		patientOutput.writeObject(patients);
		patientOutput.close();
	}

	/**
	 * This method accepts a file path to the folder where the data are serialized.
	 * It {@link De-serialize} the disease and patient data from its respective
	 * file. If the folderPath is <code>null, it will throw an
	 * {@link IllegalArgumentException} with an appropriate message.
	 * 
	 * @param folderPath
	 * @return
	 * @throws Exception
	 */
	public DiseaseAndPatient init(String folderPath) throws Exception {

		if (folderPath != null) {
			DiseaseAndPatient dp = new DiseaseAndPatient();
			this.folderPath = folderPath;

			FileInputStream disease = new FileInputStream(folderPath + "\\Disease.dat");
			ObjectInputStream diseaseInput = new ObjectInputStream(disease);
			List<Disease> d=(List<Disease>) diseaseInput.readObject();
			dp.setDiseases(d);
			diseaseInput.close();

			FileInputStream patient = new FileInputStream(folderPath + "\\Patient.dat");
			ObjectInputStream patientInput = new ObjectInputStream(patient);
			dp.setPatients((List<Patient>) patientInput.readObject());
			patientInput.close();
			return dp;
		} else {
			throw new IllegalArgumentException("Folder Empty !!!");
		}

	}
}
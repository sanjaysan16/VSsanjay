package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
public class DiseaseFileRepository {

	public void  save(Disease[] diseases,Patient[] patients) throws Exception {
		FileOutputStream diseasefile=new FileOutputStream("diseases.dat");
		ObjectOutputStream diseaseobject= new ObjectOutputStream(diseasefile);
		diseaseobject.writeObject(diseases);
		
		FileOutputStream patientfile =new FileOutputStream("patients.dat");
	    ObjectOutputStream patientobject=new ObjectOutputStream(patientfile);
	    patientobject.writeObject(patientobject);
	
	}
	public DiseaseAndPatient init(String folderpath) throws Exception {
		DiseaseAndPatient patientclassobject=new DiseaseAndPatient();
		
		if(folderpath!=null) {
			FileInputStream diseasefile=new FileInputStream(folderpath+"\\diseases.dat");
			ObjectInputStream diseasefileobject=new ObjectInputStream(diseasefile);
			patientclassobject.setDiseases((Disease[])diseasefileobject.readObject());
			FileInputStream patientfile=new FileInputStream(folderpath+"\\patients.dat");
			ObjectInputStream patientfileobject=new ObjectInputStream(patientfile);
			patientclassobject.setPatients((Patient[])patientfileobject.readObject());
		} else {
			throw new IllegalArgumentException("Supplied folder path is null!!");
		}
	
		return new DiseaseAndPatient() ;
	}
}

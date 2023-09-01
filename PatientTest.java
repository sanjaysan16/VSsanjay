package edu.disease.asn2;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;
import edu.disease.asn1.Patient;

public class PatientTest {
	// Patient p1 = new Patient();
	UUID[] diseaseid;
	Exposure[] exposures;
	Patient patient;
	@Test
	void atest() {
		Patient p = new Patient(2, 2);
	}

	@Test
	void throwstest1() {

		assertThrows(IllegalArgumentException.class, () -> new Patient(2, -1));

	}

	@Test
	void btest() {
		Patient p = new Patient(2, 2);
		p.addDiseaseId(UUID.randomUUID());
		p.addDiseaseId(UUID.randomUUID());
		UUID[] p1 = p.getDiseaseIds();
		assertTrue(p1[0] instanceof UUID && p1[0] instanceof UUID);
	}

	@Test
	void throwtest1() {
		Patient p = new Patient(1, 1);
		p.addDiseaseId(UUID.randomUUID());
		assertThrows(IndexOutOfBoundsException.class, () -> p.addDiseaseId(UUID.randomUUID()));
	}
	@Test
	void ctest() {
		Patient p = new Patient(1, 1);
       p.addExposure(new Exposure(null));
		assertThrows(IndexOutOfBoundsException.class, () -> p.addExposure(new Exposure(null)));

	}
	@Test
	void etest() {
		Patient p = new Patient(1, 1);
		String name="Sanjay";
       p.setFirstName(name);
       
       assertEquals(name, p.getFirstName());
	}
	@Test
	void htest() {
		Patient p = new Patient(1, 1);
    String name="v";
    p.setLastName(name);
    assertEquals(name, p.getLastName());
	}
	@Test
	void ftest() {
		Patient p = new Patient(1, 1);
     
     p.setDiseaseIds(diseaseid);
     assertEquals(diseaseid, p.getDiseaseIds());
	}
	@Test
	void gtest() {
		Patient p = new Patient(1, 1);
       p.setExposures(exposures);
       assertEquals(exposures,p.getExposures());
       
	}
	@Test
	void itest() {
		Patient p = new Patient(1, 1);
		Patient p1 = new Patient(2, 1);
		assertEquals(p.hashCode(), p1.hashCode());

	}
	@Test
	void equaltest1() {
		Patient p = new Patient(1, 1);
		assertTrue(p.equals(p));
		
	}
	@Test
	void equaltest2()
	{
		Patient p = new Patient(1, 1);
		Patient p1 = null;
    assertFalse(p.equals(p1));
		
	}
	@Test
	void equalstest3() {
		Patient p = new Patient(1, 1);
		Exposure e=new Exposure(UUID.randomUUID());
		assertFalse(p.equals(e));
	}
	@Test
	void equalstest4() {
		Patient p = new Patient(1, 1);
		assertTrue(p.equals(p));
		
	}
	@Test
	void tostring() {
		Patient p = new Patient(1, 1);
       assertNotNull(p.toString());
    
	}
	@Test
	void com() {
		Patient p = new Patient(1, 1);

		String name1="sanjay";
		String name2="benin";
		assertTrue(name1.equals(name2));
	}

}

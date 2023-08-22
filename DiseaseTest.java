package edu.disease.asn1;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.UUID;

import org.junit.jupiter.api.Test;

public class DiseaseTest {
	Disease d = new Disease();

	@Test
	public void atest() {
		d.setDiseaselds(UUID.randomUUID());
		UUID id = d.getDiseaselds();
		assertTrue(d.diseaselds == id);
	}

	@Test
	public void btest() {
		d.setName("san");
		String name = d.getName();
		assertEquals("san", name);
	}

	@Test
	public void ctest() {

		Disease disease1 = new Disease("Flu");
		Disease disease2 = new Disease("Flu");

		assertEquals(disease1.hashCode(), disease2.hashCode());
	}

	@Test
	public void testEqualsSameObject() {
		Disease disease = new Disease("Flu");

		assertTrue(disease.equals(disease));
	}

	@Test
	public void testEqualsNullObject() {
		Disease disease = new Disease("Flu");

		assertFalse(disease.equals(null));
	}

	@Test
	public void testEqualsDifferentClass() {
		Disease disease = new Disease("Flu");
		Object obj = new Object();

		assertFalse(disease.equals(obj));
	}

	@Test
	public void testEqualsEqualObjects() {
		Disease disease1 = new Disease("Flu");
		Disease disease2 = new Disease("Flu");

		assertTrue(disease1.equals(disease2));
	}

	@Test
	public void testEqualsDifferentObjects() {
		Disease disease1 = new Disease("Flu");
		Disease disease2 = new Disease("COVID-19");

		assertTrue(disease1.equals(disease2));
	}

	@Test
	public void testEqualsNullFields() {
		Disease disease1 = new Disease(null);
		Disease disease2 = new Disease(null);

		assertTrue(disease1.equals(disease2));
	}

	@Test
	public void testEqualsMixedFields() {
		Disease disease1 = new Disease("Flu");
		Disease disease2 = new Disease(null);

		assertTrue(disease1.equals(disease2));
	}
}

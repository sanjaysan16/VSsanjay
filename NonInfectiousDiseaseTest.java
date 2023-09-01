package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NonInfectiousDiseaseTest {

	@Test
	void testGetExamples() {
		String[] nonInfectiousDisease = { "Heart Disease", "Cancer", " Alzheimer's disease", "Diabetes" };
		NonInfectiousDisease NID = new NonInfectiousDisease();
		assertArrayEquals(nonInfectiousDisease, NID.getExamples());
	}

}

package edu.disease.asn3;



public class NonInfectiousDisease extends Disease{
	/**
	 * 
	 */
	@Override
	public String[] getExamples() {
		String[] nonInfectiousDisease = {"Heart Disease", "Cancer", " Alzheimer's disease", "Diabetes"};
		return nonInfectiousDisease;
	}
}
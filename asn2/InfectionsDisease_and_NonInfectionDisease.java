package edu.disease.asn2;

 class InfectiousDisease extends Disease{
	/**
	 * 
	 */
	@Override
	public String[] getExamples() {
		String[] infectiousDisease = {"Influenza (flu)", "Chickenpox", "HIV/AIDS", "Diphtheria"};
		return infectiousDisease;
	}
}

/**
 * 
 * @author DELL
 *
 */
class NonInfectiousDisease extends Disease{
	/**
	 * 
	 */
	@Override
	public String[] getExamples() {
		String[] nonInfectiousDisease = {"Heart Disease", "Cancer", " Alzheimer's disease", "Diabetes"};
		return nonInfectiousDisease;
	}
}
package edu.disease.asn1;
import java.util.UUID;



public class Disease {
	UUID diseaselds;
	String name;
	public UUID getDiseaselds() {
		return diseaselds;
	}
	public void setDiseaselds(UUID diseaselds) {
		this.diseaselds = diseaselds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaselds == null) ? 0 : diseaselds.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		if (diseaselds == null) {
			if (other.diseaselds != null)
				return false;
		} else if (!diseaselds.equals(other.diseaselds))
			return false;
		return true;
	}
	

}


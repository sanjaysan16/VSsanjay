package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

	
public class InfectiousDiseaseTest {
	
		@Test
		void test() {
			String[] infectiousDisease = { "Influenza (flu)", "Chickenpox", "HIV/AIDS", "Diphtheria" };
			InfectiousDisease ID = new InfectiousDisease();
			assertArrayEquals(infectiousDisease, ID.getExamples());
		}

	}

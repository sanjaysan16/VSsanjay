package edu.disease.asn2;

import static org.junit.Assert.*;


import java.util.UUID;

import org.junit.*;

public class DiseaseTest2 {
	Disease Disease=new InfectiousDisease();
    @Test
  public void atest() {
    	Disease.setDiseaseId(UUID.randomUUID());
    	Disease.getDiseaseId();
    }
    @Test
    public void btest() {
    	Disease.setName("sanjay");
    	
    	assertEquals("sanjay", Disease.getName());
    }
    @Test
    public void ctest() {
    	Disease.getExamples();
    	assertFalse(false);
    }
    @Test
    public void dtest() {

        assertNotNull(Disease.hashCode());

    }
    @Test
    public void etest() {
    	Disease d1=new InfectiousDisease();
    	Disease d2=new InfectiousDisease();
    	assertTrue(d1.equals(d2));
    	
    }
    
    @Test
    public void ftest() {
    	Disease d1=new InfectiousDisease();
    	//Disease d2=new InfectiousDisease();
    	
    	assertTrue(d1.equals(d1));
    	
    }
    @Test
    public void itest() {
    	Disease d1=new InfectiousDisease();
    	//Disease d2=new InfectiousDisease();
    	
    	assertTrue(d1.equals(d1));
    	
    }
    @Test
    public void gtest() {
    	Disease d1=new InfectiousDisease();
    	Disease d2=new InfectiousDisease();
    	
    	assertFalse(d1.equals(null));
    	
    }
    @Test
    public void htest() {
    	Disease d1=new InfectiousDisease();
    	Disease d2=new InfectiousDisease();
    	
    	assertFalse(d1.equals(new NonInfectiousDisease()));
    	
    }
    @Test
    public void mtest() {
    	Disease new1=new InfectiousDisease();
    	Disease new2=new InfectiousDisease();
    	UUID e2 = null;
    	UUID e1=new2.getDiseaseId();
    
    	assertFalse(e1!=e2);
    	UUID e3=null;
    	assertFalse(e3!=e2); 	
    }
    @Test
    public void ddtest() {
    	assertNotNull(Disease.toString());
    }
}

package Lab1;

public interface Playable {
      public void play();
      
     // public static void main(String[]args) {
    	//  Guitar g=new Guitar();
    	 // Piano p =new Piano();
    	//  g.play();
    	//  p.play();
    	  
    //  }
      
}

class Guitar implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar");
	}
	
}

class Piano implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano");
	}
	
}

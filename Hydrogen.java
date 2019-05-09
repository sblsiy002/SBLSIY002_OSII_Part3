

public class Hydrogen extends Thread {

	private static int carbonCounter =0;
	private int id;
	private Methane sharedMethane;
	
	
	public Hydrogen(Methane methane_obj) {
		Hydrogen.carbonCounter+=1;
		id=carbonCounter;
		this.sharedMethane = methane_obj;
		
	}
	
	public void run() {
	    try {
sharedMethane.mutex.acquire();
sharedMethane.addHydrogen();
if(sharedMethane.getCarbon>=1 && sharedMethane.getHydrogen()>=4{
	    	 // you will need to fix below
	    	System.out.println("---Group ready for bonding---");			 
	    	sharedMethane.hydrogensQ.release(4);
sharedMethane.removeHydrogen(4);
sharedMethane.carbonQ.release();
sharedMethane.removeCarbon(1);
              
}else{sharedMethane.mutex.release();}
sharedMethane.hydrogensQ.acquire();

sharedMethane.bond("H"+ this.id);
sharedMethane.barrier.b_wait();
	    }
	   catch (InterruptedException ex) { /* not handling this  */}
	    //System.out.println(" ");
	}

}

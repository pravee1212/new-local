package org.tcs.allvehicli;

import org.tcs.fourwheeler.FourWheeler;
import org.twowheeler.TwoWheller;

public class Vehicli {
	public void VehicleNecessery() {
		// TODO Auto-generated method stub
System.out.println("VehicleNecessery");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicli v = new Vehicli();
		v.VehicleNecessery();
		TwoWheller t = new TwoWheller();
		t.bike();
		t.cycle();
		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();
		
	}

}

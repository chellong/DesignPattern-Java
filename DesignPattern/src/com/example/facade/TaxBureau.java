package com.example.facade;

public interface TaxBureau {
	void taxCertificate();  
}


class BejinTBureau implements TaxBureau {

	@Override
	public void taxCertificate() {
		System.out.println("税务大哥，收你钱");
	}

}

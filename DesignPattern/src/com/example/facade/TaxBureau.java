package com.example.facade;

public interface TaxBureau {
	void taxCertificate();  
}


class BejinTBureau implements TaxBureau {

	@Override
	public void taxCertificate() {
		System.out.println("˰���磬����Ǯ");
	}

}

package com.src.service;

import com.src.model.TaxDetails;

public interface IncomeTaxService {

	
	TaxDetails getByTaxid(int taxId);

}

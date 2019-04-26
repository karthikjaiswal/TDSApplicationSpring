package com.src.dao;

import com.src.model.TaxDetails;

public interface IncomeTaxDao {

	TaxDetails getByTaxid(int taxId);
}

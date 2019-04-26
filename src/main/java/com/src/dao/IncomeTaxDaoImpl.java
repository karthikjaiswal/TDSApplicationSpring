package com.src.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.src.model.TaxDetails;

@Component("incomeTaxDao")
@Repository
@ComponentScan("com")
public class IncomeTaxDaoImpl implements IncomeTaxDao{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public TaxDetails getByTaxid(int taxId) {
		TaxDetails taxDetails=entityManager.find(TaxDetails.class, taxId);
		return taxDetails;
	}

}



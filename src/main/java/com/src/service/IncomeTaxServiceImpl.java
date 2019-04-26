package com.src.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.src.dao.IncomeTaxDao;
import com.src.model.TaxDetails;

@Component("incomeTaxService")
@Service
@Transactional
public class IncomeTaxServiceImpl implements IncomeTaxService{

	@Autowired
	IncomeTaxDao incomeTaxDao;

	@Override
	public TaxDetails getByTaxid(int taxId) {
	
		return incomeTaxDao.getByTaxid(taxId);
	}

}



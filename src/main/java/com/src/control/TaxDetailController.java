package com.src.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.src.exception.UserNotFoundException;
import com.src.model.TaxDetails;
import com.src.service.IncomeTaxService;

@RestController
public class TaxDetailController {

	@Autowired
	IncomeTaxService incomeTaxService;
	
	@GetMapping("/")
	public String dedault() {
		return "Hello";
	}
	
	@GetMapping("/user/tds/{taxId}")
	public TaxDetails getByPid(@PathVariable int taxId)
	{
		TaxDetails taxDetails=incomeTaxService.getByTaxid(taxId);
		if (taxDetails == null) 
		{
			throw new UserNotFoundException("ID Not Found wrong ID : " + taxId);
		} 
		else
			return taxDetails;
	}	
}


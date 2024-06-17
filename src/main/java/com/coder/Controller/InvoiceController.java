package com.coder.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coder.model.Invoice;
import com.coder.service.InvoiceService;


@RestController
@CrossOrigin
public class InvoiceController {
	@Autowired
 InvoiceService invoiceService;
	
	@PostMapping("/invoice")
	public Invoice addInvoice(@RequestBody Invoice invoice) {
		return this.invoiceService.addInvoice(invoice);
	}
	@GetMapping("/invoice")
	public List<Invoice> getInvoices(){
		return this.invoiceService.getInvoices();
	}
	@DeleteMapping("/invoice/{invoiceId}")
	public Invoice deleteInvoice(@PathVariable String inovoiceId) {
		return this.invoiceService.deleteInvoice(Long.parseLong(inovoiceId));
		
	}
}

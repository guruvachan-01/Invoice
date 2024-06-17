package com.coder.service;

import java.util.List;


import com.coder.model.Invoice;

public interface InvoiceService {
  public Invoice addInvoice(Invoice invoice);
  
 
  
  public Invoice deleteInvoice(long id);

public List<Invoice> getInvoices();






}

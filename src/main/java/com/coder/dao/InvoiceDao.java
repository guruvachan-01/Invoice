package com.coder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {



}

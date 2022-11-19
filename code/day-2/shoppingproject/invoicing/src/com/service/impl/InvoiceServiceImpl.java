package com.service.impl;

import com.model.Invoice;
import com.service.InvoiceService;

import java.util.List;
public class InvoiceServiceImpl implements InvoiceService {
    @Override
    public List<Invoice> getInvoices(){
        System.out.println("imp1 of invoice service");
        List<Invoice>invoices=List.of(new Invoice(555), new Invoice(800));

        return invoices;
    }
}

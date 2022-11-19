package com.service;

import com.model.Invoice;
import com.service.impl.InvoiceServiceImpl;
import com.service.impl.InvoiceServiceImpl2;

import java.util.List;

public interface InvoiceService {
    public List<Invoice> getInvoices();
    public static InvoiceService build(){
        return new InvoiceServiceImpl2();
    }
}

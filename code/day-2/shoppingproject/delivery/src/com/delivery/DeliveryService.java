package com.delivery;
import com.model.Invoice;
import com.service.InvoiceService;
import  java.util.*;

public class DeliveryService {
    private InvoiceService invoiceService=InvoiceService.build();
    public List<Invoice> delivery(){
        //invoiceService.getInvoices().forEach(i-> System.out.println(i));
        System.out.println("doing some process of delivery...");
        return invoiceService.getInvoices();
    }
}

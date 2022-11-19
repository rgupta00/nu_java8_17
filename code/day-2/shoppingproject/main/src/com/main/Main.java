package com.main;
import java.util.*;
import com.delivery.DeliveryService;
import com.model.Invoice;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService=new DeliveryService();
       List<Invoice>Invoice=   deliveryService.delivery();
        Invoice.stream().forEach(i-> System.out.println(i));
    }
}
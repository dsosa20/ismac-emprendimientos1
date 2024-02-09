package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	    FacturaService facturaservice = context.getBean(FacturaService.class);

	    // Probar findAll
	    List<FacturaDetalle> detalles = facturaservice.findAll();
	    
	    // Imprimir resultados
	    for(FacturaDetalle item : detalles) {
	    	System.out.println(item.toString());
	    }
	    
	    // Probar findOne
//	    Factura factura = facturaservice.findOne(1);
//	    System.out.println(factura);
	    
	    //add Fcatura
//	    facturaservice.add(0,"F0002",new Date(),100,0.12,112,1,1,1);
	    
	    //add Factura Detalle
//	    facturaservice.add(0,"Producto E",2,50,100,0,0,1,1);
	    
	    // Probar findMax
//	    int maxId = facturaservice.findMax();
//	    System.out.println("Max ID:" + maxId);

	    // Probar findOne por número
//	    int id = facturaservice.findOne("F2023006");
//	    System.out.println("ID Factura: " + id);
	    
		context.close();
	}

}

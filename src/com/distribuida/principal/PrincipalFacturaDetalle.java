package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.Empresa_productoDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.entities.Empresa_producto;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDetalleDAO facturadetalleDAO = context.getBean("facturaDetalleDAOImpl",FacturaDetalleDAO.class); 
		
//		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class);
//		Empresa_productoDAO empresa_productoDAO = context.getBean("empresa_productoDAOImpl",Empresa_productoDAO.class);
		
		FacturaDetalle facturadetalle1 = new FacturaDetalle(0,"Producto 1", 2 , 1.20 , 10.00, 0.99 , 1.20);
		facturadetalleDAO.add(facturadetalle1);
		System.out.println(facturadetalleDAO.findOne(10));
		
		FacturaDetalle facturadetalle2 = new FacturaDetalle(12,"Producto 1", 7 , 1.20 , 10.00, 0.99 , 1.20);
		facturadetalleDAO.up(facturadetalle2);
		System.out.println(facturadetalleDAO.findOne(12));
		try {facturadetalleDAO.del(15); } catch (Exception e) {e.printStackTrace();}
		
		for(FacturaDetalle facturadetalle : facturadetalleDAO.findAll()) {
			System.out.println(facturadetalle.toString());
		}
		
		
		
		//CRUD
		
//		//FindAll
//		List<FacturaDetalle> facturadetalles = facturadetalleDAO.findAll();
//		
//		for(FacturaDetalle item : facturadetalles) {
//			System.out.println(item.toString());
//		}
		//findOne
//		FacturaDetalle facturadetalle = facturadetalleDAO.findOne(3);
//		System.out.println(facturadetalle.toString());	
		//add
//		Factura factura = facturaDAO.findOne(5);
//		Empresa_producto empresa_producto = empresa_productoDAO.findOne(1);
//		
//		FacturaDetalle facturadetalle = new FacturaDetalle(0, "Producto A", 7, 10.40, 71.20, 5.10, 1.05, factura, empresa_producto);
//		facturadetalleDAO.add(facturadetalle);		
		//up
//		Factura factura1 = facturaDAO.findOne(4);
//		Empresa_producto empresa_producto1 = empresa_productoDAO.findOne(2);
//		
//		FacturaDetalle facturadetalle1 = new FacturaDetalle(16, "Producto D", 3, 5.40, 15.20, 1.10, null, factura1, empresa_producto1);
//		facturadetalleDAO.up(facturadetalle1);	
		//del
//		facturadetalleDAO.del(16);
		
		context.close();
	}

}

package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FormaPagoDAO;
import com.distribuida.dao.PedidoDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FormaPago;
import com.distribuida.entities.Pedido;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class);
//		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
//		PedidoDAO pedidoDAO = context.getBean("pedidoDAOImpl",PedidoDAO.class);
//		FormaPagoDAO formapagoDAO = context.getBean("formaPagoDAOImpl",FormaPagoDAO.class);
		
		Factura factura1 = new Factura(0,"Fac-0012",new Date(),100.00,0.12,102.00);
		facturaDAO.add(factura1);
		System.out.println(facturaDAO.findOne(4));
		
		Factura factura2 = new Factura(3,"Fac-0010",new Date(),90.00,0.12,95.00);
		facturaDAO.up(factura2);
		System.out.println(facturaDAO.findOne(4));
		try {facturaDAO.del(11); } catch (Exception e) {e.printStackTrace();}
		
		for(Factura factura : facturaDAO.findAll()) {
			System.out.println(factura.toString());
		}
		
		
		//GRUD
		
//		//FindAll
//		List<Factura> facturas = facturaDAO.findAll();
//		
//		for(Factura item : facturas ) {
//			System.out.println(item.toString());
//		}		
		//findOne
//		Factura factura = facturaDAO.findOne(3);
//		System.out.println(factura.toString());
		//add
//		Cliente cliente = clienteDAO.findOne(1);
//		Pedido pedido = pedidoDAO.findOne(2);
//		FormaPago formapago =  formapagoDAO.findOne(2);
//		
//		Factura factura = new Factura(0,"F2023009", new Date() , 123.36, 0.12, 140.56,cliente,pedido,formapago);
//		facturaDAO.add(factura);		
		//up
//		Cliente cliente1 = clienteDAO.findOne(5);
//		Pedido pedido1 = pedidoDAO.findOne(5);
//		FormaPago formapago1 =  formapagoDAO.findOne(1);
//		
//		Factura factura1 = new Factura(10,"F2023010", new Date() , 120.99, 0.12, 121.99,cliente1,pedido1,formapago1);
//		facturaDAO.up(factura1);
		//del
//		facturaDAO.del(10);
		
		//findMax
//		int maxId = facturaDAO.findMax();
//		System.out.println("Max ID: " + maxId);
		    
		//findOne(numerofactura)
//		int factura = facturaDAO.findOne("F2023005");
//		System.out.println("Factura encontrada: " + factura);
		
//	    List<Factura> facturasEncontradas = facturaDAO.findAll("2023");
//
//        for (Factura factura : facturasEncontradas) {
//            System.out.println("Factura: " + factura.getNumFactura());
//     
//        }
		
//	    List<Factura> facturasEncontradas = facturaDAO.findAll("2023");
//
//        for (Factura factura : facturasEncontradas) {
//            System.out.println("Factura: " + factura.getNumFactura());
//     
//        }
		
		context.close();
	}

}

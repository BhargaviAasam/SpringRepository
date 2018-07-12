package com.spi.mysore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
	
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	ItemAttributesDAO itemDAO = (ItemAttributesDAO) context.getBean("itemAttributesDAOImpl");
	ItemAttributes ia = (ItemAttributes) context.getBean("iaElement1");
	itemDAO.createItem(ia);
	ItemAttributes iaReturnFromDB = itemDAO.getByItemId(4);
	System.out.println(iaReturnFromDB.getItem_name());
}
}

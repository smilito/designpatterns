package smilito.designpatterns.decorator;

import smilito.designpatterns.composite.ProductCatalogComponent;
import smilito.designpatterns.composite.ProductComponent;

public class CompositeRunclass {
	
	public static void run(){
		System.out.println("BEGIN 	COMPOSITE PATTERN ================");
		ProductCatalogComponent pcc = new ProductCatalogComponent("ProductCatalog");
		ProductComponent pc = new ProductComponent("Spoon", 123.4);
		pcc.add(pc);
		pc = new ProductComponent("Dish",121.11);
		pcc.add(pc);
		ProductCatalogComponent generalPcc = new ProductCatalogComponent("General ProductCatalog");
		pc = new ProductComponent("Knife", 12.23);
		generalPcc.add(pc);
		generalPcc.add(pcc);
		
		generalPcc.print();
		
		System.out.println("END	COMPOSITE PATTERN ================");
		
	}

}

public class PruebaFactura {

	public static void main(String[] args) {
		Factura factura1 = new Factura("A1024", "Teclado Inalámbrico Genius", 5, 299.50);
		Factura factura2 = new Factura("A1025", "Mouse Inalámbrico Genius", 5, 105.75);
		Factura factura3 = new Factura("A1026", "Mouse Pad Promoción (Regalo)", 5, 0);
		
		System.out.println(factura1.toString());
		System.out.println("Total de la Factura: " + factura1.getTotalFactura() + "\n");
		System.out.println(factura2.toString());
		System.out.println("Total de la Factura: " + factura2.getTotalFactura()+ "\n");
		System.out.println(factura3.toString());
		System.out.println("Total de la Factura: " + factura3.getTotalFactura());
	
	} // main
}//class PruebaFactura

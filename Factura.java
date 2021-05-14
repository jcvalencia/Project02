public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numero, String descripcion, int cantidad, double precio) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}//constructor

    public double getTotalFactura() {
    	if ((cantidad<=0) || (precio<=0)) {
    		return 0;
    	} else {
    		return cantidad * precio;
    	}//else //if cantidad<=0 
    }//getTotalFactura
    
	public String getNumero() {
		return numero;
	}//getNumero
	public void setNumero(String numero) {
		this.numero = numero;
	}//setNumero
	public String getDescripcion() {
		return descripcion;
	}//getDescripcion
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion
	public int getCantidad() {
		return cantidad;
	}//getCantidad
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}//setCantidad
	public double getPrecio() {
		return precio;
	}//getPrecio
	public void setPrecio(double precio) {
		this.precio = precio;
	}//setPrecio

	@Override
	public String toString() {
		
		return "======================================================================================================\n"
				+ "Factura [numero=" + numero + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}// toString();
	
}//class Factura 

package logica;

public class Articulo {
	private int codigo;
	private String nombre;
	private double precioCosto;
	private int unidades;
	
	
	public double precioVenta() {
		double precioVenta;
		precioVenta = precioCosto + (precioCosto*20/100);
		return precioVenta;
	}


	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Articulo(int codigo, String nombre, double precioCosto, int unidades) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioCosto = precioCosto;
		this.unidades = unidades;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioCosto() {
		return precioCosto;
	}


	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precioCosto=" + precioCosto + ", unidades="
				+ unidades + ", precio de venta=" + precioVenta() + "]";
	}
	

}

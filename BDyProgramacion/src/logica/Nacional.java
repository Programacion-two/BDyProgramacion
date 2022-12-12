package logica;

public class Nacional {
	public class Nacionales extends Articulo {
		
		private String departamento;
		private boolean subsidiado;
		
		public double precioVenta() {
	    	if(subsidiado==true) {
	    		return super.precioVenta();
	    	}else
	    		if (subsidiado==false && departamento=="Montevideo") {
	    			return super.precioVenta()*100*0.15+super.precioVenta();
	    	}else {
	    		return super.precioVenta()*100*0.10+super.precioVenta();
	    	}
	    }

		
		
		public Nacionales() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Nacionales(int codigo, String nombre, double precioCosto, int unidades, String departamento, boolean subsidiado) {
			super(codigo, nombre, precioCosto, unidades);
			this.departamento = departamento;
			this.subsidiado = subsidiado;
		}

		


		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		public boolean isSubsidiado() {
			return subsidiado;
		}

		public void setSubsidiado(boolean subsidiado) {
			this.subsidiado = subsidiado;
		}



		@Override
		public String toString() {
			return "Nacionales [departamento=" + departamento + ", subsidiado=" + subsidiado + ", precio de venta= " + precioVenta() + ", toString()=" + super.toString()
					+ "]";
		}
		
	}
}

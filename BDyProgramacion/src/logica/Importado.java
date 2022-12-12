package logica;

public class Importado extends Articulo {
		private double impuesto;
		private int anioImportacion;
		
		public double precioVenta() {
	    	if(anioImportacion<=2008) {
	    		return super.precioVenta()*100*0.8;
	    	}else {
	    		return super.precioVenta()*100*0.10;
	    	}
	    }

		public Importado() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Importado(int codigo, String nombre, double precioCosto, int unidades, double impuesto, int anioImportacion) {
			super(codigo, nombre, precioCosto, unidades);
			this.impuesto = impuesto;
			this.anioImportacion = anioImportacion;
		}

		public double getImpuesto() {
			return impuesto;
		}

		public void setImpuesto(double impuesto) {
			this.impuesto = impuesto;
		}

		public int getAnioImportacion() {
			return anioImportacion;
		}

		public void setAnioImportacion(int anioImportacion) {
			this.anioImportacion = anioImportacion;
		}

		@Override
		public String toString() {
			return "Importado [impuesto=" + impuesto + ", anioImportacion=" + anioImportacion + ", precio de venta= " + precioVenta() + ", toString()=" + super.toString() + "]";
		}
		
		
		
	}

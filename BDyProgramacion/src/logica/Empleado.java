package logica;

public class Empleado extends Persona {
		private double salario;
		private Fecha antiguedad;
		private String categoria;
		
	
		public Empleado() {
			salario=50000;
			
		}
		
		
		public Empleado(String nombre, String apellido, String cedula, double salario, Fecha antiguedad, String categoria) {
			super(nombre,apellido, cedula);
			this.salario = salario;
			this.antiguedad = antiguedad;
			this.categoria = categoria;
		}



		
		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}


		public Fecha getAntiguedad() {
			return antiguedad;
		}


		public void setAntiguedad(Fecha antiguedad) {
			this.antiguedad = antiguedad;
		}


		public String getCategoria() {
			return categoria;
		}


		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}


		public double sueldoAnual() {
			return salario*12;
		}
		
		public double presentismo() {
			return salario=salario + salario*0.10;
		}
		
		
		@Override
		public String toString() {
			return "[" + "toString: " + super.toString() + "]" + "[" + "Salario: " + salario + "] " 
		+ "[" + "Antiguedad: " + antiguedad.toString() + "]" + "Categoria: " + categoria + "]" + "[" + "Sueldo anual es: " + sueldoAnual() + "]";
		}


}

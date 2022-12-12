package logica;

public class Cliente extends Persona {
	private boolean preferencial;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre,String apellido,String cedula, boolean preferencial) {
		super(nombre, apellido,cedula);
		this.preferencial = preferencial;

		// TODO Auto-generated constructor stub
	}

	public boolean isPreferencial() {
		return preferencial;
	}

	public void setPreferencial(boolean preferencial) {
		this.preferencial = preferencial;
	}

	@Override
	public String toString() {
		return "Cliente [toString=" + super.toString() + "] [Preferencial=" + preferencial + "]";
	}

	
	
}

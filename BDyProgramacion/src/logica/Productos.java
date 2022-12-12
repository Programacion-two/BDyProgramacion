package logica;

import java.util.ArrayList;

public class Productos {
	private ArrayList<Articulo> lista;
	
	public Articulo buscar(int codigo) {
		lista = new ArrayList<>();
		return null;
		
	}

	

	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void agregar(Articulo a) {
		lista.add(a);
		
	}
	
	public Articulo devolver(int i) {
		return (lista.get(i));
	
	}
	


	public Productos(ArrayList<Articulo> lista) {
		super();
		this.lista = lista;
	}

	public ArrayList<Articulo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Articulo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Productos [lista=" + lista + "]";
	}
	
	

}

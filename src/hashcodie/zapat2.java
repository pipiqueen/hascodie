package hashcodie;

public class zapat2 {

	private String Nombre;
	private int Talle; 
	private boolean Vendido;
	
	public zapat2 (String Nombre, int Talle, boolean Vendido) {
		this.Nombre= Nombre; 
		this.Talle= Talle;
		this.Vendido= Vendido; 
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + Talle;
		result = prime * result + (Vendido ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof zapat2))
			return false;
		zapat2 other = (zapat2) obj;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (Talle != other.Talle)
			return false;
		if (Vendido != other.Vendido)
			return false;
		return true;
	}
	
}

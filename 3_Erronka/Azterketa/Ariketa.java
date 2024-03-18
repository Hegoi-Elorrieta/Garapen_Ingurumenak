package Azterketa;

import java.util.Objects;

public class Ariketa {
	
	String izena;
	String abizena;
	int adina;
	
	public Ariketa(String izena, String abizena, int adina) {
		super();
		this.izena = izena;
		this.abizena = abizena;
		this.adina = adina;
	}
	
	public Ariketa() {
		
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	@Override
	public String toString() {
		return "Ariketa [izena=" + izena + ", abizena=" + abizena + ", adina=" + adina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizena, adina, izena);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ariketa other = (Ariketa) obj;
		return Objects.equals(abizena, other.abizena) && adina == other.adina && Objects.equals(izena, other.izena);
	}

}

package valuta;

public class Valuta {

	private String naziv;
	private String skracenica;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty()) {
			throw new RuntimeException("Naziv valute ne sme biti null ili prazan string.");
		} else {
			this.naziv = naziv;
		}

	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		if (skracenica == null || skracenica.length()<4) {
			throw new RuntimeException("Skracenica valute ne sme biti null ili string kraci od 4 karaktera.");
		} else {
			this.skracenica = skracenica;
		}

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Naziv valute: " + naziv + ", skracenica: " + skracenica;
	}

	
	
	
}

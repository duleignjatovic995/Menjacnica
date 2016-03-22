package valuta;

import java.util.GregorianCalendar;

/**
 * @author Dule
 *
 */
public class DnevniKurs {

	GregorianCalendar datum;
	Valuta valuta;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	

	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null) {
			throw new RuntimeException("Datum ne sme biti null.");
		} else {
			this.datum = datum;
		}
	}
	public Valuta getValuta() {
		return valuta;
	}
	public void setValuta(Valuta valuta) {
		if (valuta==null) {
			throw new RuntimeException("Valuta ne sme biti null.");
		} else {
			this.valuta = valuta;
		}

	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0) {
			throw new RuntimeException("Prodajni kurs ne sme biti manji od nule.");
		} else {

		}
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0) {
			throw new RuntimeException("Kupovni kurs ne sme biti manji od nule.");
		} else {
			this.kupovniKurs = kupovniKurs;
		}

	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0) {
			throw new RuntimeException("Srednji kurs ne sme biti manji od nule.");
		} else {
			this.srednjiKurs = srednjiKurs;
		}

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
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
		DnevniKurs other = (DnevniKurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DnevniKurs: datum: " + datum + ", valuta:" + valuta + ", prodajniKurs:" + prodajniKurs + ", kupovniKurs:"
				+ kupovniKurs + ", srednjiKurs:" + srednjiKurs;
	}
	
	
	
}

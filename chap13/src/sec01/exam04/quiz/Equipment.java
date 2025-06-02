package sec01.exam04.quiz;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerday;
	
	public Equipment() {
	}

	public Equipment(String name, int pricePerday) {
		this.name = name;
		this.pricePerday = pricePerday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerday);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		return Objects.equals(name, other.name) && pricePerday == other.pricePerday;
	}

	@Override
	public String toString() {
		return "- " + name + ": " + pricePerday + "원";
	}
	
	
	
}

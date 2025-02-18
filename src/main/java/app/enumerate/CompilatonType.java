package app.enumerate;

import java.util.Arrays;
import java.util.List;

public enum CompilatonType {
	UNKNOWN("Desconocido"),
	BEST_OF_YEAR("Mejor del año"),
	BEST_OF_GENRE("Mejor del Género"),
	MONSTERCAT_COMPILATION("Compilación de Monstercat");

	private String type;
	
	CompilatonType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public static List<CompilatonType> getAll() {
		return Arrays.asList(values());
	}
}

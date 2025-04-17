package app.enumerate;

import java.util.Arrays;
import java.util.List;

public enum CompilationType {
	MONSTERCAT_COMPILATION("Compilación de Monstercat", "Monstercat Compilation"),
	BEST_OF_YEAR("Mejor del año", "Best of year"),
	BEST_OF_GENRE("Mejor del Género", "Best of genre");

	private String tipo;
	private String type;
	
	CompilationType(String tipo, String type) {
		this.tipo = tipo;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public static List<CompilationType> getAll() {
		return Arrays.asList(values());
	}
}

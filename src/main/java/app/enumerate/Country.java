package app.enumerate;

import java.util.Arrays;
import java.util.List;

public enum Country {
	UNKNOWN("Unknown", "Desconocido"),
	CANADA("Canada", "Canadá"),
	UNITED_STATES("United States", "Estados Unidos"),
	UNITED_KINGDOM("United Kingdom", "Reino Unido"),
	IRELAND("Ireland", "Irlanda"),
	AUSTRALIA("Australia", "Australia"),
	SWEDEN("Sweden", "Suecia"),
	ARGENTINA("Argentina", "Argentina");
	
	private String name;
    private String nombre;

	Country(String name, String nombre) {
        this.name = name;
        this.nombre = nombre;
	}

	public boolean contains(String value) {
		return this.toString().contains(value.toUpperCase());
	}
	
	// getters

    public String getName() {
        return name;
    }

    public String getNombre() {
        return nombre;
    }

	public static List<Country> getAll() {
		return Arrays.asList(values());
	}
}

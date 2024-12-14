package app.enumerate;

import java.util.Arrays;
import java.util.List;

public enum Genre {
	UNKNOWN("Unknown", "#000000"),
	DRUM_AND_BASS("Drum & Bass", "#F21904"),
	DRUMSTEP("Drumstep", "F32188"),
	DUBSTEP("Dubstep","#8D04E1");
	
	private String nombre;
    private String hexColor;

	Genre(String nombre, String hexColor) {
        this.nombre = nombre;
        this.hexColor = hexColor;
	}

	public boolean contains(String value) {
		return this.toString().contains(value.toUpperCase());
	}
	
	// getters y settters

    public String getNombre() {
        return nombre;
    }

    public String getHexColor() {
        return hexColor;
    }

	public static List<Genre> getAll() {
		return Arrays.asList(values());
	}
}

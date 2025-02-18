package app.enumerate;

import java.util.Arrays;
import java.util.List;

public enum Genre {
	UNKNOWN("Unknown", "#000000"),
	BREAKS("Breaks", "#C1C1C1"),
	CHILLOUT("Chillout", "#C1C1C1"),
	DRUM_AND_BASS("Drum & Bass", "#F21904"),
	DRUMSTEP("Drumstep", "F32188"),
	DUBSTEP("Dubstep", "#8D04E1"),
	ELECTRO("Electro", "#E6CE00"),
	ELECTRONIC("Electronic", "#C1C1C1"),
	FUTURE_BASS("Future Bass", "#9A98FC"),
	GARAGE("Garage", "#C1C1C1"),
	GLITCH_HOP("Glitch Hop", "#0B9757"),
	HARD_DANCE("Hard Dance", "#019700"),
	HOUSE("House", "#EA8C00"),
	INDIE_DANCE("Indie Dance", "#1CABB3"),
	MOOMBAHTON("Moombahton", "#0B9757"),
	NU_DISCO("Nu Disco", "#1CABB3"),
	TRANCE("Trance", "#007EE7"),
	TRAP("Trap", "#8C0F27");
	
	private String name;
    private String hexColor;

	Genre(String name, String hexColor) {
        this.name = name;
        this.hexColor = hexColor;
	}

	public boolean contains(String value) {
		return this.toString().contains(value.toUpperCase());
	}
	
	// getters

    public String getName() {
        return name;
    }

    public String getHexColor() {
        return hexColor;
    }

	public static List<Genre> getAll() {
		return Arrays.asList(values());
	}
}

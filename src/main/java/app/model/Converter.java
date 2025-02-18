package app.model;

public abstract class Converter {
	
	public static String intToLength(int length) {
		Integer minutes = length / 60;
		Integer seconds = length % 60;
		return minutes.toString().concat(":").concat(seconds.toString());
	}
	
	public static Integer lengthToInt(int minutes, int seconds) {
		return minutes * 60 + seconds;
	}
}

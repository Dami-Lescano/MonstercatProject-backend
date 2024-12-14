package app.model;

import java.time.LocalDate;
import java.util.List;

public class Artist {
	private Integer artistId;
	
	private String artistName;
	private List<String> realName;
	private String country;
	private LocalDate initDate;
	private LocalDate endDate = null;
	
}

package app.dto;

public class SongItem {

	private String fullName;
	private Integer Id;
	
	public SongItem(String fullName, Integer id) {
		this.fullName = fullName;
		this.Id = id;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

}

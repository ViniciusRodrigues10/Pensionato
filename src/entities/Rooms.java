package entities;

public class Rooms {
	// Atributos
	private String name;
	private String email;
	private byte roomNumber;
	
	// Construtor
	public Rooms(String name, String email, byte roomNumber) {
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	// Métodos especiais 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(byte roomNumber) {
		this.roomNumber = roomNumber;
	}

	// Métodos públicos 
	@Override
	public String toString() {
		return getRoomNumber() + ": " + getName() + ", " + getEmail() + "@gmail.com";
	}
	
}

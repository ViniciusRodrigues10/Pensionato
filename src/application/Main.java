package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		byte numberOfRoomsRented = sc.nextByte();
		
		Rooms[] tenantData = new Rooms[10];
		
		for (int i = 0; i < numberOfRoomsRented; i++) {
			System.out.println("\nRent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			byte roomNumber = sc.nextByte();
			tenantData[roomNumber] = new Rooms(name, email, roomNumber);
		}
		
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < tenantData.length; i++) {
			if (tenantData[i] != null) {
				System.out.println(tenantData[i].toString());
			}
			else {
				continue;
			}
		}
		
		sc.close();
	}

}

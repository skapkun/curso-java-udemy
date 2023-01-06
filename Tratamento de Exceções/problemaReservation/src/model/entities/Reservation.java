package model.entities;

import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	private static final SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
	
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut)  {
		if (!checkOut.after(checkIn)) {
			throw new DomainException ("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckIn() {
		return checkIn;
	}
 

	public Date getCheckOut() {
		return checkOut;
	}
 

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates (Date checkin, Date checkout) {
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException ("Reservation dates for update must be future dates");
		}
			else if (!checkout.after(checkin)) {
					throw new DomainException ("Check-out date must be after check-in date");
				}
		this.checkIn = checkin;
		this.checkOut = checkout;
 
	}

	public String toString () {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Room ");
		sb.append(roomNumber); 
		sb.append(", check-in: ");
		sb.append(sdf.format(checkIn));
		sb.append(", check-out: "); 
		sb.append(sdf.format(checkOut));
		sb.append(", " + duration() + " nights");
		return sb.toString();
	}
	
	
}

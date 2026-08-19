package Exececoes.Testes3Fases.Boa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationB {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public ReservationB(){
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservationB(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExceptions {
        if (!checkOut.after(checkIn)){
            throw new DomainExceptions( "Check-out date must be after check-in date");
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
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    @Override
    public String toString() {
        return
                "\nRoom: " + roomNumber +
                "\nCheckIn: " + sdf.format(checkIn)+
                "\nCheckOut: " + sdf.format(checkOut) + "\n" + duration() + " nights";
    }

    public void updateDates (Date checkIn, Date checkOut) throws DomainExceptions{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
           throw new DomainExceptions( "Reservation dates for update must be future");
        }
        if (!checkOut.after(checkIn)){
            throw new DomainExceptions( "Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

}

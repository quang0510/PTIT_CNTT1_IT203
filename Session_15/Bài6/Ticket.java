package Session_15.Bài6;

import java.time.LocalDateTime;

public class Ticket {
    public int ticketNumber; // số thứ tự
    public LocalDateTime issuedTime; // thời điểm phát số


    public Ticket(int ticketNumber, LocalDateTime issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "Số: " + ticketNumber + " - " + issuedTime;
    }
}

package Session_15.Bài6;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    public Queue<Ticket> ticketQueue  = new LinkedList<>();// hàng đợi các đối tượng Ticket
    public int currentNumber; // số thứ tự hiện tại

    public TicketSystem() {
    }

    public TicketSystem(Queue<Ticket> ticketQueue, LocalDateTime currentNumber) {
        this.ticketQueue = ticketQueue;
        this.currentNumber = ticketQueue.size();
    }


    void displayTicketSystem(){
        while (ticketQueue.peek() != null){
            Ticket currentTicket = ticketQueue.peek();
            System.out.println(currentTicket.toString());
        }
    }

    public void issueTicket() {
        currentNumber++;
        this.ticketQueue.offer(new Ticket(currentNumber, java.time.LocalDateTime.now()));
    }

    public Ticket callNext() {
        return this.ticketQueue.poll();
    }
}

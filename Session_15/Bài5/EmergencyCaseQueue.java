package Session_15.Bài5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }


    void addCase(EmergencyCase c){
        this.cases.offer(c);
    }

    EmergencyCase getNextCase(){
        return this.cases.poll();
    }
}

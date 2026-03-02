package Session_15.Bài5;

import Session_15.Bài2.Patient;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient, Stack<TreatmentStep> steps) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Stack<TreatmentStep> getSteps() {
        return steps;
    }

    public void setSteps(Stack<TreatmentStep> steps) {
        this.steps = steps;
    }

    void addStep(TreatmentStep step){
        this.steps.push(step);
    }

    TreatmentStep undoStep(){
        if(this.steps.isEmpty()){
            return null;
        }
        return this.steps.pop();
    }

    void displaySteps(){
        System.out.println("\nBệnh nhân -  " + this.patient.getName());
        for(TreatmentStep st : this.steps){
            System.out.println(st.getDescription() + ": " + st.getTime());
        }
    }
}

package Session_15;

import java.util.Stack;

public class Bài3 {
    public static Stack<String> medicalStack = new Stack<>();
    public static void main(String[] args) {
        String[] process1 = {"PUSH", "POP", "PUSH", "POP", "POP"};
        String[] process2 = {"POP", "POP", "PUSH", "POP", "POP"};
        String[] process3 = {"PUSH", "POP", "PUSH", "POP"};


        System.out.println("Kiểm tra quy trình: ");
        checkProcess(process1);
        checkProcess(process2);
        checkProcess(process3);

    }

    public static boolean checkProcess(String[] actions){
        reset();
        for (String p : actions){

            if (p.equalsIgnoreCase("PUSH")){
                medicalStack.push(p);
            } else if (p.equalsIgnoreCase("POP")) {
                if(medicalStack.isEmpty()){
                    System.out.println("Stack rỗng, quy trình chưa hợp lệ");
                    return false;
                }
                medicalStack.pop();
            }else {
                System.out.println("Hành động không hợp lệ ");
            }
        }
        if (medicalStack.isEmpty()) {
            System.out.println("Quy trình hợp lệ");
            return true;
        }
        return false;
    }

    public static void reset(){
        medicalStack.clear();

    }
}

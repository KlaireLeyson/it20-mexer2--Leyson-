package queactivity;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class QueActivity {

     
    public static void main(String[] args) {
        Queue<String> student = new LinkedList<>();
        Scanner kl = new Scanner(System.in);
        String name;
        
        while(true){
        System.out.print("Enter name. Enter Done if no more: ");
         name = kl.nextLine();
            if (name.equalsIgnoreCase("Done")) {
                break;
            }
            student.offer(name);

        } 
         System.out.println("Front: " + student.peek());
         while(!student.isEmpty()){
             System.out.println("Served: " + student.poll());
         }
        kl.close();
        
        System.out.println(student);
    }
    
}

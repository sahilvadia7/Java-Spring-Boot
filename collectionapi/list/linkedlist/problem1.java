//Write a program to manage a `LinkedList` of task deadlines, allowing insertion of new deadlines at any position and removal of completed tasks.
package list.linkedlist;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Deadline{
    private int task_id;
    private String task;
    private String task_status;

    public Deadline(int task_id, String task, String task_status) {
        this.task_id = task_id;
        this.task = task;
        this.task_status = task_status;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask_status() {
        return task_status;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    @Override
    public String toString() {
        return "Deadline{" +
                "task_id=" + task_id +
                ", task='" + task + '\'' +
                ", task_status='" + task_status + '\'' +
                '}';
    }
}

public class problem1 {

    public static void main(String[] args) {
        List<Deadline> deadlineList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int id=1;

        int opt;

        do {
            System.out.println("1. Create DeadLine");
            System.out.println("2. View ALl Task");
            System.out.println("3. delete task");
            System.out.println("0. exit");
            System.out.print("Select option : ");
            opt = input.nextInt();


            switch (opt) {
                case 1:
                    System.out.print("task :");
                    input.nextLine();
                    String taskD= input.nextLine();

                    System.out.println("Status: ");
                    String status = input.next();
                    deadlineList.add(new Deadline(id,taskD,status));

                    id++;
                       break;

                case 2:
                    deadlineList.forEach(System.out::println);
                    break;

                case 3:
                    deadlineList.removeAll(deadlineList.stream().filter(n -> n.getTask_status().equalsIgnoreCase("completed")).toList());
                    System.out.println("deleted");
                    break;
            }
        }while (opt!=0);
    }
}

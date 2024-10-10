//Develop a Todo List manager using an ArrayList where users can add, update, and delete tasks.

package list;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

class Todo{
    private int id;
    private String date;
    private String title;
    private String content;

    public Todo(int id, String date,String title, String content) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id= " + id +
                ", title= "+ title +
                ", date= " + date +
                ", content= '" + content + '\'' +
                '}';
    }
}


public class problem3 {
   static List<Todo> todoList = new ArrayList<>();


    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner input = new Scanner(System.in);
        int id=1;
        String content,title;
        Date date = new Date();

        int opt;

        do {
            System.out.println("1. New Todo");
            System.out.println("2. View");
            System.out.println("3. Remove");
            System.out.println("4. Search");
            System.out.println("5. Sort");
            System.out.println("0. exit");
            System.out.print("Select option : ");
            opt = input.nextInt();


            switch (opt){

                case 1:

                    System.out.print("Enter Title: ");
                    title = input.next();

                    System.out.print("Enter Content: ");
                    input.nextLine();
                    content = input.nextLine();

                    todoList.add(new Todo(id,formatter.format(date),title,content));
                    System.out.println("added");
                    id++;
                    break;

                case 2:
                    todoList.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter id: ");
                    id  = input.nextInt();

                    Iterator<Todo> iterator = todoList.iterator();
                    while (iterator.hasNext()) {
                        Todo todo = iterator.next();
                        if (todo.getId() == id) {
                            iterator.remove();
                            break;
                        }
                    }


                    break;

                case 4:
                    System.out.print("Enter title: ");
                    title = input.next();
                    getTodoByTitle(title).forEach(System.out::println);
                    break;

                case 5:
//                    sort by title
                    todoList.sort(new Comparator<Todo>() {
                        @Override
                        public int compare(Todo t1, Todo t2) {
                            return t1.getTitle().compareTo(t2.getTitle());
                        }
                    });
                    todoList.forEach(System.out::println);
                    break;
            }

        }while(opt!=0);



        }

    public static List<Todo> getTodoByTitle(String title) {
        return todoList.stream()
                .filter(todo -> todo.getTitle().equals(title))
                .collect(Collectors.toList());
    }

}
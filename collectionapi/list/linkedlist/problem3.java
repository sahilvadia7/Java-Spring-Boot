//Develop a phone call log using a `LinkedList` where the call history is added to the end and removed from the front.
package list.linkedlist;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Contact{
    private final int phoneNo;
    private final String name;

    public String getName() {
        return name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public Contact(int phoneNo, String name) {
        this.phoneNo = phoneNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CallLog{" +
                "phoneNo=" + phoneNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class problem3 {

    private final List<Contact> logs = new LinkedList<>();
    private final List<Contact> contactBook = new LinkedList<>();

    private Scanner in = new Scanner(System.in);
    private static problem3 pro = new problem3();


    private void AddContact(){
        System.out.print("Enter Name: ");
        String name = in.next();

        System.out.print("Enter Number: ");
        int number = in.nextInt();
        contactBook.add(new Contact(number,name));
    }

    private void dialer(){
        System.out.println();
        System.out.println("1. Contact Book");
        System.out.println("2. dialer");
        System.out.print("select opt: ");
        int subOpt = in.nextInt();

        if(subOpt == 1){
            contactBook();
            System.out.print("Enter Name: ");
            String DialContact = in.next();

            for(Contact contact : contactBook){
                if(contact.getName().contains(DialContact)){
                    logs.addLast(new Contact(contact.getPhoneNo(),contact.getName()));
                    System.out.println("calling ... ");
                }
            }
        }
        else if(subOpt == 2){
            System.out.print("Enter Number: ");
            int callNo = in.nextInt();

            logs.addLast(new Contact(callNo,"Unknown"));
            System.out.println("calling ... ");

        }
        else {
            System.out.println("Select proper opt");
        }

        System.out.println();
    }

    private void contactBook(){
        System.out.println("\n-----------------");
        System.out.println("Your Contacts: "+contactBook.size());
        var i=1;
        for(Contact contact : contactBook){   System.out.println( i +" "+ contact.getName() +" "+contact.getPhoneNo());   i++; }
        System.out.println("\n");
    }

    private void callLogs(){

        System.out.println("\n-----------------");
        System.out.println("Call Logs"+logs.size());
        int i=1;
        for(Contact log : logs){   System.out.println( i +" "+ log.getName() +" "+log.getPhoneNo());   i++; }
        System.out.println("\n");

    }

    private void deleteLog() {
        logs.removeFirst();
        System.out.println("log pop from rear!");
    }

    private void menu(){
        int opt;
        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Contact Book");
            System.out.println("3. Dialer");
            System.out.println("4. Call Logs");
            System.out.println("5. Delete Log");
            System.out.println("0. exit");
            System.out.print("Select opt: ");
            opt = in.nextInt();

            switch (opt){
                case 1:
                    pro.AddContact();
                    break;

                case 2:
                    pro.contactBook();
                    break;

                case 3:
                    pro.dialer();
                    break;

                case 4:
                    pro.callLogs();
                    break;

                case 5:
                    pro.deleteLog();
                    break;

                default:
                    System.out.println("Select proper option");
                    break;
            }

        }while (opt!=9);
    }


    public static void main(String[] args) {
        pro.menu();
    }
}

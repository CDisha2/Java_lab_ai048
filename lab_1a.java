package D_BM23AI048;

import java.util.Scanner;
class ab{
    String name;
    int age, total, duration, mem_id, fee=3000;
    Boolean isActive;
    void calculate(){
        this.total=this.fee*this.duration;
        System.out.println("total:Rs"+this.total);
    }
}
public class Gym{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ab g= new ab();
        System.out.print("enter name:");
        g.name= sc.nextLine();
        System.out.print("enter age:");
        g.age= sc.nextInt();
        System.out.print("enter True if active user, else False:");
        g.isActive= sc.nextBoolean();
        System.out.print("enter membership id:");
        g.mem_id= sc.nextInt();
        System.out.print("duration:");
        g.duration= sc.nextInt();
        System.out.println("Member info:");
        System.out.println("Name:"+ g.name);
        System.out.println("Age:"+ g.age);
        System.out.println("Membership id:"+ g.mem_id);
        System.out.println("status:"+ (g.isActive?"Active":"Inactive"));
        g.calculate();

    }
}

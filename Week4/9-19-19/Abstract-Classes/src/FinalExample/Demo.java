package FinalExample;

public class Demo {

    public static void main(String[] args) {
        Person p = new Person("Stacy");
        Mom m = new Mom("Stacy's mom");
        Wife w = new Wife("Jenna");

        System.out.println(p.name);
        System.out.println(m.name);
        System.out.println(w.name);

        w.call();
    }
}

// Classes need to be Pascal Case
public class Sample {
    private int id;
    private String name;
    private String address;

    public void setName(String name) {
        // this keyword is the context where the method is called
        this.name = name; //casey.setName("Casey") --> will set casey's name as Casey
    }

    public String getName() {
        return this.name;
    }

    // Use setter and getters to set/get private variables

    public static void main(String[] args) {
        Sample casey = new Sample(); // creates an object casey which is an instance of Sample class
        casey.setName("Casey");
        System.out.println(casey.getName());
        casey.setName("Suresh");
        System.out.println(casey.getName());
    }
}

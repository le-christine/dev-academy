public class Human {

    private int id;
    private String name;
    private String address;

    // polymorphism - can make multiple instances with the same name with different parameters
    public Human(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // instantiating an instance of a class - creating an object that is a copy of a pre-existing object (same values)
        Human christine = new Human(1, "Christine", "123 Main Street");
        Human suresh = new Human(2,"Suresh");

        int userId = christine.getId();
        String searchWord = suresh.getName();
        christine.setName("Mary");
    }

}


public class Use {
    private final String name;
    private String lastName;
    private int age;

    public Use(String name) {
        this.name = name;
    }
    public String getFullName(String firstName){
        System.out.println("Your firstname is"+firstName);
        String fullname = firstName + lastName;
        sayHello(firstName, lastName);
        return fullname;
    }
    public void sayHello(String lastName, String lastname){
        System.out.println("hello"+lastName);
    }
    public  void foo(){
        validate();
        loadDataFromDB();
        calc();
    }

    private void calc() {
        getFullName("san");
        getFullName("san");
    }

    private void loadDataFromDB() {
        getFullName("san");
        getFullName("san");
    }

    private void validate() {
        getFullName("san");
        getFullName("san");
    }


}

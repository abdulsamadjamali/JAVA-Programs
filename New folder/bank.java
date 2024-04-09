import concepts.*;
class college {
    public String name;
    protected String email;
    private String password;

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}

public class bank {
    public static void main(String[] args) {
        college col1 = new college();
        col1.name = "Abdul samad jamali";
        col1.email = "Abdulsamadjamali115@gmail.com";
        col1.setpassword("jamali123");
        System.out.println(col1.getpassword()); // Corrected println statement
    }
}


public class MyJavaClass {
    public static void main(String[] args){

    }
    public static int sum(int l, int b){
        int result = l + b;
        return result;
    }


    protected String firstName;
    protected String lastName;

    public String getfirstName() {
        return firstName;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    ///calling kotlin file function
     int area = JavaInteroperabilityKt.calculateAreaUsingKotlin(4,5);


}

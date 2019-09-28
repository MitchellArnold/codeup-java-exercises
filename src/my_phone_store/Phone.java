package my_phone_store;

public class Phone {

    private String number;
    private double screenSize;
    public String OS;

    public Phone(double sS, String OS){
        this.screenSize = sS;  // using param to set value of class group parameter
        this.OS = OS;
    }

    public String getNumber() {
        return number; // returns the original properties with user access
    }

    public void setNumber(String number) {
        this.number = number; // using param to set value of class group parameter
    }

    public double getScreenSize() {
        return this.screenSize; // returns the original properties with user access
    }

    public void setScreenSize(double ScreenSize) {
        this.screenSize = ScreenSize; // the void will not require a return; method simply sets size to user option
    }

    private void assemble(){

    }

    public String getOS() {
        return this.OS; // returns the original properties with user access
    }

    public void makeCall(String aNumber) {
        System.out.println("phone number = " + aNumber);
    }
}

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Galaxy " + this.getVersionNumber() + " says Ring Ring Ring";
    }
    @Override
    public String unlock() {
        return "Unlocks via fingerprint"; 
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy from " + this.getCarrier());          
    }
}
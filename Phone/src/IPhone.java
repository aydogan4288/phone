public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Iphone " + this.getVersionNumber() + " says Zing";
    }
    @Override
    public String unlock() {
        return "Unlocks via face recognition";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone from " + this.getCarrier());          
    }
}

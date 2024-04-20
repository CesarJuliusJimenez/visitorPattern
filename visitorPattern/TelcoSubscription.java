package visitorPattern;
public interface TelcoSubscription {
    public String accept(UsagePromo usagePromo, double price);
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
    public String getTelcoName();
    public double getPromoPrice();
    public int getDataAllowance();
    public boolean getUnliCallText();
}
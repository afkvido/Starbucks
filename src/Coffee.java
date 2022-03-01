import org.jetbrains.annotations.NotNull;
import resources.t;


public class Coffee {

    public final Object general;
    public final Object size;
    public final String customer;
    private Double subTotal;
    public Double total;



    public Coffee (Object Type, Object Size, String Customer) {
        this.general = Type;
        this.customer = Customer;
        this.size = Size;
    }

    private void cost () {
        total = subTotal + ((subTotal * t.taxPercent) / 100);
    }


    public void Make () {

    }

    // ----------------------------------

    public Double getFinalCost_Double () {
        cost();
        return total;
    }

    // ------

    public String getFinalCost_String () {
        cost();
        return s.white + "Cost: " + s.blue + "$" + s.cyan + total.toString();
    }

    // ------

    @Override public @NotNull String toString () {

        return "e";
    }


}

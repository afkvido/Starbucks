package resources;

import org.jetbrains.annotations.NotNull;
import resources.t;


public class Coffee {

    public final Object general;
    public final String customer;
    private Double subTotal;
    public Double total;

    public Coffee (Object Type, String Customer) {
        this.general = Type;
        this.customer = Customer;
    }

    private void cost () {


        total = subTotal + ((subTotal * t.taxPercent) / 100);

    }


    @Override public @NotNull String toString () {

        return "e";
    }


}

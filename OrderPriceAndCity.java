import java.util.Comparator;

/**
 * Created by VINNI on 17.12.16.
 */
public class OrderPriceAndCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {

        int flag = o1.getPrice() - o2.getPrice();


        if(flag == 0)
        {
            flag = o1.getUser().getCity().compareTo(o2.getUser().getCity());}

        return flag;
    }

}

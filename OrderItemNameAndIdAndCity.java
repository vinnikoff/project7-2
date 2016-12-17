/**
 * Created by VINNI on 17.12.16.
 */
import java.util.Comparator;
public class OrderItemNameAndIdAndCity implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {

        int flag = o1.getItemName().compareTo(o2.getItemName());



        if(flag == 0)
        {
            flag = (int)o1.getId() - (int)o2.getId();
            if(flag == 0){
            flag = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        }

        return flag;
    }
}

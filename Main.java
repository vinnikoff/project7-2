/**
 * Created by VINNI on 17.12.16.
 */


import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "firstName", "lastName", "city", 10000));
        users.add(new User(2, "firstName2", "lastName2", "city2", 9000));
        users.add(new User(3, "firstName3", "lastName3", "city3", 8000));
        users.add(new User(4, "firstName4", "lastName4", "city4", 7000));
        users.add(new User(5, "firstName5", "lastName5", "city5", 6000));
        users.add(new User(6, "firstName6", "lastName6", "city6", 5000));
        users.add(new User(7, "firstName7", "lastName7", "city7", 4000));
        users.add(new User(8, "firstName8", "lastName8", "city8", 3000));
        users.add(new User(9, "firstName9", "lastName9", "city9", 2000));
        users.add(new User(10, "firstName10", "lastName10", "city10", 1000));


        //User[] userArray = new User[10];
        //userArray[0] = new User(1, "firstName", "lastName", "city", 10000);
        //userArray[1] = new User(2, "firstName2", "lastName2", "city2", 9000);
        //userArray[2] = new User(3, "firstName3", "lastName3", "city3", 8000);
        //userArray[3] = new User(4, "firstName4", "lastName4", "city4", 7000);
        ///userArray[4] = new User(5, "firstName5", "lastName5", "city5", 6000);
        //userArray[5] = new User(6, "firstName6", "lastName6", "city6", 5000);
        //userArray[6] = new User(7, "firstName7", "lastName7", "city7", 4000);
        //userArray[7] = new User(8, "firstName8", "lastName8", "city8", 3000);
        //userArray[8] = new User(9, "firstName9", "lastName9", "city9", 2000);
        //userArray[9] = new User(10, "firstName10", "lastName10", "city10", 1000);

        List<Order> oder = new ArrayList<>();
        oder.add(new Order(300, 2000, Currency.USD, "itemName3", "shopIdentificator", users.get(8)));
        oder.add(new Order(300, 2000, Currency.GRN, "itemName3", "shopIdentificator3", users.get(0)));
        oder.add(new Order(200, 3000, Currency.USD, "itemName2", "shopIdentificator2", users.get(1)));

        Collections.sort(oder);
        System.out.println(oder);

        Collections.sort(oder, new OrderPriceAndCity());
        System.out.println(oder);

        Collections.sort(oder, new OrderItemNameAndIdAndCity());
        System.out.println(oder);

    }
}

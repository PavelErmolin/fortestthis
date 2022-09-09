import java.util.Date;
import java.util.List;
public class Order {
    User user; // пользователь создавший заказ
    List<ProductInOrder> ProductInOrderList; // список товаров
    String comment;// комментарий
    Date date; // Дата заказа
}

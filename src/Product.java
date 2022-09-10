import java.util.List;

public class Product {
    String name; // Название товара
    float price;  // Текущая стоимость товара
    String pic;   // Изображение
    String description;  //Описание
    List<Feature> featuresNotForFilter; // Свойства не для сортировки
    List<Feature> featuresForFilter;  // Свойства для сортировки
}

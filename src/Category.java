import java.util.List;

public class Category {
    String name; // Название категории
    List<Category> categories; // подкатегории
    List<Feature> featuresForFilter; // свойства товаро для сортировки и фильтрации
}

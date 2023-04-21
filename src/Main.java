import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shop iphone = new Shop();
        iphone.modeliphone = new String[]{"iPhoneXS", "iPhoneXR", "iPhoneSE", "iPhone11", "iPhone11Pro", "iPhone11ProMax", "iPhone12", "iPhone12Pro", "iPhone12ProMax", "iPhone13", "iPhone13Pro", "iPhone13ProMax", "iPhone14", "iPhone14Pro", "iPhone14ProMax"};

        //1. список моделей телефонов.
        iphone.listModels(iphone.modeliphone);
        //2. вывести все модели на экран.
        iphone.сycle(iphone.modeliphone);
        //3 сравнить названия моделей из массива между собой.
        iphone.comparisonModels(iphone.modeliphone);
        // - вывести все модели, у которых название длиннее 10 символов
        //из существующего массива телефонов создать новый, в котором у всех букв будет изменен регистр.
        iphone.newArray(iphone.modeliphone);

    }
}

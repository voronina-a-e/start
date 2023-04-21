import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shop iphone = new Shop();
        iphone.modeliphone = new String[]{"iPhoneXS", "iPhoneXR", "iPhoneSE", "iPhone11", "iPhone11Pro", "iPhone11ProMax", "iPhone12", "iPhone12Pro", "iPhone12ProMax", "iPhone13", "iPhone13Pro", "iPhone13ProMax", "iPhone14", "iPhone14Pro", "iPhone14ProMax"};
        // 1. список моделей телефонов.
        System.out.println("В магазине всего: " + iphone.modeliphone.length + " моделей iPhone");

        //2. вывести все модели на экран.
        for (int x = 0; x < iphone.modeliphone.length; x++) {
            System.out.println(iphone.modeliphone[x]);
        }

        //3 сравнить названия моделей из массива между собой.
        for (int n = 1; n < iphone.modeliphone.length; n++) {
            if (iphone.modeliphone[n].equalsIgnoreCase(iphone.modeliphone[0]))
                System.out.println("Есть одинаковые модели: " + iphone.modeliphone[n]);
        } //или создать новый массив и сравнить Arrays.equals(modeliphone, новый массив)

        // - вывести все модели, у которых название длиннее 10 символов
        //  - из существующего массива телефонов создать новый, в котором у всех букв будет изменен регистр.

        String[] modeliphone2;
        modeliphone2 = Arrays.copyOf(iphone.modeliphone,15);
        System.out.println(Arrays.toString(modeliphone2));// - вывод на экран нового массива

    }
}

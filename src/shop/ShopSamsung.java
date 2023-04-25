package shop;

import java.util.Arrays;

public class ShopSamsung {

    private static String[]modelSamsung;                                                   //создание переменной
    public static void setModelSamsung(String[] modelSamsung) {                            //сеттер
        ShopSamsung.modelSamsung = modelSamsung;
    }
    public static String[] getModelSamsung() {                                              //геттер
        return modelSamsung;
    }
    //кол-во моделей
    public void quantityModels(String[]array){                                              //кол-во моделей
        System.out.println("В магазине всего: " + array.length + " моделей samsung");
    }
    public void showArraySamsung(String[]model){                                        //вывод всех моделей на экран
        int x;
        for (x = 0; x < model.length; x++)
            System.out.println(model[x]);
    }
    public void comparisonElementSamsung(String[] model){                       //сравнить модели в массиве между собой
        int x;
        for (x=0; x< model.length; x++)
            if (model[x].equals(model[0]))
                System.out.println("Имеются одинаковые модели: "+ model[x]);
    }
    public static void changeCaseSamsung(String[] array){                  //создание массива и изменение регистра.
        array=Arrays.copyOf(modelSamsung, modelSamsung.length);
        int x;
        for (x=0; x<array.length;x++)
            System.out.println(array[x].toUpperCase());
    }

}

package shop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ShopIphone shopIphone = new ShopIphone();  //создание объекта shopIphone
            shopIphone.setArrayModel(new String[]{"iPhoneXS", "iPhoneXR", "iPhoneSE", "iPhone11", "iPhone11Pro", "iPhone11ProMax", "iPhone12", "iPhone12Pro", "iPhone12ProMax", "iPhone13", "iPhone13Pro", "iPhone13ProMax", "iPhone14", "iPhone14Pro", "iPhone14ProMax"});
                shopIphone.showArray(ShopIphone.getArrayModel());      //вызов списка всех моделей айфонов геттер/сеттер
                shopIphone.comparisonElement(ShopIphone.getArrayModel());          // вызов метода (сравнение элементов)
                shopIphone.setArrayModel2(new String[]{});             //создание второго массива для изменения регистра
                ShopIphone.comparisonArrays(ShopIphone.getArrayModel());     //вызов (сравнение массивов методом equals)
                shopIphone.changeCase(shopIphone.getArrayModel());       //вызов (создание массива и изменение регистра)

        ShopIphone priceIphone = new ShopIphone();
            priceIphone.setArrayPriceIphone(new int[]{60000,54900,50000,70000,80000,85000, 85547,85784,95164,100000,104578,109547,111265,115000,120000});

            priceIphone.quantityPriceIphone(priceIphone.getArrayPriceIphone());
            priceIphone.sumPriceIphone(priceIphone.getArrayPriceIphone());

            //создание магазина samsung
        ShopSamsung shopSamsung = new ShopSamsung();
            shopSamsung.setModelSamsung(new String[]{"Galaxy S23 Ultra", "Galaxy S23+", "Galaxy S23", "Galaxy Z Fold4", "Galaxy Z Flip4", "Galaxy A53 5G", "Galaxy A54 5G", "Galaxy A34 5G", "Galaxy A24", "Galaxy M14", "Galaxy A14", "Galaxy S22 Ultra", "Galaxy S22", "Galaxy S22+", "Galaxy S22 Ultra"});
                shopSamsung.quantityModels(shopSamsung.getModelSamsung());              //подсчет кол-ва моделей
                shopSamsung.showArraySamsung(shopSamsung.getModelSamsung());            //вызов списка всех моделей
                shopSamsung.comparisonElementSamsung(shopSamsung.getModelSamsung());    //сравнение элементов массива
                shopSamsung.changeCaseSamsung(shopSamsung.getModelSamsung());           //изменение регистра

        System.out.println(shopSamsung.equals(shopIphone));
    }
}


//TODO что же такое объекты? Объект, как создание объекта класса, объект - это поля,Литералы?
//TODO смысл наследования, если все классы наследуются от обджект. Если наследоваться от др классов, значит
// в нем будет меньше доступных методов?
//нужно ли учить сколько байт выделяется для каждого типа данных?
//нужно ли уметь объяснять что такое компилятор? компилятор -это idea  прога, реализующая код?
//
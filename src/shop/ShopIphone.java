package shop;

import java.util.Arrays;

public class ShopIphone {
    private static String[] arrayModel;                     //создаем стринговую приватную переменную, хранящую массив.
    public void setArrayModel(String[] arrayModel) {
            this.arrayModel = arrayModel;
    }                                    //создаем сеттер для возможности применения значений переменной в др. классах.
    public static String[] getArrayModel() {
            return arrayModel;
    }                                             //создаем геттер для возможности возврата значений скрытой переменной.

    public static void showArray(String[]model){    //вывод всех моделей на экран
        int x;
        for (x = 0; x < model.length; x++)
            System.out.println(model[x]);
    }

    public static void comparisonElement(String[] model){       //сравнить модели в массиве между собой
        int x;
        for (x=0; x< model.length; x++)
            if (model[x].equals(model[0]))
                System.out.println("Имеются одинаковые модели: "+ model[x]);
    }
    private static String[] arrayModel2;                        //создаем новую переменную

    public static void setArrayModel2(String[] arrayModel2) {
        ShopIphone.arrayModel2 = arrayModel2;
    }                                                           //создаем сеттер
                                                                //геттер не нужен?
    public static void comparisonArrays(String[] array){        //создание нового массива и сравниваем их методом equals
        array = Arrays.copyOf(arrayModel, arrayModel.length);
        System.out.println(Arrays.equals(array,arrayModel));
    }

    //создать новый массив и изменить регистр

    public static void changeCase(String[] array){                //создание массива и изменение регистра.
        array=Arrays.copyOf(arrayModel, arrayModel.length);
            int x;
            for (x=0; x<array.length;x++)
                System.out.println(array[x].toUpperCase());
    }

    //вывести на экран все названия, у которых символов больше 10


    private static int[] arrayPriceIphone;                               //создание переменной для массива цен на айфон
    public static void setArrayPriceIphone(int[] arrayPriceIphone) {
        ShopIphone.arrayPriceIphone = arrayPriceIphone;
    }
    public static int[] getArrayPriceIphone() {
        return arrayPriceIphone;
    }
    protected void quantityPriceIphone(int[] prices){
        System.out.println("Установлено " + prices.length + " цен");
    }                                                                           //количество элементов цен
    public void sumPriceIphone(int[] prices){                                   //сумма цен
        int c = 0;
        int x;
        for (x=0;x<prices.length;x++){
            c=c+prices[x];}
        System.out.println("стоимость всех iphone составляет: " + c +" рублей.");

    }

}

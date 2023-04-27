import shop.ShopSamsung;

import java.util.Arrays;

public class Shop {

    private String[] listModels;
    public void setListModels(String[] listModels) {
        this.listModels = listModels;
    }
    public String[] getListModels() {
        return listModels;
    }

    private int[] priceModels;
    public void setPriceModels(int[] priceModels) {
        this.priceModels = priceModels;
    }
    public int[] getPriceModels() {
        return priceModels;
    }

    private String[] colorModels;
    public void setColorModels(String[] colorModels) {
        this.colorModels = colorModels;
    }

    public void quantityModels(String[]array){                                              //кол-во моделей
        System.out.println(array.length + " моделей");
    }
    public void showArray(String[]arrayModels){                                     //вывод всех моделей на экран
        int x;
        for (x = 0; x < arrayModels.length; x++)
            System.out.println(arrayModels[x]);
    }
    public void comparisonElement(String[] arrayModels){                         //сравнить модели в массиве между собой
        int x;
        for (x=0; x< arrayModels.length; x++)
            if (arrayModels[x].equals(arrayModels[0]))
                System.out.println("Имеются одинаковые модели: "+ arrayModels[x]);
    }
    public static void changeCase(String[]arrayModels, String[] listModels){   //создание массива и изменение регистра.
        arrayModels= Arrays.copyOf(listModels, listModels.length);
        int x;
        for (x=0; x<arrayModels.length;x++)
            System.out.println(arrayModels[x].toUpperCase());
    }

    public void modelsOver10Char(String[] arrayModels){                    //вывод на экран названиЯ моделей<10 символов
        int x;
        for(x=0;x<arrayModels.length;x++)
            if (arrayModels[x].length()>10)
                System.out.println(arrayModels[x]);
    }

    public void quantityPrice(int[] arrayPrices){
        System.out.println("Установлено " + arrayPrices.length + " цен");
    }                                                                           //количество элементов цен
    public void sumPriceIphone(int[] arrayPrices){                                   //сумма цен
        int c = 0;
        int x;
        for (x=0;x<arrayPrices.length;x++){
            c=c+arrayPrices[x];}
        System.out.println("стоимость всех телефонов составляет: " + c +" рублей.");
    }

}

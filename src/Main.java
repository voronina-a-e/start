
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopSamsung shopsamsung = new ShopSamsung();
        ShopIphone shopiphone = new ShopIphone();

            shopiphone.setListModels(new String[]{"iPhoneXS", "iPhoneXR", "iPhoneSE", "iPhone11", "iPhone11Pro", "iPhone11ProMax", "iPhone12", "iPhone12Pro", "iPhone12ProMax", "iPhone13", "iPhone13Pro", "iPhone13ProMax", "iPhone14", "iPhone14Pro", "iPhone14ProMax"});
            shopiphone.setPriceModels(new int[]{60000,54900,50000,70000,80000,85000, 85547,85784,95164,100000,104578,109547,111265,115000,120000});
            shopiphone.setColorModels(new String[]{"white,black","silver"});

            shopsamsung.setListModels(new String[]{"Galaxy S23 Ultra", "Galaxy S23+", "Galaxy S23", "Galaxy Z Fold4", "Galaxy Z Flip4", "Galaxy A53 5G", "Galaxy A54 5G", "Galaxy A34 5G", "Galaxy A24", "Galaxy M14", "Galaxy A14", "Galaxy S22 Ultra", "Galaxy S22"});
            shopsamsung.setPriceModels(new int[]{52300,61000,75000,89000,84547,89784,93164,111000,104578,109558,111265,115000,119000});
            shopsamsung.setColorModels(new String[]{"white,black","silver","pink"});

            System.out.print("Магазин IPHONE всего: ");
            shop.quantityModels(shopiphone.getListModels());
            shop.showArray(shopiphone.getListModels());
            shop.comparisonElement(shopiphone.getListModels());
            shop.modelsOver10Char(shopiphone.getListModels());
            shop.quantityPrice(shopiphone.getPriceModels());
            shop.sumPriceIphone(shopiphone.getPriceModels());


            System.out.print("в магазине SAMSUNG всего: ");
            shop.quantityModels(shopsamsung.getListModels());
            shop.showArray(shopsamsung.getListModels());
            shop.comparisonElement(shopsamsung.getListModels());
            shop.modelsOver10Char(shopsamsung.getListModels());
            shop.quantityPrice(shopsamsung.getPriceModels());
            shop.sumPriceIphone(shopsamsung.getPriceModels());

    }
}


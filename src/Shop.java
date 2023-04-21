import java.util.Arrays;

public class Shop {
    public String[] modeliphone;
    public String[] modeliphone2;// почему?

    //создаю метод, обрабатывающий
    public void сycle(String[] model) {
        for (int x = 0; x < model.length; x++) {
            System.out.println(model[x]);
        }
    }

    public void comparisonModels(String[] model){
        for (int n = 1; n < model.length; n++) {
            if (model[n].equalsIgnoreCase(model[0]))
                System.out.println("Есть одинаковые модели: " + model[n]);
            else
                System.out.println("модель: " + model[n] + " отличается от модели: " + model[0]);

        }
    }
    ////или создать новый массив и сравнить Arrays.equals(modeliphone, новый массив)

    public void newArray(String[] model){
        String[] modeliphone2;
        modeliphone2 = Arrays.copyOf(model,15);
        System.out.println(Arrays.toString(modeliphone2));// - вывод на экран нового массива
    }

    public void listModels(String[] model){
        System.out.println("В магазине всего: " + model.length + " моделей iPhone");
    }
}

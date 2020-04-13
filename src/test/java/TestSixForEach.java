public class TestSixForEach {
    public static void main (String[] args){
        String [] strings = new String [3];
        strings[0] = "Hello";
        strings[1] = "My dear";
        strings[2] = "Employer";

        for(String string: strings){
            System.out.println(string);
        }
        System.out.println("Давай посчитаем сумму массива");

        int[] nambers = {1,2,3};
        int sum = 0;
        for(int summa:nambers){
            sum = sum+summa;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println("Ваоля");
    }
}

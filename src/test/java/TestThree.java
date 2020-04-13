public class TestThree {
    public static void main (String [] args){
        for(int i = 0; i<=11; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Не четное число: " + i);
        }
        System.out.println("Разделение, лень тире кликать ----");
        for (int i= 0; i<=13; i++){
            if(i%3==0){
                continue;
            }
            System.out.println("Не делятся на 3: " + i);
        }
    }
}

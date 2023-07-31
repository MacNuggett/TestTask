public class Main {

    //Функция для определения, является число простым или нет
    public static boolean isPrime(int num){
        if(num == 1)
            return false;
        for(int i=2; i<num; i++){
            if (num%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int sum=0; // Переменная для ответа

        for (int i=0; i<=x; i++){
            if(isPrime(i))
                sum+=i;
        }

        System.out.println(sum);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lol();
        for (; true;) {
            System.out.println("Введіть просту формулу (2+2,2-2,2*2,2/2) для вирішення, якщо ні просто натисніть Enter)");

            Scanner scanner = new Scanner(System.in); // Сканер штука
            String Task = scanner.nextLine().replace(" ", "");

            if (Task.isEmpty()){
                break;
            }

            int firstnumber, secondnumber; // Всі змінні
            int chec = 0, index, sumbol = -1;
            char operator = '+';
            float done = 0;

            for (char job : new char[]{'+', '-', '*', '/'}) { // Яку фігню робимо
                index = Task.indexOf(job);
                if (index != -1) {
                    operator = job;
                    sumbol = index;
                    chec = chec + 1;
                }
            }

            if (chec == 1){

                firstnumber = Integer.parseInt(Task.substring(0, sumbol)); //Яку фігню маємо
                secondnumber = Integer.parseInt(Task.substring(sumbol + 1));

                done = weDoing(operator, firstnumber, secondnumber, done);

                System.out.println("Результат: " + done);

            } if (chec == 0){
                System.out.println("Немає оператора");
            } if (chec > 1) {
                System.out.println("Оператор повинен бути один");
            }
        }
    }
    public static void lol() {
        System.out.println("LOL");
    }
    public static float weDoing(char operator, int a, int b, float done) {
        switch (operator) { //Робимо цю фігню
            case '+': done = a + b; break;
            case '-': done = a - b; break;
            case '*': done = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Ділення на нуль!");
                    return done;
                }
                done = (float) a / a;
                break;
        }
        return done;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i > 0;) {
            System.out.println("Введіть просту формулу (2+2,2-2,2*2,2/2) для вирішення, якщо ні просто натисніть Enter)");

            Scanner scanner = new Scanner(System.in); // Сканер штука
            String Task = scanner.nextLine().replace(" ", "");

            if (Task == ""){
                break;
            }

            int firstnumber = 0, secondnumber = 1; // Всі змінні
            int chec = 0, index = -1, sumbol = -1;
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

                switch (operator) { //Робимо цю фігню
                    case '+': done = firstnumber + secondnumber; break;
                    case '-': done = firstnumber - secondnumber; break;
                    case '*': done = firstnumber * secondnumber; break;
                    case '/':
                        if (secondnumber == 0) {
                            System.out.println("Ділення на нуль!");
                            return;
                        }
                        done = (float) firstnumber / secondnumber;
                        break;
                }

                System.out.println("Результат: " + done);

            } if (chec == 0){
                System.out.println("Немає оператора");
            } if (chec > 1) {
                System.out.println("Оператор повинен бути один");
            }
        }
    }
}
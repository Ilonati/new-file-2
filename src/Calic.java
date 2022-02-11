public class Calic {
    double numberA;
    double numberB;
    // возвращаемый тип : void или тип данные
    // () - сигнатура метода
    // место для входящих параметров
    //для обработки методом
    static void calc(double numA, double numB, char operation){
        double result = 0.0;
//        if(operation == '+') {
//            result = numA + numB;
//        } else if(operation == '-'){
//            result = numA - numB;
//        } else if(operation == '*'){
//            result = numA * numB;
//        } else if(operation == '/') {
//            result = numA / numB;
//        }else {
//            System.out.println("Указан недопустимый тип операции");
//        }
        switch (operation){
            case ('+'):
                result= numA+numB;
                break;
            case ('-'):
                result= numA-numB;
                break;
            case ('*'):
                result= numA*numB;
                break;
            case ('/'):
                result= numA/numB;
                break;
            default:
                System.out.println("Указан недопустимый тип операции");


        }

        System.out.println("Сумма чисел:" + result);
    }
     // public - модификатор доступа к методу. означает доступность вне класса
    // static -  статистическая обработка данных
    // void - возвращаемый тип, метод начего не возвращает
    public static void main(String[] args) {
            calc(12.2, 2, '?');

    }




}








//todo: написать программу калькулятор,
// которая принимает 3 параметра,2 параметра - это числа, 3- операция.
// - использова switch / case
// - добавить операцию

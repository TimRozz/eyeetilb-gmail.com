import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop){
            String name = scanner.next();
            switch(name){
                case("Москва"):
                case("Владивосток"):
                case("Ростов"):
                    System.out.println("Россия");
                    break;
                case("Рим"):
                case("Милан"):
                case("Турин"):
                    System.out.println("Италия");
                    break;
                case("Ливерпуль"):
                case("Манчестер"):
                case("Лондон"):
                    System.out.println("Англия");
                    break;
                case("Берлин"):
                case("Мюнхен"):
                case("Кёльн"):
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Нейзвестная страна");
                case("stop"):
                    System.out.println("Работа завершена");
                stop = name.equals("stop");
            }
        }
        }
    }

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите год в формате \"yyyy\"");
    int year = scanner.nextInt();
    boolean isLeapYear=(year%4==0)&& (year%100!=0 || year%400==0);
    if (isLeapYear==false){
      System.out.println("Обычный год 365 дней");
    } else {
      System.out.println("Високосный год 366 дней");
    }
  }
}
public class Main {
    public static String checkingTheYea(int year) {
        if (year<1854){return " год не может быть меньше 1854";}

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " - високосный год";
        } else {
            return year + " - не високосный год";
        }
    }
    public static void main(String[] args) {
        System.out.println(checkingTheYea(1800));
    }
}
public class Training {
    public static void main(String[] args) {
        String sample = "   Testing strings   ";
        sample = sample.trim(); //удаление пробелов в начале и в конце
        System.out.println("|" + sample + "|");
        System.out.println(sample.charAt(3)); //символ с индексом 3 - это t
        System.out.println(sample.length());
        System.out.println(sample.charAt(sample.length() - 1)); //последний символ - это s
        String sub = sample.substring(3, 7); //выделение подстроки ting
        System.out.println(sub);
        String changed = sample.replace('s', 'z'); //замена символов s на z
        System.out.println(changed);
        changed = changed.replace("z", ""); //удаление символов z
        System.out.println(changed);
        int findFirst = sample.indexOf('i'); //поиск символа с начала строки
        System.out.println(findFirst); //выводит 4
        int findLast = sample.lastIndexOf('i'); //поиск символа с конца строки
        System.out.println(findLast); //выводит 11
    }
}
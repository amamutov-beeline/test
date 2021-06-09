import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//sozdaem usera, imya doljno soderjat tolko latinskie bukvy

public class Main {

    public static void main(String[] args) {
        String username = null;
        int counter = 1;

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("Введите имя на латиннице, осталось попыток: " + i);
            username = scanner.next();
            counter++;
            if (!test(username)) {
                System.out.println("Otlichno, " + username);
                break;
            }
            if (i == 1) {
                System.out.println("У вас не осталось попыток");
                break;
            }
        }
        if (counter < 11) {
            Users userAcc = new Users("newuser");
            userAcc.setName(username);
            System.out.println(userAcc.getName());
        }
    }

    public static boolean test(String testname) {
        Pattern pattern = Pattern.compile("[^a-zA-Z]");
        Matcher matcher = pattern.matcher(testname);
        return (matcher.find());
    }
}

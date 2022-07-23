package support;

import runner.RunCucumber;
import java.util.Random;

public class Utils extends RunCucumber {

    public static String getRandomEmail() {
        String email_init = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static String getPassword(boolean isValidPassword){
        String password = "";
        int minimo = 0;
        int maximo = 0;
        Random random = new Random();

        if (isValidPassword){
            minimo = 100000;
            maximo = 999999999;
        } else {
            maximo = 99999;
        }

        password = String.valueOf(random.nextInt(maximo-minimo) + minimo);
        return password;
    }

    public static String getName (){

        String[] names = {"Eduardo", "Sandra", "José", "Luciana", "Fernando", "Lucas", "Maria", "Matheus"};

        int minimo = 0;
        int maximo = (names.length) - 1;

        Random random = new Random();
        int posicao = random.nextInt(maximo-minimo) + minimo;

        return names[posicao];
    }

}

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {
        char ch = 'x';
        isInt(ch);
    }

    public static void isInt(char ch) {
        try {
            if (!isDigit(ch)) {
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Il carattere non è un numero");
        } finally {
            System.out.println("Controllo terminato");
        }
    }
}

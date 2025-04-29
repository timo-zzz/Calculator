import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       new UI();
    }

    public void calculate(String equation) {
        for (int i = 0; i < equation.length(); i++) {
            switch (equation.charAt(i)) {
                case '+':

            }
        }
    }

   /* public void addition(String equation) {
        ArrayList<Integer> signPos = new ArrayList<>();

        // Get positions of signs
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '+') {
                signPos.add(i);
            }
        }

        // Add numbers adjacent to their respective signs
        for (int pos: signPos) {
            String afterSign = equation.substring(pos + 1);
            String beforeSign = equation.substring(0, pos);
            int counter = 0;
            String numOne = "";
            String numTwo = "";

            // Get number before the + sign
            while (Character.isDigit(beforeSign.charAt(counter))) {
                numTwo += Character.toString(beforeSign.charAt(counter));
                counter++;
            }

            // Get number after the + sign
            while (Character.isDigit(afterSign.charAt(counter))) {
                numTwo += Character.toString(afterSign.charAt(counter));
                counter++;
            }
        }
    }*/
}

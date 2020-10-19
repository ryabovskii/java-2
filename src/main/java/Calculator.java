import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class Calculator {


    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ParserCalculator mParserCalculator = new ParserCalculator();

        while (true) {
            try {
                System.out.print("Введите выражение для вычисления\n  ");
                String str = reader.readLine();
                if (str.equals(""))
                    break;
                double result = mParserCalculator.evaluate(str);

                DecimalFormatSymbols s = new DecimalFormatSymbols();
                s.setDecimalSeparator('.');
                DecimalFormat f = new DecimalFormat("#,###.00", s);

                System.out.printf("%s = %s%n", str, f.format(result));

            } catch (ParserCalculatorException | IOException e) {
                System.out.println(e);
            }
        }
    }

}

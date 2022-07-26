import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class birds
{
    public static void main(String args[])
            throws IOException
    {
        System.out.println("Сколько птиц?!!);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean maxbird;
        int bird = 1;
        Boolean nobird;
        do
        {
            String name = reader.readLine();
            maxbird = bird <= 10;
            nobird = bird >= 1;
            switch (name)
            {
                case "5":
                    System.out.println("5 птичек");
                    bird = 5;
                    break;
                case "4":
                    System.out.println("4 птицы, много");
                    bird = 4;
                    break;
                case "3":
                    System.out.println("3? Ну нормально");
                    bird = 3;
                    break;
                case "2":
                    System.out.println("2 птицы - мало");
                    bird = 2;
                    break;
                case "1":
                    System.out.println("Одна?");
                    bird = 1;
                    break;
                case "Птичка сдохла":
                    bird--;
                    System.out.println("Поздравляю, мудак, ты убил птичку");
                    break;
                case "Плюс птицы":
                    bird++;
                    System.out.println("У-ля-ля, плюс птица");
                    break;
                case "Сколько птиц?":
                    System.out.println(bird);
                    break;
                default:
                    System.out.println("А вот и нет)");
                    break;
            }
        } while (maxbird);
    }


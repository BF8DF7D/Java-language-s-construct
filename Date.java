import java.util.Scanner;

public class Date {
    public int day = 0,
            mounth = 0,
            year = 0;

    public void SetDate() {
        int Quantity_Input_Data;

        do {
            System.out.print(" Дата: ");

            Scanner in = new Scanner(System.in);
            Scanner buffer = new Scanner(in.nextLine());
            buffer.useDelimiter("\\.");

            for (Quantity_Input_Data = 0; buffer.hasNext() && Quantity_Input_Data < 4; Quantity_Input_Data++) {
                if (buffer.hasNextInt()) {
                    if (Quantity_Input_Data == 0)
                        this.day = buffer.nextInt();
                    else if (Quantity_Input_Data == 1)
                        this.mounth = buffer.nextInt();
                    else if (Quantity_Input_Data == 2)
                        this.year = buffer.nextInt();
                }
                else
                    Quantity_Input_Data = 4;
            }
            if (Quantity_Input_Data != 3) {
                System.out.println("\n <Формат данных не соотвествует требованиям>");
                continue;
            }
            if (this.day > 31 || this.day <= 0) {
                System.out.println("\n <Неверно введён день> ");
                Quantity_Input_Data--;
            }
            else if (this.mounth > 12 || this.mounth <= 0) {
                System.out.println("\n <Неверно введён месяц> ");
                Quantity_Input_Data--;
            }
            else if (this.year > 9999 || this.year <= 1999) {
                System.out.println("\n <Неверно введёна год> ");
                Quantity_Input_Data--;
            }
        } while (Quantity_Input_Data != 3);
    }
}

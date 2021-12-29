import java.util.Scanner;

public class Talon {
    private Date Admission_Date = new Date();
    private Time Admission_Time = new Time();
    private int kabinet;
    private Doctor Dok = new Doctor();

    public void SetTalon(Doctor medic) {
        System.out.println(" <Ввод информации о талоне>");

        this.Admission_Date.SetDate();
        this.Admission_Time.SetTime();


        int Quantity_Input_Data;

        do {
            System.out.print(" Номер кабинета: ");

            this.kabinet = 0;

            Scanner in = new Scanner(System.in);
            Scanner buffer = new Scanner(in.nextLine());

            for(Quantity_Input_Data = 0; buffer.hasNext() && Quantity_Input_Data < 2; Quantity_Input_Data++){
                if (buffer.hasNextInt()) {
                    this.kabinet = buffer.nextInt();
                } else
                    Quantity_Input_Data = 2;
            }
            if (Quantity_Input_Data != 1){
                System.out.println("\n <Формат данных не соотвествует требованиям>");
                continue;
            }
            if (this.kabinet > 999 || this.kabinet <= 0) {
                System.out.println("\n <Неверно введён кабинет>");
                Quantity_Input_Data--;
            }
        } while (Quantity_Input_Data != 1);

        this.Dok = medic;

        System.out.println(" <Ввод завершён>");
    }

    public void PrintInfo() {
        Date date = this.Admission_Date;
        Time time = this.Admission_Time;

        System.out.printf("|%46s|", this.Dok.GetsFio().Full_Name);
        System.out.printf("%3d.%2d.%4d|", date.day, date.mounth, date.year);
        System.out.printf("%3d.%2d|%4d|\n", time.hour, time.minutes, this.kabinet);
    }

    public Date GetsDate() {
        return this.Admission_Date;
    }

    public Time GetsTime() {
        return this.Admission_Time;
    }

    public int GetsKabinet() {
        return this.kabinet;
    }

    public Doctor GetsDoctor() {
        return this.Dok;
    }

    public Talon() {
    }
}


import java.util.Scanner;

public class Doctor {
    private FIO Fio = new FIO();
    private String Dolgnost;


    public void SetDoctor(){
        System.out.println(" <Ввод информации о докторе>");
        Fio.SetFIO();

        int Quantity_Input_Data;
        do {
            System.out.print(" Должность: ");

            Scanner in = new Scanner(System.in);
            Quantity_Input_Data = 0;
            String[] boffer = in.nextLine().split(" ");
            for (String word : boffer)
                Quantity_Input_Data++;
            if (Quantity_Input_Data == 1)
                this.Dolgnost = boffer[0];
            else
                System.out.println("\n <Формат данных не соотвествует требованиям>");
        } while (Quantity_Input_Data != 1);

        System.out.println(" <Ввод завершён>");

    }

    public void PrintInfo() {
        System.out.printf(" |%45s|%20s|\n", this.Fio.Full_Name, this.Dolgnost);
    }

    public FIO GetsFio() {
        return Fio;
    }

    public String GetDolgnost() {
        return Dolgnost;
    }

    public Talon CreateTalon() {
        Talon AdmissionDay = new Talon();
        AdmissionDay.SetTalon(this);
        return  AdmissionDay;
    }
    public Doctor(){};
}

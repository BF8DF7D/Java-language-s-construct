import java.util.Scanner;

public class Zadanie {
    public static void main(String[] arg) {

        Doctor medic = new Doctor();
        medic.SetDoctor();
        System.out.println();
        medic.PrintInfo();

        System.out.println();

        Disease prostud = new Disease();
        prostud.SetDisease();
        System.out.println();
        prostud.PrintInfo();

        System.out.println();

        Talon posesh = medic.CreateTalon();
        System.out.println();
        posesh.PrintInfo();

        System.out.println();

        Diagnosis diagn_one = new Diagnosis();
        diagn_one.SetDiagnosis(posesh, prostud);
        System.out.println();
        diagn_one.PrintInfo();

        System.out.println();

        Disease poisening = new Disease();
        poisening.SetDisease();

        System.out.println();

        Diagnosis diagn_two = new Diagnosis();
        diagn_two.SetDiagnosis(posesh, poisening);
        System.out.println();

        Pacient I = new Pacient();
        I.SetData();
        I.GiveDiagnosis(diagn_one);
        I.GiveDiagnosis(diagn_two);
        System.out.println();
        I.PrintInfo();
        I.DeleteDiagnosis(0);
        System.out.println();
        I.PrintInfo();
        System.out.println();

        System.out.println(" <Введите наименование искомого заболевания>\n <Остановка записи - сивол '0' в конце вводимой строки>");
        Scanner in = new Scanner(System.in);
        String Name_Disease;
        for (boolean flag = true; flag;) {
            System.out.print(" : ");
            Name_Disease = in.nextLine();
            if (Name_Disease.intern() == "0")
                flag = false;
            else if (I.DiseaseOfPacient(Name_Disease))
                System.out.printf("В диагнозе пациента есть \"%s\"\n", Name_Disease);
            else
                System.out.printf("В диагнозе пациента не числится \"%s\"\n", Name_Disease);

        }

        System.out.println();
        I.ClearHistoryDisease();
        I.PrintInfo();

        in.nextLine();
    }
}

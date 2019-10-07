import java.util.Scanner;

public class HitungPajak {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);

        double penghasilan;
        double pajak = 0;

        System.out.print("Masukan Penghasilan Anda:  ");
        penghasilan = inputuser.nextDouble();

        if (penghasilan <= 0) {
            System.out.println("Data Yang Dimasukan Tidak Falid");
        } else {
            if (penghasilan <= 1000000) {
                pajak = 0;

                if (penghasilan <= 500000) {
                    double bantuan = penghasilan * 50 / 100;
                    System.out.println("Anda Mendapakan Bantuan Sebesar " + bantuan);
                }

            } else if (penghasilan > 1000000 && penghasilan <= 5000000) {
                pajak = penghasilan * 10 / 100;
            } else if (penghasilan > 5000000 && penghasilan <= 15000000) {
                pajak = penghasilan * 15 / 100;
            } else {
                pajak = penghasilan * 18 / 100;

            }
            System.out.println("Pengahasilan Anda Adalah " + penghasilan + " Dan Anda Wajib Membayar Pajak Sebersar " + pajak);
        }

    }
}

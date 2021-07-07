import java.util.Scanner;

public class MainApp {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1 => Person");
            System.out.println("2 => Pendidikan");
            System.out.print("Masukkan Menu : ");
            int getMenu = scan.nextInt();
            switch (getMenu) {
                case 1:
                    Person person = new Person();
                    person.setFirstName("Erasmus");
                    person.setLastName("Tambing");
                    person.setDomisili("Makassar");
                    person.setTahunLahir(1997);
                    person.getProfile();
                    break;
                case 2:
                    // System.out.println("pendidikan");
                    Pendidikan pendidikan = new Pendidikan("SDN 116 Rantekasimpo", "SMPN 3 Makale", "SMAN 3 Makale", "Politeknik Negeri Ujung Pandang");
                    pendidikan.getPendidikan();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
            System.out.print("Ingin Melihat data lagi (Y/N) ? ");
            String cekMenu = scan.next();
            if (cekMenu.equalsIgnoreCase("N")) {
                menu = false;
            }else if(cekMenu.equalsIgnoreCase("Y")){
                menu = true;
            }else{
                // menu = true;
                System.exit(0);
            }
        }
    }
    
}
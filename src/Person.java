import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private String domisili;
    private int tahunLahir;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDomisili() {
        return domisili;
    }
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }
    public int getTahunLahir() {
        return tahunLahir;
    }
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    // buat constructor tanpa arguments
    public Person() {

    }

    public void getProfile() {
        int year = Year.now().getValue();
        System.out.println("BIODATA");
        System.out.println("Nama : "+ firstName +" "+ lastName);
        System.out.println("Alamat : " + domisili);
        System.out.println("Umur : " + (year - tahunLahir));
        
    }
}

package school;

public class Student {

    String name;
    int kehadiran;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiHarian;
    double nilaiAkhir;
    char grade;

    public Student(String name){
        this.name = name;
    }

    public void setUTS(double UTS){
        // range nilai (0-100)
    }
    public void setUAS(double UAS){
        // range nilai (0-100)
    }
    public void setHadir(int hadir){
        // maksimum kehadiran 18
    }
    public void setNilaiHarian(double harian){
        // range nilai (0-100)
    }
    public void hitungNilaiAkhir(){
        // kehadiran 10% dari nilai akhir
        // nilai harian 20% dari nilai akhir
        // nilai UTS 30% ari nilai akhir
        // nilai UAS 40% dari nilai akhir
    }
    public void setGrade(){
        // nilai >=85 grade A 
        // 75 >= nilai < 85 grade B
        // 65 >= nilai < 75 grade C 
        // 55 >= nilai < 65 grade D
        // nilai < 55 grade E
    }

    public void getReport(){
        // Nilainya ada yang 0 print error dan laporan tidak dicetak
        // print nama
        this.hitungNilaiAkhir();
        // print nilai akhir
        this.setGrade();
        // print grade

    }
}

package school;

public class Calculate {
    public static void main(String[] args) {
        Student studentA = new Student("Ari");
        // Student studentB = new Student("Rina");

        // Set Value 
        studentA.setHadir(17);
        studentA.setNilaiHarian(80);
        studentA.setUTS(120);
        studentA.setUAS(67);

        studentA.setHadir(16);
        studentA.setNilaiHarian(90);
        studentA.setUTS(77);
        studentA.setUAS(55);

        // Calculate and print value
        studentA.hitungNilaiAkhir();
        studentA.setGrade();
        studentA.getReport();
    }
}

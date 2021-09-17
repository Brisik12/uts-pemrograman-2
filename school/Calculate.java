package school;

public class Calculate {
    public static void main(String[] args) {
        Student studentA = new Student("Ari");
        Student studentB = new Student("Rina");

        // Set Value 
        studentA.setHadir(17);
        studentA.setNilaiHarian(80);
        studentA.setUTS(120);
        studentA.setUAS(67);

        studentB.setHadir(16);
        studentB.setNilaiHarian(90);
        studentB.setUTS(77);
        studentB.setUAS(55);

        // Calculate and print value
        studentA.getReport();
        studentB.getReport();
    }
}

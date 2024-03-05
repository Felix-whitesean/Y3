public class HospitalInformationSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(300, "John");
        Doctor salessio = new Doctor("Salessio", 305);
        Nurse nurse = new Nurse("Victor", 200);
        // patient1.printDetails();
        // salessio.printDetails();
        System.out.println(nurse.nurseId);
    }
}

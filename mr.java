public class mr {
    String patientId;
    String diagnosis;
    String treatment;
    String prescription;

    public mr(String patientId, String diagnosis, String treatment, String prescription) {
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "MedicalRecord [PatientID=" + patientId + ", Diagnosis=" + diagnosis + ", Treatment=" + treatment + ", Prescription=" + prescription + "]";
    }
}

    

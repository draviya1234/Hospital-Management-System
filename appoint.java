public class appoint {
        String appointmentId;
        String patientId;
        String doctorName;
        String date;
        String time;
    
        public appoint(String appointmentId, String patientId, String doctorName, String date, String time) {
            this.appointmentId = appointmentId;
            this.patientId = patientId;
            this.doctorName = doctorName;
            this.date = date;
            this.time = time;
        }
    
        @Override
        public String toString() {
            return "Appointment [AppointmentID=" + appointmentId + ", PatientID=" + patientId + ", Doctor=" + doctorName + ", Date=" + date + ", Time=" + time + "]";
        }
    }
    


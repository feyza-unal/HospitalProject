package hospital_project;

public class Patient {
    private String name;
    private String surname;
    private int patientID;
    private Situation patientSituation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Situation getPatientSituation() {
        return patientSituation;
    }

    public void setPatientSituation(Situation patientSituation) {
        this.patientSituation = patientSituation;
    }
}

package hospital_project;

import javax.print.Doc;

public class HospitalRunner {
    private static Hospital hospital1 = new Hospital();

    public static void main(String[] args) {

        String patientSituation = "Allergy";
        String title = doctorTitle(patientSituation);

        hospital1.setDoctor(findDoctor(title));

        System.out.println("Doctor name: "+hospital1.getDoctor().getName());
        System.out.println("Doctor surname : "+hospital1.getDoctor().getSurname());
        System.out.println("Doctor title : "+hospital1.getDoctor().getTitle());

    }
    private static Doctor findDoctor(String title) {
        Doctor doctor = new Doctor();

        for(int i = 0; i < hospital1.titles.length; i++ )
        {
            if(title.equals(hospital1.titles[i])) {
                doctor.setName(hospital1.doctorNames[i]);
                doctor.setSurname(hospital1.doctorSurnames[i]);
                doctor.setTitle(title);
            }
        }
        return doctor;

    }

    private static String doctorTitle(String actualSituation) {
        if (actualSituation.equals("Allergy")){
            return hospital1.titles[0];
        }else if(actualSituation.equals("Headache")){
            return hospital1.titles[1];
        }else if (actualSituation.equals("Diabetes")){
            return hospital1.titles[2];
        }else if (actualSituation.equals("Flu")){
            return hospital1.titles[3];
        }else if (actualSituation.equals("Migrain")){
            return hospital1.titles[4];
        }else if (actualSituation.equals("Cardiac Disease")){
            return hospital1.titles[5];
        }else return "invalid title";
    }
}

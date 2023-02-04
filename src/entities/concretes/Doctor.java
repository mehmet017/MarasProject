package entities.concretes;

import entities.abstracts.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Hospital {

    private Tittle tittle;
    private Branche branche;
    private DoctorSituation doctorSituation;
    private List<Doctor> doctorList = new ArrayList<>();


    public Doctor(String id, String name, String tcNo, int age, String gender, Tittle tittle, Branche branche, DoctorSituation doctorSituation) {
        super(id, name, tcNo, age, gender);
        this.tittle = tittle;
        this.branche = branche;
        this.doctorSituation = doctorSituation;
    }

    public Tittle getTittle() {
        return tittle;
    }

    public void setTittle(Tittle tittle) {
        this.tittle = tittle;
    }

    public Branche getBranche() {
        return branche;
    }

    public void setBranche(Branche branche) {
        this.branche = branche;
    }

    public DoctorSituation getDoctorSituation() {
        return doctorSituation;
    }

    public void setDoctorSituation(DoctorSituation doctorSituation) {
        this.doctorSituation = doctorSituation;
    }

    @Override
    public String toString() {
        return
                "adi: " +super.getName()+
                "TcNo: " +super.getTcNo()+
                "Cinsiyet: " +super.getGender()+
                "tittle: " + tittle +
                "branche: " + branche +
                "doctorSituation: " + doctorSituation ;
    }
    public void fillDoctorList(){
        Doctor doktor1 = new Doctor("DR1000","Mehmet KAYA","12345678901",36,"erkek",tittle.getTittleList().get(10),branche.getBrancheList().get(100),doctorSituation.getSituationList().get(20));
        Doctor doktor2 = new Doctor("DR1001","Sukru OZBEY","22345678901",36,"erkek",tittle.getTittleList().get(11),branche.getBrancheList().get(101),doctorSituation.getSituationList().get(21));
        Doctor doktor3 = new Doctor("DR1002","Elif TAS","32345678901",48,"kadin",tittle.getTittleList().get(12),branche.getBrancheList().get(102),doctorSituation.getSituationList().get(22));
        Doctor doktor4 = new Doctor("DR1003","Ayse BAS","42345678901",28,"Kadin",tittle.getTittleList().get(13),branche.getBrancheList().get(103),doctorSituation.getSituationList().get(23));
        Doctor doktor5 = new Doctor("DR1004","Okkes ACICI","52345678901",36,"erkek",tittle.getTittleList().get(14),branche.getBrancheList().get(104),doctorSituation.getSituationList().get(24));

    }
    

}

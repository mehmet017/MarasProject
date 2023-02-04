package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class DoctorSituation {

    private int id;
    private String situation;
    private List<DoctorSituation> situationList =new ArrayList<>();

    public DoctorSituation(int id, String situation) {
        this.id = id;
        this.situation = situation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public List<DoctorSituation> getSituationList() {
        return situationList;
    }

    public void setSituationList(List<DoctorSituation> situationList) {
        this.situationList = situationList;
    }

    @Override
    public String toString() {
        return  situation;
    }

    public void fillSituation(){
        DoctorSituation durum1 = new DoctorSituation(20,"Izinli");
        DoctorSituation durum2 = new DoctorSituation(21,"Ameliyatta");
        DoctorSituation durum3 = new DoctorSituation(22,"Uygun");
        DoctorSituation durum4 = new DoctorSituation(23,"Muayenede");
        situationList.add(durum1);
        situationList.add(durum2);
        situationList.add(durum3);
        situationList.add(durum4);

    }
}

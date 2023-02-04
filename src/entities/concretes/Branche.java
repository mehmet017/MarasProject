package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Branche {

    private int id;
    private String branche;
    private List<Branche> brancheList = new ArrayList<>();

    public Branche(int id, String branche) {
        this.id = id;
        this.branche = branche;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public List<Branche> getBrancheList() {
        return brancheList;
    }

    public void setBrancheList(List<Branche> brancheList) {
        this.brancheList = brancheList;
    }

    @Override
    public String toString() {
        return  branche;
    }
    public void fillBrancheList(){
        Branche brans1 = new Branche(100,"Dahiliye");
        Branche brans2 = new Branche(101,"Ortopedi");
        Branche brans3 = new Branche(102,"KBB");
        Branche brans4 = new Branche(103,"Genel Cerrahi");
        Branche brans5 = new Branche(104,"Goz Hastaliklari");
        Branche brans6 = new Branche(105,"Uroloji");
        Branche brans7 = new Branche(106,"Cocuk Hastaliklar");
        Branche brans8 = new Branche(107,"Cildiye");
        brancheList.add(brans1);
        brancheList.add(brans2);
        brancheList.add(brans3);
        brancheList.add(brans4);
        brancheList.add(brans5);
        brancheList.add(brans6);
        brancheList.add(brans7);
        brancheList.add(brans8);

    }
}

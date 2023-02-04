package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Tittle {

    private int id;
    private String tittle;
    private List<Tittle> tittleList = new ArrayList<>();
    public Tittle(int id, String tittle) {
        this.id = id;
        this.tittle = tittle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<Tittle> getTittleList() {
        return tittleList;
    }

    public void setTittleList(List<Tittle> tittleList) {
        this.tittleList = tittleList;
    }

    @Override
    public String toString() {
        return tittle;
    }

    public void fillTittle(){
        Tittle unvan1 = new Tittle(10,"Pratisyen");
        Tittle unvan2 = new Tittle(11,"Uzman");
        Tittle unvan3 = new Tittle(12,"Operator");
        Tittle unvan4 = new Tittle(13,"Yardimci Docent");
        Tittle unvan5 = new Tittle(14,"Docent");
        Tittle unvan6 = new Tittle(15,"Profesor");
        tittleList.add(unvan1);
        tittleList.add(unvan2);
        tittleList.add(unvan3);
        tittleList.add(unvan4);
        tittleList.add(unvan5);
        tittleList.add(unvan6);

    }


}

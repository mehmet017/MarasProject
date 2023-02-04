package entities.abstracts;

public abstract class Hospital {

    private String id;
    private String name;
    private String tcNo;
    private int age;
    private  String gender;

    public Hospital(String id, String name, String tcNo, int age,String gender) {
        this.id = id;
        this.name = name;
        this.tcNo = tcNo;
        this.age = age;
        this.gender=gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("Kadin")||gender.equalsIgnoreCase("k")){
            this.gender="K";
        }else if (gender.equalsIgnoreCase("Erkek")||gender.equalsIgnoreCase("e")){
            this.gender="E";
        }else {
            this.gender=null;
        }

    }
}

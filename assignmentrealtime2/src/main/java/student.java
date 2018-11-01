public class student {
    private int number;
    private double rtg;
    private String name, fidelId, fed, clubcity;

    public student(int num, String name, String fidelId, String fed, double rtg, String clubcity) {
        this.number = num;
        this.name = name;
        this.fidelId = fidelId;
        this.fed = fed;
        this.rtg = rtg;
        this.clubcity = clubcity;
    }
    public student(){
        super();
    }

    public int getNum() {
        return number;
    }

    public void setNum(int num) {
        this.number = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldId() {
        return fidelId;
    }

    public void setFieldId(String fieldId) {
        this.fidelId = fieldId;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String fed) {
        this.fed = fed;
    }

    public double getRtg() {
        return rtg;
    }

    public void setRtg(double rtg) {
        this.rtg = rtg;
    }

    public String getClub() {
        return clubcity;
    }

    public void setClub(String club) {
        this.clubcity = club;
    }
}
package DZ;

public class Sotr {
    private int tabnum;
    private String name;
    private String phone;
    private int st;

    public Sotr(int tabnum, String name, String phone, int st) {
        this.tabnum = tabnum;
        this.name = name;
        this.phone = phone;
        this.st = st;
    }

    public int getTabnum() {
        return tabnum;
    }

    public void setTabnum(int tabnum) {
        this.tabnum = tabnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "таб № - " + tabnum +
                ", имя - '" + name + '\'' +
                ", тел. - '" + phone + '\'' +
                ", стаж - " + st +
                '}';
    }
}

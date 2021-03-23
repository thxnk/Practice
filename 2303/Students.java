public class Students {
    private int id_Studenta;
    private String fam;
    private String name;
    private String group;
    private String department;
    private String discipline;
    private double mark;
    private String teacherName;

    public Students(int id_Studenta, String fam, String name, String group, String department) {
        this.id_Studenta = id_Studenta;
        this.fam = fam;
        this.name = name;
        this.group = group;
        this.department = department;
    }

    public int getId_Studenta() {
        return id_Studenta;
    }

    public void setId_Studenta(int id_Studenta) {
        this.id_Studenta = id_Studenta;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Students id: "+id_Studenta+", second name: "+fam+", name: "+name+", group:" + group+", department: "+ department+", discipline:" +discipline+", mark: "+mark+", name of teacher: "+teacherName;
    }
}

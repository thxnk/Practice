public class Students extends BookOfContacts{
    private String group;
    private String department;
    private String discipline;
    private double mark;
    private String teacherName;

    public Students(int id_Studenta ,String fam, String name, String group, String department) {
        super(name, fam);
        super.setId(id_Studenta);
        this.group = group;
        this.department = department;
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
        return "Students id: "+super.getId()+", second name: "+super.getLastName()+", name: "+super.getFirstName()+", group:" + group+", department: "+ department+", discipline:" +discipline+", mark: "+mark+", name of teacher: "+teacherName;
    }
}

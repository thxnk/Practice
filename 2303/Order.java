import java.util.Scanner;

public class Order {

    private int id;
    private String name;
    private String courier;
    private String dateTime;
    private int type;

    public Order(int id, String name, String courier) {
        this.id = id;
        this.name = name;
        this.courier = courier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if(type == 1  || type == 2) {
            this.type = type;
        }else {
            System.out.println("Не вірний тип замовлення, введіть вірний:");
            Scanner sc = new Scanner(System.in);
            setType(sc.nextInt());
        }
    }

    @Override
    public String toString(){
        return "Id of order: "+id+", name of order: "+name+", courier: "+courier+", date: "+dateTime+", type:"+type;
    }
}

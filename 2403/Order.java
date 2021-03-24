import java.util.Scanner;

public class Order extends BookOfContacts{
    private String courier;
    private String dateTime;
    private int type;

    public Order(int id,String name, String courier) {
        super(name);
        super.setId(id);
        this.courier = courier;
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
        return "Id of order: "+super.getId()+", name of order: "+super.getFirstName()+", courier: "+courier+", date: "+dateTime+", type:"+type;
    }
}

package Section12.Enum.entities;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order() {

    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;

    }

    public Date getMoment() {
        return moment;
    }

    public Integer getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String toString() {
        return "Order --- id: " + id + ", moment: " + moment + ", status: " + status;
    }

}

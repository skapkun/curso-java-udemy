package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status; 
	private Client client; 
	private List <OrderItem> orders = new ArrayList<>();
	public Order() {
		
	}
	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.orders = orders;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	} 
	public void addItem(OrderItem item) {
		orders.add(item);
	}
	public void removeItem(OrderItem item) {
		orders.remove(item);
	}
	public Double total () {
		double sum = 0.0; 
		for (OrderItem c : orders) {
			sum+=c.subTotal(); 
	
		}
		return sum; 
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Order moment: "+sdf.format(moment)+"\n");
		sb.append("Order Status: " +status+"\n");
		sb.append(client);
		sb.append("\nOrder items: "); 
		for (OrderItem x : orders) {
			sb.append("\n"+x);
		}
		sb.append("\nTotal price: $ "+String.format("%.2f",total()));
		return sb.toString();
	}
	
}

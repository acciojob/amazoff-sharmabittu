//package com.driver;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@Service
//public class OrderService {
//
//   // @Autowired
//    OrderRepository orderRepository=new OrderRepository();
//
//    public String addOrder(Order order){
//    return  orderRepository.addOrder(order);
//    }
//    public String addPartner(String id){
//        return orderRepository.addPartner(id);
//    }
//    public String addOrderPartnerPair(String orderId,String partnerId){
//        return orderRepository.addOrderPartnerPair(orderId,partnerId);
//    }
//    public Order getOrderById( String orderId){
//        return orderRepository.getOrderById(orderId);
//    }
//    public DeliveryPartner getPartnerById( String partnerId){
//        return orderRepository.getPartnerById(partnerId);
//    }
//    public  Integer getOrderCountByPartnerId( String partnerId){
//        return orderRepository.getOrderCountByPartnerId(partnerId);
//    }
//    public List<String> getOrdersByPartnerId(String partnerId) {
//        return orderRepository.getOrdersByPartnerId(partnerId);
//    }
//    public List<String> getAllOrder(){
//        return orderRepository.getAllOrder();
//    }
//    public Integer getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
//        return orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time,partnerId);
//    }
//    public String deletePartnerById(String partnerId) {
//        return orderRepository.deletePartnerById(partnerId);
//    }
//    public String deleteOrderById( String orderId) {
//        return orderRepository.deleteOrderById(orderId);
//    }
//    public String getLastDeliveryTimeByPartnerId( String partnerId) {
//       return orderRepository.getLastDeliveryTimeByPartnerId(partnerId);
//    }
//    public Integer getCountOfUnassignedOrders(){
//        return orderRepository.getCountOfUnassignedOrders();
//    }
//
//    }
//
//
//
package com.driver;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    // @Autowired
    OrderRepository orderRepository = new OrderRepository();

    public String addOrder(Order order) {
        String result = orderRepository.addOrder(order);
        return result;
    }

    public String addPartner(String partnerId) {
        String result = orderRepository.addPartner(partnerId);
        return result;
    }

    public String addOrderPartnerPair(String orderId, String partnerId) {

        // This is basically assigning that order to that partnerId
        String result = orderRepository.addOrderPartnerPair(orderId, partnerId);
        return result;
    }

    public Order getOrderById(String orderId) {
        // order should be returned with an orderId.
        Order result = orderRepository.getOrderById(orderId);
        return result;
    }

    public DeliveryPartner getPartnerById(String partnerId) {
        // deliveryPartner should contain the value given by partnerId
        DeliveryPartner result = orderRepository.getPartnerById(partnerId);
        return result;
    }

    public int getOrderCountByPartnerId(String partnerId) {
        // orderCount should denote the orders given by a partner-id
        int result = orderRepository.getOrderCountByPartnerId(partnerId);
        return result;
    }

    public List<String> getOrdersByPartnerId(String partnerId) {
        // orders should contain a list of orders by PartnerId
        List<String> result = orderRepository.getOrdersByPartnerId(partnerId);
        return result;
    }

    public List<String> getAllOrders() {
        // Get all orders
        List<String> result = orderRepository.getAllOrders();
        return result;
    }

    public int getCountOfUnassignedOrders() {
        // Count of orders that have not been assigned to any DeliveryPartner
        int countOfOrders = orderRepository.getCountOfUnassignedOrders();
        return countOfOrders;
    }

    public int getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
        // countOfOrders that are left after a particular time of a DeliveryPartner
        int countOfOrders = orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time, partnerId);
        return countOfOrders;
    }

    public String getLastDeliveryTimeByPartnerId(String partnerId) {
        // Return the time when that partnerId will deliver his last delivery order.
        String time = orderRepository.getLastDeliveryTimeByPartnerId(partnerId);
        return time;
    }

    public String deletePartnerById(String partnerId) {
        // Delete the partnerId
        // And push all his assigned orders to unassigned orders.
        String result = orderRepository.deletePartnerById(partnerId);
        return result;
    }

    public String deleteOrderById(String orderId) {
        // Delete an order and also
        // remove it from the assigned order of that partnerId
        String result = orderRepository.deleteOrderById(orderId);
        return result;
    }
}
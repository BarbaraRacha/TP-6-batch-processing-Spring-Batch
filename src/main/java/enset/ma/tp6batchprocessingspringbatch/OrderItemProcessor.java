package enset.ma.tp6batchprocessingspringbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class OrderItemProcessor implements ItemProcessor<Order, Order> {

    private static final Logger logger = LoggerFactory.getLogger(OrderItemProcessor.class);
    @Override
    public Order process(Order order) {
        // Appliquer une remise de 10% sur le montant
        Double newAmount = order.amount() * 0.9;
        Order newOrder = new Order(order.orderId(), order.customerName(), newAmount);
        logger.info("CustomerName: "+order.customerName()+"Montant initial: " + order.amount() + " Montant après remise: " + newAmount);
        return newOrder;
    }
}

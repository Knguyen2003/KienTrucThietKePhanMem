package com.iuh.test;

import com.iuh.context.OrderContext;
import com.iuh.state.State;
import com.iuh.stateImpl.CanceledOrder;
import com.iuh.stateImpl.CreateOrder;
import com.iuh.stateImpl.DeliveredOrder;
import com.iuh.stateImpl.ProcessingOrder;

public class Test {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        State createOrderState = new CreateOrder();
        State deliveredOrderState = new DeliveredOrder();
        State cancelOrderState = new CanceledOrder();
        State processingOrderState = new ProcessingOrder();

        orderContext.doAction();

        orderContext.setState(createOrderState);
        orderContext.doAction();

        orderContext.setState(processingOrderState);
        orderContext.doAction();

        orderContext.setState(deliveredOrderState);
        orderContext.doAction();

        orderContext.setState(cancelOrderState);
        orderContext.doAction();
    }
}

package AbsFactory.Pizzastore.order;

import AbsFactory.Pizzastore.pizza.BJCheesePizza;
import AbsFactory.Pizzastore.pizza.BJPepperPizza;
import AbsFactory.Pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{

    public Pizza createPizza(String orderType){
        System.out.println("使用的是抽象工厂模式哦");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}

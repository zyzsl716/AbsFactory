package AbsFactory.Pizzastore.order;


import AbsFactory.Pizzastore.pizza.LDCheesePizza;
import AbsFactory.Pizzastore.pizza.LDPepperPizza;
import AbsFactory.Pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory{

    public Pizza createPizza(String orderType){
        System.out.println("使用的是抽象工厂模式哦");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

package AbsFactory.Pizzastore.order;

import AbsFactory.Pizzastore.pizza.Pizza;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class OrderPizza {
    AbsFactory factory;
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }
    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do{
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订阅失败");
                break;
            }
        }while(true);
    }
    private String getType(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类：");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }

}

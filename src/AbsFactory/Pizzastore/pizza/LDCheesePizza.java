package AbsFactory.Pizzastore.pizza;

public class LDCheesePizza extends Pizza{
    public void prepare(){
        setName("伦敦的奶酪Pizza");
        System.out.println("伦敦的奶酪pizza 准备原材料");
    }
}

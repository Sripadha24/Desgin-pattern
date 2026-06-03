package strategy_desgin_pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();


        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyWithRocket());
        model.setQuackBehavior(new Quack());
        model.performFly();
        model.performQuack();
        model.display();
    }
}

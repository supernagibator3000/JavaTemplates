public class Main {
    public static void main(String[] args) {
        SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstance();

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
    }
}

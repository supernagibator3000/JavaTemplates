public class SingletonBillPugh {
    private SingletonBillPugh() {}

    private static class SingletonHolder {
        private final static SingletonBillPugh instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHolder.instance;
    }
}

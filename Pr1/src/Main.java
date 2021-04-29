public class Main {
    public static void main(String[] args) {
        String[] str = new Exercise().apply(new String[]{"qwerty", "asdfgh", "zxcvbn","ytrewq"});
        for (String s : str)
            System.out.println(s);
    }
}
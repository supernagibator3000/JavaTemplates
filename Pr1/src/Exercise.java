public class Exercise implements Function<String[], String[]>{
    @Override
    public String[] apply(String[] strings) {
        String[] out = new String[strings.length];

        for (int i = 0; i < strings.length; i++)
            out[i] = new StringBuilder(strings[i]).reverse().toString();

        return out;
    }
}
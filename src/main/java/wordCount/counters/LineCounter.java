package wordCount.counters;

public class LineCounter implements Counter {
    private int result = 0;

    @Override
    public void readLine(String line) {
        String [] array = line.split("\n");
        result = array.length;
    }

    @Override
    public int getResult() {
        return result;
    }
}

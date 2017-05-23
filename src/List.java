import java.util.ArrayList;

public abstract class List implements IList {

    private String name;
    private int maxLength;
    private ArrayList<String> tabText;
    private boolean unrolled;

    List(String name, int maxLength) {
        this.name = name;
        this.maxLength = maxLength;
        tabText = new ArrayList<>();
        unrolled = false;
    }

    @Override
    public void unroll() {
        unrolled = !unrolled;
    }

    @Override
    public String write() {
        StringBuilder builder = new StringBuilder(100);

        builder.append("List ");
        builder.append(name);
        builder.append(", unrolled: ");
        builder.append(unrolled);
        builder.append("\n");

        if(unrolled) {
            for (String text : tabText) {
                builder.append(text);
                builder.append("\n");
            }
        }

        return builder.toString();
    }

    @Override
    public void addToList(String t) {
        if(tabText.size() < maxLength)
            tabText.add(t);
        else
            throw new IndexOutOfBoundsException("List is full, cannot add more elements\n");
    }

    @Override
    public void removeFromList(int index) {
        tabText.remove(index);
    }

}

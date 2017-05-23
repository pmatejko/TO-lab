
public abstract class Button implements IButton {

    private int height;
    private int width;
    private String text;
    private boolean pressed;

    public Button(int h, int w, String t) {
        height = h;
        width = w;
        text = t;
        pressed = false;
    }

    @Override
    public void press() {
        pressed = !pressed;
    }

    @Override
    public String write() {
        StringBuilder builder = new StringBuilder();

        builder.append("Button ");
        builder.append(text);
        builder.append(", height: ");
        builder.append(height);
        builder.append(", width: ");
        builder.append(width);
        builder.append(", pressed: ");
        builder.append(pressed);
        builder.append("\n");

        return builder.toString();
    }
}

import java.util.ArrayList;

public abstract class Window implements IWindow {

    private int height;
    private int width;
    private ArrayList<IButton> buttons;
    private ArrayList<IList> lists;
    private boolean minimalized;

    public Window(int h, int w) {
        height = h;
        width = w;
        buttons = new ArrayList<>();
        lists = new ArrayList<>();
        minimalized = false;
    }

    @Override
    public void minimalize() {
        minimalized = !minimalized;
    }

    @Override
    public String write() {
        StringBuilder builder = new StringBuilder(  500);

        if(minimalized)
            builder.append("Window is minimalized\n");
        else {
            builder.append("Window size: ");
            builder.append(height);
            builder.append(" height / ");
            builder.append(width);
            builder.append(" width\n\n");

            for (IButton button : buttons) {
                builder.append(button.write());
                builder.append("\n");
            }

            for (IList list : lists) {
                builder.append(list.write());
                builder.append("\n");
            }
        }

        return builder.toString();
    }


    @Override
    public IButton addButton(IButton button) {
        buttons.add(button);
        return button;
    }

    @Override
    public IList addList(IList list) {
        lists.add(list);
        return list;
    }

}

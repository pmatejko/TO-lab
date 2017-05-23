
public interface IWindow {
    void minimalize();

    IButton addButton(int h, int w, String t);
    IButton addButton(IButton button);

    IList addList(String n, int mL);
    IList addList(IList list);

    String write();
}

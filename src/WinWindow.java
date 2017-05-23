
public class WinWindow extends Window {

    public WinWindow(int h, int w) {
        super(h, w);
    }

    @Override
    public String write() {
        return "Win" + super.write();
    }

    @Override
    public IButton addButton(IButton button) {
        if (button instanceof WinButton)
            return super.addButton(button);
        else
            throw new IllegalArgumentException("WinButtons are the only buttons that can be added to WinWindows\n");
    }

    @Override
    public IList addList(IList list) {
        if (list instanceof WinList)
            return super.addList(list);
        else
            throw new IllegalArgumentException("WinLists are the only lists that can be added to WinWindows\n");
    }

    @Override
    public IButton addButton(int h, int w, String t) {
        return super.addButton(new WinButton(h, w, t));
    }

    @Override
    public IList addList(String n, int mL) {
        return super.addList(new WinList(n, mL));
    }

}


public class LinuxWindow extends Window {

    public LinuxWindow(int h, int w) {
        super(h, w);
    }

    @Override
    public String write() {
        return "Linux" + super.write();
    }

    @Override
    public IButton addButton(IButton button) {
        if (button instanceof LinuxButton)
            return super.addButton(button);
        else
            throw new IllegalArgumentException("LinuxButtons are the only buttons that can be added to LinuxWindows\n");
    }

    @Override
    public IList addList(IList list) {
        if (list instanceof LinuxList)
            return super.addList(list);
        else
            throw new IllegalArgumentException("LinuxLists are the only lists that can be added to LinuxWindows\n");
    }

    @Override
    public IButton addButton(int h, int w, String t) {
        return super.addButton(new LinuxButton(h, w, t));
    }

    @Override
    public IList addList(String n, int mL) {
        return super.addList(new LinuxList(n, mL));
    }
}

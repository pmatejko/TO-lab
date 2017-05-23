
public class WinList extends List {

    WinList(String name, int maxLength) {
        super(name, maxLength);
    }

    @Override
    public String write() {
        return "Win" + super.write();
    }

}

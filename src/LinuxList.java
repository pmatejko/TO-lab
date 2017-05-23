
public class LinuxList extends List {

    LinuxList(String name, int maxLength) {
        super(name, maxLength);
    }

    @Override
    public String write() {
        return "Linux" + super.write();
    }

}

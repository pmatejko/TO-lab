
public class LinuxList extends List {

    public LinuxList(String name, int maxLength) {
        super(name, maxLength);
    }

    @Override
    public String write() {
        return "Linux" + super.write();
    }

}

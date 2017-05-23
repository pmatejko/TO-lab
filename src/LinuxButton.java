
public class LinuxButton extends Button {

    public LinuxButton(int h, int w, String t) {
        super(h, w, t);
    }

    @Override
    public String write() {
        return "Linux" + super.write();
    }

}

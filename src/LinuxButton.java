
public class LinuxButton extends Button {

    LinuxButton(int h, int w, String t) {
        super(h, w, t);
    }

    @Override
    public String write() {
        return "Linux" + super.write();
    }

}

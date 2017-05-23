
public class WinButton extends Button {

    public WinButton(int h, int w, String t) {
        super(h, w, t);
    }

    @Override
    public String write() {
        return "Win" + super.write();
    }

}

public class Main {

    public static void main(String[] args) {
        IWindow window = new WinWindow(100, 100);

        window.addButton(90, 90, "Akceptuj");
        window.addButton(90, 80, "Anuluj");

        IList l1 = window.addList("Opcje", 5);

        l1.addToList("opcja 1");
        l1.addToList("opcja 2");
        l1.addToList("opcja 3");
        l1.unroll();

        System.out.println(window.write());

        window.minimalize();
        System.out.println(window.write());

        //----------------------------------------------------

        IWindow window2 = new LinuxWindow(100, 100);

        window2.addButton(10, 10, "Accept");
        (window2.addButton(10, 20, "Cancel")).press();

        IList l2 = window2.addList("Options", 2);

        l2.addToList("option 1");
        l2.addToList("option 2");

        System.out.println(window2.write());
    }

}

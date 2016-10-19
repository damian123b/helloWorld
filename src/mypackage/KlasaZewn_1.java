package mypackage;

/**
 * Created by Damian on 2016-10-12.
 */
 class KlasaZewn_1 {

    private static int poleStatyczne;
    private int poleNiestatyczne;

    static class KlasaWewn {

        public void metodaWewn() {
            poleStatyczne++;
            System.out.println(poleStatyczne);
        }
    }
}

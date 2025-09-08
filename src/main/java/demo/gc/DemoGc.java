package demo.gc;

import java.lang.ref.Cleaner;

public class DemoGc {
    private static final Cleaner cleaner = Cleaner.create();

    public static class Resource implements Runnable {
        private final int id;

        public Resource(int id) {
            System.out.println("Registrando: " + id);
            this.id = id;
            cleaner.register(this, this);
        }

        @Override
        public void run() {
            System.out.println("Recurso " + id + " limpiado por el GC");
        }
    }

    // Aquí está el demo del GC
    public void runDemo() throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            new Resource(i);
        }
        System.out.println("Solicitando GC...");
        System.gc();
        Thread.sleep(2000);
        System.out.println("Fin del demo GC.");
    }
}

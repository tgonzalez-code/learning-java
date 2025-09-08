import demo.gc.DemoGc;

public class MainApplication {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello World!");

        //DemoCollectionsQueue demoCollectionsQueue = new DemoCollectionsQueue();
        //demoCollectionsQueue.demoQueue();

        //DemoCollections demoCollections = new DemoCollections();
        //demoCollections.demoCollections();

        new demo.gc.DemoGc().runDemo();
    }
}

public class Drum implements TheTool{
    int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("играет барабан, с размером - " + getSize());
    }
}
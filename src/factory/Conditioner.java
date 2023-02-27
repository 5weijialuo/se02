package factory;

//空调
public interface Conditioner {
    void create();
}


class HaiErConditioner implements Conditioner{
    @Override
    public void create() {
        System.out.println("HaiEr空调");
    }
}

class GeLiConditioner implements Conditioner{
    @Override
    public void create() {
        System.out.println("GeLi空调");
    }
}
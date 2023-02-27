package factory;

public class PartnerFactory {
    public static void main(String[] args) {
        /*生产冰箱*/
        CreateD createD=new MacheGeLi();
        Conditioner conditioner = createD.createConditioner();
        conditioner.create();

        CreateD createD1=new MacheHaiEr();
        Refrigerator refrigerator = createD1.createRefrigerator();
        refrigerator.pri("海尔");


        HaiErConditioner haiErConditioner = new HaiErConditioner();
        haiErConditioner.create();
    }
}


/*生产空调和冰箱的接口*/
interface CreateD{
    Conditioner createConditioner();
    Refrigerator createRefrigerator();
}

class MacheGeLi implements CreateD{

    @Override
    public Conditioner createConditioner() {
        return new GeLiConditioner();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new GeLiRefrigerator();
    }
}

class MacheHaiEr implements CreateD{

    @Override
    public Conditioner createConditioner() {
        return new HaiErConditioner();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new GeLiRefrigerator();
    }
}
package proxy;

public class Star implements Skill{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void chang() {
        System.out.println(name+"开始唱歌了!荔枝一点");
    }

    @Override
    public void rap() {
        System.out.println(name+"还会rap,讲点树枝");
    }

    @Override
    public void basketBall() {
        System.out.println(name+"会打篮球,进过美国校队!你干嘛,哎哟!");
    }
}

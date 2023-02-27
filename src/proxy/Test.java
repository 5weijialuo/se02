package proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Star cxk = new Star("菜虚坤");
        /*创建代理对象*/
        Skill skill=Stark.getProxy(cxk);
        skill.chang();//一旦代理关系形成,就会走代理路线,
        skill.rap();//对象的每个行为都由代理接管
        skill.basketBall();
    }
}

class Stark {
    /*
    * 代理对象
    *                                  ClassLoader loader,
                                       Class<?>[] interfaces,
                                       InvocationHandler h)
    * */
    public static Skill getProxy(Star star){

        return (Skill) Proxy.newProxyInstance(star.getClass().getClassLoader(),
                star.getClass().getInterfaces(), (proxy, method, args) -> {
                    /*应该可以理解为触发条件*/
                    System.out.println("条件满足,触发");
                    /*method表示真正触发对象的方法*/
                    Object invoke = method.invoke(star);
                    /*触发完毕后,就可以收回原对象*/
                    System.out.println("对象执行完毕,回归代理管理!");
                    return invoke;
                });
    }

}
package service.demo;

public class HelloServiceImpl implements Hello.Iface {
    public String helloString(String para) {
        return "result:" + para;
    }
}
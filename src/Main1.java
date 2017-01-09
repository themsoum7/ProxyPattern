public class Main1 {

    public static void main(String[] args){
        User user1 = new User("themsoum7", "blablabla");
        ProxyPattern proxy1 = new ProxyPattern(user1);
        proxy1.operations();

        User user2 = new User("noob", "lolito");
        ProxyPattern proxy2 = new ProxyPattern(user2);
        proxy2.operations();

        User user3 = new User("will.i.am", "burn'em");
        ProxyPattern proxy3 = new ProxyPattern(user2);
        proxy3.operations();
    }
}
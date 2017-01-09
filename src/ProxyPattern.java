public class ProxyPattern implements IOperations {
    private Operations operation;
    private User user;

    public ProxyPattern(User user) {
        this.user = user;
    }

    public void operations() {
        if(Permission()) {
            operation = new Operations();
            operation.operations();
        }
        else {
            System.out.println("Sry body, no permissions");
        }
    }

    private boolean Permission() {
        if(user.getName().equals("themsoum7") && user.getPass().equals("blablabla")) {
            return true;
        }
        else {
            return false;
        }
    }
}
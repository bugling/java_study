package self.nested.nested.ex1;

// Network 객체 안에서만 사용하도록 의도된 클래스
// 하지만 클래스가 따로 만들어져 있기 때문에 의도를 파악하기 어려움
public class NetworkMessage {

    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }

}

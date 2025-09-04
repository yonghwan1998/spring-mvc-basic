package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class IpPort {
    private String ip;
    private int post;

    public IpPort(String ip, int post) {
        this.ip = ip;
        this.post = post;
    }
}

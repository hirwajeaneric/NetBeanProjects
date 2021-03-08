
package domains;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class BookCategory implements Serializable {
    @Id
    private String code;
    @Column(unique = true)
    private String name;

    public BookCategory() {
    }

    public BookCategory(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

package xyz.txk.mybatis.test.pojo;

public class injection {
    private String id;
    private String name;
    private String value;

    @Override
    public String toString() {
        return "injection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public injection(String id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public injection() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

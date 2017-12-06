package cn.tac.test.ruleengine.drools.guide.pojo;

/**
 * @author tac
 * @since 06/12/2017
 */
public class Applicant {
    public Applicant(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.valid = true;
    }

    private String name;
    private Integer age;
    private Boolean valid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}

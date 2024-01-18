package gr.aueb.ch18.model;

public class AbstractEntity implements  IdentifiableEntity{

    private Long id;

    @Override
    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

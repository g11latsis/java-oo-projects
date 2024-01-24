package gr.aueb.ch19.model;

public class AbstractEntity implements IdentifiableEntity {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

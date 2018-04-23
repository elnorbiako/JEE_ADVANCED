package pl.coderslab.ex4;

import pl.coderslab.advanced.dao.simple.exercise.Group;
import pl.coderslab.advanced.dao.simple.exercise.Model;

public class User implements Model {
    /**
     * Column id
     */
    private Long id;
    /**
     * Column name
     */
    private String name;
    /**
     * Column group_id
     */
    private Group group;

    public User(String name, Group group) {
        this(null, name, group);
    }

    public User(Long id, String name, Group group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public User() {
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(long id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Long getGroupId() {
        return group.getId();
    }
}

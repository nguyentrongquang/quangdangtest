package com.example.mysql.model;

import javax.persistence.*;

@Entity
@Table(name = "new")
public class New extends Base {
    @Column(name = "tile")
    private String title;
    @Column(name = "thunbnail")
    private String thunbnail;
    @Column(name = "shortDescription")
    private String shortDescription;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Categories categories;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThunbnail() {
        return thunbnail;
    }

    public void setThunbnail(String thunbnail) {
        this.thunbnail = thunbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}

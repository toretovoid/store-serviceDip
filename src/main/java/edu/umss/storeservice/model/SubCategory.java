/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory extends ModelBase {
    private String name;
    private String code;
    @ManyToOne(optional = false)
    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

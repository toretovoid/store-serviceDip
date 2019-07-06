/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.model;

import javax.persistence.Entity;

@Entity
public class Feature extends ModelBase {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

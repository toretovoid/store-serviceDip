/**
 * @author: Harold C.
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ClientDto;

import javax.persistence.Entity;

@Entity
public class Client extends ModelBase<ClientDto> {

    private String firstName;
    private String lastName;
    private Integer phone;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
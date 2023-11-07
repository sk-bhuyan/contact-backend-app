package com.contactApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CONTACT_APP")
public class Contact {

    @Id
    @GeneratedValue
    private Integer contactId;
    private String contactName;
    private String contactEmail;
    private Long contactNum;

}

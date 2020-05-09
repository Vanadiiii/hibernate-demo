package com.evilcorp.hdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    UUID id = UUID.randomUUID();
}

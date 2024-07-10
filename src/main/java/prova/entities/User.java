package prova.entities;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "senai_user")
@UserDefinition
public class User extends PanacheEntity {
    @Username
    public String cpf;
    @Password
    public String password;
    @Roles
    public String role;


    public static void add(String cpf, String password, String role) {
        User user = new User();
        user.cpf = cpf;
        user.password = BcryptUtil.bcryptHash(password);
        user.role = role;
        user.persist();
    }
}

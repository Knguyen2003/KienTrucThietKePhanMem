package iuh.fit.se.userservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder  //buider pattern (tạo ra một đối tượng với các thuộc tính mà bạn muốn)
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "user_name"), //k trùng
        @UniqueConstraint(columnNames = "email")
})
public class User extends BaseEntity {
    @Id
    private String id;
    @Column(name = "user_name")
    private String userName;
    private String password;
    private String email;
    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH) //EAGER: load ngay lập tức, REFRESH: chỉ cập nhật entity từ database khi được gọi.
    @JoinTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}

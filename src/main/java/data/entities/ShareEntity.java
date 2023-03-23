package data.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class ShareEntity {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private UserEntity sender;
    private UserEntity receiver;

    public ShareEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getSender() {
        return sender;
    }

    public void setSender(UserEntity sender) {
        this.sender = sender;
    }

    public UserEntity getReceiver() {
        return receiver;
    }

    public void setReceiver(UserEntity receiver) {
        this.receiver = receiver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShareEntity)) return false;
        ShareEntity that = (ShareEntity) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "ShareEntity{" +
                "id=" + id +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}

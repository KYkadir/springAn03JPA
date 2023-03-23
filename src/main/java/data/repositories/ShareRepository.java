package data.repositories;

import data.entities.ShareEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareRepository extends JpaRepository<ShareEntity,Long> {
}

package example.scrumboard.infrastructure.jpa.repositories;

import example.ddd.infrastructure.GenericJpaRepository;
import example.ddd.infrastructure.JpaRepository;
import example.scrumboard.domain.backlogitem.BacklogItem;
import example.scrumboard.domain.backlogitem.BacklogItemId;
import example.scrumboard.domain.backlogitem.BacklogItemRepository;

@JpaRepository
public class JpaBacklogItemRepository extends GenericJpaRepository<BacklogItem, BacklogItemId> implements
		BacklogItemRepository {
}

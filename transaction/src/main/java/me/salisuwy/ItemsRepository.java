package me.salisuwy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemsRepository extends JpaRepository<Items, Integer>{
	@Query(value = "select * from qpd_items order by ItemName", nativeQuery = true)
	List<Items> findAllItems();
	
	@Query(value = "select * from qpd_items where ItemType LIKE '%Account%' order by ItemName", nativeQuery = true)
	List<Items> findAllAccountItems();
	
}

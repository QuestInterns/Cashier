package me.salisuwy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CashierRepository extends JpaRepository<Cashier, Integer> {

    // CUSTOM QUERY
    
//    @Query(value = "SELECT * from qpd_trans where id = 1", nativeQuery = true)
//    List<Blog> findCustomQuery();
	
	@Query(value = "SELECT CONCAT (f.LastName, ', ', f.FirstName, ' ', f.MiddleName) as fullname, f.*, t.* FROM qpd_patient f, qpd_trans t  WHERE f.PatientID = t.PatientID AND status = '1' ORDER BY t.TransactionDate DESC", nativeQuery = true)
	List<Cashier> findTransactionList();

	@Query(value = "SELECT * FROM qpd_patient f, qpd_trans t WHERE f.PatientID = t.PatientID and t.AN != '' ORDER BY t.TransactionID DESC", nativeQuery = true)
	List<Cashier> findHMOList();
	
	@Query(value = "select * from qpd_items order by ItemName", nativeQuery = true)
	List<Cashier> findAllItems();
	
	@Query(value = "select * from qpd_items where ItemType LIKE '%Account%' order by ItemName", nativeQuery = true)
	List<Cashier> findAllAccountItems();

	@Query(value = "select * from qpd_patient order by CreationDate", nativeQuery = true)
	List<Cashier> findAllPatients();
}

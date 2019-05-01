package qis.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;
    
    @PostMapping("/TransactionList")
    public Transaction create(@RequestBody Map<String, String> body){
    	try
    	{
	    	int patientId = Integer.parseInt(body.get("PatientID"));
	    	String transactionRef = body.get("TransactionRef");
	    	String transactionType = body.get("TransactionType");
	    	String biller = body.get("biller");
	    	String transactionDate = body.get("TransactionDate");
	    	int userId = Integer.parseInt(body.get("userID"));
	    	String totalPrice = body.get("TotalPrice");
	    	double paidIn = Double.parseDouble(body.get("PaidIn"));
	    	double paidOut = Double.parseDouble(body.get("PaidOut"));
	    	double grandTotal = Double.parseDouble(body.get("GrandTotal"));
	    	int status = Integer.parseInt(body.get("status"));
	    	String salesType = body.get("SalesType");
	    	String loe = body.get("LOE");
	    	String an = body.get("AN");
	    	String ac = body.get("AC");
	    	String notes = body.get("Notes");
	    	
	    	return transactionRepository.save(new Transaction(patientId, transactionRef, transactionType, biller, transactionDate, userId, totalPrice, paidIn, paidOut, grandTotal, status, salesType, loe, an, ac, notes));
    	}
    	catch(Exception ex) {return null;}
    }
    
//    @Autowired
//    ItemsRepository itemsRespository;
//
//
//    @GetMapping("/AllItems")
//    public List<Items> findAllItems()
//    {
//    	return itemsRespository.findAllItems();
//    }
//    
//    @GetMapping("/AccountItems")
//    public List<Items> findAllAccountItems()
//    {
//    	return itemsRespository.findAllAccountItems();
//    }
    
//    @GetMapping("/All")
//    public List<Cashier> findAll()
//    {
//    	return cashierRespository.findAll();
//    }
    
//    @GetMapping("/blog")
//    public List<Cashier> index(){
//        return cashierRespository.findAll();
//    }
//
//    @GetMapping("/blog/{id}")
//    public Cashier show(@PathVariable String id){
//        int blogId = Integer.parseInt(id);
//        return cashierRespository.findOne(blogId);
//    }
//
//    @PostMapping("/blog")
//    public Cashier create(@RequestBody Map<String, String> body){
//        String title = body.get("TransactionType");
//        String content = body.get("PatientID");
//        return cashierRespository.save(new Cashier(title, content));
//    }
//
//    @PutMapping("/blog/{id}")
//    public Cashier update(@PathVariable String id, @RequestBody Map<String, String> body){
//        int blogId = Integer.parseInt(id);
//        // getting blog
//        Cashier blog = cashierRespository.findOne(blogId);
//        //blog.setAsd(body.get("TransactionType"));
//        //blog.setContent(body.get("PatientID"));
//        return cashierRespository.save(blog);
//    }
//
//    @DeleteMapping("blog/{id}")
//    public boolean delete(@PathVariable String id){
//        int blogId = Integer.parseInt(id);
//        cashierRespository.delete(blogId);
//        return true;
//    }


}
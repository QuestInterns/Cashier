package me.salisuwy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CashierController {

    @Autowired
    CashierRepository cashierRespository;


    @GetMapping("/TransactionList")
    public List<Cashier> findTransactionList()
    {
    	return cashierRespository.findTransactionList();
    }
    
    @GetMapping("/HMOList")
    public List<Cashier> findHMOList()
    {
    	return cashierRespository.findHMOList();
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